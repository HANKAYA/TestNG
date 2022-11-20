package Selenium_Java_Practice;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class S12_ImplicitWait {
    public static void main(String[] args) {
        // Open Browser --> Go to the page https://www.vinexponewyork.com/ --> Click on attend button
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");

        // We are giving driver an option to wait until page loaded
        // As soon as your web-element loaded it will move on next step
        // It is not going to wait until 10 sn
        // If this was thread.sleep no matter it will always wait for 10 sn
        // Implicit wait will affect all code block where we use it

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Click on attend button
        driver.findElement(By.cssSelector("a[href='/attend/']")).click();
    }
}
