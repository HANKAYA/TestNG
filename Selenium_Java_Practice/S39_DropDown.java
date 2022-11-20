package Selenium_Java_Practice;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class S39_DropDown extends TestBase2 {
    @Test
    public void Test_DropDown (){
        DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement DropDown= DriverUtil.getDriver().findElement(By.id("countryDropdown"));
        DropDown.sendKeys("Canada");
        BrowserUtils.wait(3);
        DropDown.sendKeys(Keys.ARROW_DOWN);
        DropDown.sendKeys(Keys.ENTER);
    }
}
