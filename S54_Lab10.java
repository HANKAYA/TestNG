package Selenium_Java_Practice;

import code.base.TestBase2;
import code.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S54_Lab10 {

    // Prerequisites= Create username and password for guru99
    // navigate to http://demo.guru99.com/V4/ //Login to Guru99 with username and password
    // Use JavaScript executer to click on login //Verify that you log in to page


    public class lab10 extends TestBase2 {

        String username = "Bora";
        String password = "canttouchthis";

        @Test
        public void TC1() {
            DriverUtil.getDriver().navigate().to("http://demo.guru99.com/V4/");
            DriverUtil.getDriver().findElement(By.name("uid")).sendKeys(username);
            DriverUtil.getDriver().findElement(By.name("password")).sendKeys(password);
            WebElement login = DriverUtil.getDriver().findElement(By.name("btnLogin"));
            JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
            js.executeScript("arguments[0].click();", login);
            String actualTitle = DriverUtil.getDriver().getTitle();
            String expectedTitle = "Guru99 Bank Manager HomePage";
            Assert.assertEquals(actualTitle, expectedTitle, "verification has been failed");
            System.out.println("verification has been passed");

                       /*
                          Alert alert=DriverUtil.getDriver().switchTo().alert();
                          String actualText=alert.getText();
                          String expectedText="User or Password is not valid";
                          System.out.println(actualText);
                          Assert.assertNotEquals(actualText,expectedText,"login failed"); */
        }
    }
}
