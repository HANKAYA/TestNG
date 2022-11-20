package Selenium_Java_Practice;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class S19_GoogleTestNG {
    //  Go to Google--> Search Macbook --> Verify Title

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // Go to Google
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }
    @Test
    public void TC1_GoogleTitleVerification(){
        System.out.println("TC1 is running");
        // Search "Macbook"
        WebElement searchBox= driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("macbook", Keys.ENTER);
        // Verify Title contain Macbook
        String actualTitle  = driver.getTitle();
        String expectedTitle= "macbook";
        boolean b= actualTitle.contains(expectedTitle);
        Assert.assertTrue(b,"Assertion failed, title doesn't contain macbook");
    }
    @AfterMethod
    public void closing(){
        driver.quit();
    }
}
