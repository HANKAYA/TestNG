package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_locators {
    public static void main(String[] args) {
        //Open Chrome Browser and go to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //Click to Gmail link on the top right
        //to find with linkText locator
        //driver.findElement(By.linkText("Gmail")).click();

        //to find with PartialLinkText locator
        //driver.findElement(By.partialLinkText("Gm")).click();

        //to find by Classname locator
        driver.findElement(By.className("gb_d")).click();


    }
}
