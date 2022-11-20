package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02_BrowserNavigation{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        // Maximize browser page
        driver.manage().window().maximize();
        // To get title
        System.out.println("Title is: " +driver.getTitle());
        // To get current URL
        System.out.println("Current URL: " +driver.getCurrentUrl());
        // Static wait method,in order to wait until page loaded
        Thread.sleep(5000);
        driver.get("https://www.tesla.com/");
        // To get Title
        System.out.println("Title is: " +driver.getTitle());
        Thread.sleep(5000);
        // To get current URL
        System.out.println("Current URL: " +driver.getCurrentUrl());
        // To Close Browser page
        driver.close();
    }
}
