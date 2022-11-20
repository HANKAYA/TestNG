package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S01_FirstCode {
    public static void main(String[] args) {

                System.out.println("Hello World");
                // Setup Chrome Driver
                WebDriverManager.chromedriver().setup();
                // Create a driver instance
                WebDriver driver = new ChromeDriver();
                // Navigate to Chrome Browser
                driver.get("https://www.etsy.com/");
                // Navigate to Chrome browser
                driver.get("https://www.etsy.com/");
            }
    }

