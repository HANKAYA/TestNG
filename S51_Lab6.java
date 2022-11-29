package Selenium_Java_Practice;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class S51_Lab6 {
    // Go to http://demo.guru99.com/test/newtours/register.php
    // Click on country dropdown and select Barbados with Select Method
    // Use 3 different Select Method (visible text,index,value)
    // And switch to another countries as you wish

    public class lab06 {
        WebDriver driver = WebDriverUtil.getDriver("chrome");

        @BeforeMethod
        public void setup() {
            driver.get("http://demo.guru99.com/test/newtours/register.php");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void close() throws InterruptedException {
            // Thread.sleep(6000);
            driver.quit();
        }

        @Test
        public void TC1() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            System.out.println("TC1 is running");
            WebElement dropDownBox = driver.findElement(By.name("country"));
            dropDownBox.click();
            Select dropDown = new Select(dropDownBox);
            dropDown.selectByVisibleText("BARBADOS");
            System.out.println(dropDown.getFirstSelectedOption().getText());
            dropDown.selectByIndex(6);
            System.out.println(dropDown.getFirstSelectedOption().getText());
            dropDown.selectByValue("TURKEY");
            System.out.println(dropDown.getFirstSelectedOption().getText());
        }
    }
}
