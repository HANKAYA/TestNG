package Selenium_Java_Practice;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class S26_Alerts {

    // 1- Open a Chrome browser --> 2- Go to:https://renas-practice.herokuapp.com/home
    // Click on elements --> Locate the alert button to click it --> Click button --> Handle alert

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        //1- Open a chrome browser
        //2- Go to:https://renas-practice.herokuapp.com/home
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://renas-practice.herokuapp.com/home");
    }
    @Test
    public void TC1_AlertPractice(){
        // Click on elements
        driver.findElement(By.id("selenium-Elements"));
        // Locate the alert button to click it
        driver.findElement(By.id("Alert BoxI")).click();
        // Click Button
        WebElement alertButton= driver.findElement(By.id("alert-demo"));
        alertButton.click();
        // Handle Alert
        // First switch the alert then handle it
        Alert alert= driver.switchTo().alert();
        BrowserUtils.wait(4);
        alert.accept();
        alertButton.click();
        BrowserUtils.wait(4);
        alert.dismiss();

    }
}
