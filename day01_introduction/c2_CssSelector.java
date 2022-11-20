package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        //Css selector locator
        //faster than xpath
        //first way
        //driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("bug spray");
        //second way
        //driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("cookie jar");
        //third way (# means id in css)
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("TV");

    }
}