package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S46_Lab1 {

//    ##Task 1
//
//    Go to https://www.etsy.com/
//    Maximize window
//
//    ##Task 2
//    Go to https://www.amazon.com/
//    get title and print out

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
