package Selenium_Java_Practice;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class S52_Lab8 {

//    1)   Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//    2)   Enter Any Customer id.
//    3)   After entering the customer ID, Click on the “Submit” button.
//    4)   Reject/accept the alert.

    public class lab08 {
        WebDriver driver;

        @BeforeMethod
        public void setup() {
            driver = WebDriverUtil.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/test/delete_customer.php");

        }

        @AfterMethod
        public void closing() {

            BrowserUtils.wait(5);
            driver.quit();
        }

        @Test
        public void TC1() {
            driver.findElement(By.name("cusid")).sendKeys("Whatever");
            driver.findElement(By.xpath("//input[@name='submit']")).click();
            Alert alert = driver.switchTo().alert();
            BrowserUtils.wait(2);
            alert.accept();
            BrowserUtils.wait(2);
            alert.dismiss();
        }
           /* @DataProvider(name = "testData")
              public static object Credential{
              return new object
            }
         */
    }
}
