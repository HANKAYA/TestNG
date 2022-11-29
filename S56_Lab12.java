package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class S56_Lab12 {
    // Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
    // Click on the "Try it" button //Enter Your name on the Alert Box and Accept alert
    // Verify that your name shown on the page //Click on the 'home sign' (it is on the left side of page)
    // Switch to second window tab //Click on the "log in" button
    // Enter your credentials //Enter the show password button //Switch to first tab

    WebDriver driver;
    @BeforeMethod
    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); }

    @AfterMethod
    public void closing() throws InterruptedException { Thread.sleep(1000); /* driver.quit(); */ }

    @Test
    // Click on the "Try it" button //Enter Your name on the Alert Box and Accept alert
    // Verify that your name shown on the page //Click on the 'home sign' (it is on the left side of page)
    // Switch to second window tab //Click on the "log in" button
    // Enter your credentials //Enter the show password button //Switch to first tab

    public void TC() throws InterruptedException {
        String name="Bora";
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.switchTo().frame("iframeResult");

        WebElement tryBut=driver.findElement(By.xpath("//button[text()='Try it']"));
        js.executeScript("arguments[0].click();",tryBut);

        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();
        String actualText= driver.findElement(By.id("demo")).getText();
        boolean condition=actualText.contains(name);
        Assert.assertEquals(condition,true,"Say MY NAME!!!! YOU GOD DAMN NOT RIGHT");
        System.out.println("Verification has been passed You GOD DAMN RIGHT");
        System.out.println("actual Text = '"+actualText+  "' contains, your name = "+name);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@title='w3schools.com Home']")).click();
        Set<String> windows=driver.getWindowHandles();
        List<String> windowlist=new ArrayList<>();
        for (String eachwindow:windows){
            windowlist.add(eachwindow);
            driver.switchTo().window(eachwindow);}


        driver.switchTo().window(windowlist.get(1));
        driver.findElement(By.xpath("//a[contains(@class,'w3-bar-item w3-btn w3-right')]")).click();
        driver.findElement(By.className("EmailInput_input_field__6t4Ux")).sendKeys("asdf");
        driver.findElement(By.name("current-password")).sendKeys("sdaf34");
        driver.findElement(By.className("PasswordInput_show_pwd_btn__Ncc9S")).click();
        Thread.sleep(2000);
        driver.switchTo().window(windowlist.get(0));

    }
}
