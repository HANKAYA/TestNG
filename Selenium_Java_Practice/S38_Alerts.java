package Selenium_Java_Practice;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S38_Alerts extends TestBase2 {

    // Go to "http://the-internet.herokuapp.com/" -> Click JavaScript Alerts -> Click for Js Prompt
    // Enter "Hello World" text -> Click okay -> Validate your text appearing on the page

    @Test
    public void AlertPractice(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");
        // Click JavaScript Alerts
        WebElement JSAlertLink = DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
        JSAlertLink.click();
        // Click Java-Script Prompt
        WebElement JSPromptLink= DriverUtil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        JSPromptLink.click();

        // Enter "Hello World" text -> Click okay
        Alert alert            = DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("Hello World");
        BrowserUtils.wait(3);
        alert.accept();

        // Validate your text appearing on the page
        WebElement actualText  = DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));
    }
}
