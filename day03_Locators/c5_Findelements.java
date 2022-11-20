package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c5_Findelements {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        //3. Click to iPhone
        //4. Print out the texts of all links


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        //3.Click to Iphone by using child to Parent method
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();
        //4. Print out the texts of all links
        //print out all links
        //count of links that doesnt have text
        //count of links that has text
        //a tag has all the links
        //I am using tag name locator

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));


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
