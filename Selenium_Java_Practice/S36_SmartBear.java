package Selenium_Java_Practice;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import code.utilities.PropertiesReadingUtil;
import code.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class S36_SmartBear extends TestBase {

    // == I N H E R I T A N C E ==

    // Open Chrome browser --> Go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    // Click on box which belongs "charles DodgeSon" --> Click on delete button --> Verify if charles deleted from the list

    @Test
    public void TC1_CharlesDeleteVerification() {
        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.loginForSmartBear(driver);

        // Click on box which belongs "charles DodgeSon"
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        BrowserUtils.wait(4);
        // Click on delete button
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

        //verify if charles deleted from the list
        List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        //verify if charles there
        for (WebElement eachName : listOfNames) {
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"), "Assertion failed, Charles is still there");
        }
    }
}
