package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //find search box with id locator
        //Id locator is always unix
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sneakers");
        //to find byXpath locator    //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
