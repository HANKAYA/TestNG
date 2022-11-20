package code.day10_Properties;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import code.utilities.PropertiesReadingUtil;
import code.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class c2_SmartBear extends TestBase {
    @Test
    public void TC1_CharlesDeleteVerification(){
        // Go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.loginForSmartBear(driver);
        // Click On belongs Charles Dodgeson
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        BrowserUtils.wait(5);
        // Click on Delete button
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
        List<WebElement> listOfNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid_']/tbody/tr/td[2]"));
        for(WebElement eachName:listOfNames){
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"), "Assertion failed Charles is still there");

        }
    }
}
