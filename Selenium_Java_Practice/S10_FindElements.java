package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class S10_FindElements {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome browser --> Go to https://www.apple.com --> Click to iPhone --> Print out the texts of all links

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        // Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        // Click to Iphone by using child to Parent method
        driver.findElement(By.xpath("//span[.='iPhone']/.."));
        // 4. Print out the texts of all  - print out all links - count of links that doesn't have text
        // Count of links that has text - a tag has all the links - I am using tag name locator
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        int linkWithText=0;
        int linkWithoutText=0;

        for(WebElement eachLink:allLinks){
            String elementtoText=eachLink.getText();
            System.out.println(elementtoText);


            if(elementtoText.isEmpty()){
                linkWithoutText++;
            }else {
                linkWithText++;
            }
        }
        System.out.println("link with text="+linkWithText);
        System.out.println("link without text="+linkWithoutText);
        System.out.println("all the link size"+allLinks.size());
    }
}
