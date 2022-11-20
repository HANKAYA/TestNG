package Selenium_Java_Practice;

import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S37_DriverUtil extends TestBase2 {

    // Go to GooGle -> Search for " Hello " -> Verify title verification
    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox= DriverUtil.getDriver().findElement(By.name("q"));

        String searchItem= PropertiesReadingUtil.getProperties("google_search_data");
        searchBox.sendKeys(searchItem+ Keys.ENTER);
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
    }
}
