package code.day08_Alert_Webtable_Iframe;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_Alerts {
    //1- Open a chrome browser
    //2- Go to:https://renas-practice.herokuapp.com/home
    //click on elements
    //locate the alert button to click it
    //click button
    //handle alert

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:https://renas-practice.herokuapp.com/home
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://renas-practice.herokuapp.com/home");

    }
    @Test
    public void TC1_Alert_practice(){
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //locate the alert button to click it
        driver.findElement(By.id("Alert BoxI")).click();
        //click button
        WebElement alertButton=driver.findElement(By.id("alert-demo"));
        alertButton.click();
        //handle alert
        //first switch to alert, then handle it
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(4);
        alert.accept();
        alertButton.click();
        BrowserUtils.wait(4);
        alert.dismiss();


    }
}