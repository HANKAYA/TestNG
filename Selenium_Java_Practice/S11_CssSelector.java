package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11_CssSelector {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        // "Css Selector" is faster than Xpath
        // 1st way ==> [ driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("bug spray");]
        // 2nd way ==> [ driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("cookie jar"); ]
        // 3rd way ==> (# means id in css)
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("TV");

    }
}
