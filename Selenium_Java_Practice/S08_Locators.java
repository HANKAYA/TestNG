//package Selenium_Java_Practice;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class S08_Locators {
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.amazon.com");
//        // Find Search Box with ID Locator
//        // ID-Locator is always unix
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sneakers");
//        // To find by Xpath locator --> [ tagname[@attribute='value'] ]
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//    }
//}
