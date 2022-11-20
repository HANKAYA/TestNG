//package Selenium_Java_Practice;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class S07_Locators {
//    public static void main(String[] args) {
//        // Open Chrome browser and go to google
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.manage().window().fullscreen();
//        driver.get("https://www.google.com");
//        // Click to Gmail link on the top right
//
//        // To find with LinkText Locator
//        // ==> [ driver.findElement(By.linkText("Gmail")).click(); ]
//
//        // To find with PartialLinkText Locator
//        // ==> [ driver.findElement(By.partialLinkText("Gm")).click(); ]
//
//        // To find by class name locator
//        driver.findElement(By.className("gb_d")).click();
//    }
//}
