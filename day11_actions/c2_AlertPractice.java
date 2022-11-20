package code.day11_actions;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c2_AlertPractice extends TestBase2 {
/*
         Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
         Enter "hello word" text
         Click okay
         Validate your text appearing on the page
         */

    @Test
    public void AlertPractice(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");
        //click JavaScript Alerts
        WebElement jsAlertLink=DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
        jsAlertLink.click();
        //Click for Js Prompt
        WebElement JsPromptLink=DriverUtil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        JsPromptLink.click();

        //Enter "Hello World" text and Click okay
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("Hello World");
        BrowserUtils.wait(3);
        alert.accept();

        //Validate your text appearing on the page
        WebElement actualText=DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));

    }
}
