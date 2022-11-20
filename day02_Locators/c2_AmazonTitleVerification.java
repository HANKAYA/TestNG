package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_AmazonTitleVerification {
    //Task - 2
    //Open Chrome Browser
    //Go to google
    //Navigate back
    //Navigate forward
    //Navigate to https://www.amazon.com
    //Verify title contains : Smile

    public static void main(String[] args) throws InterruptedException {
        //Open Chrome Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Go to google
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        //Navigate back
        driver.navigate().back();
        //navigate forward
        Thread.sleep(4000);
        driver.navigate().forward();
        //Navigate to https://www.amazon.com
        Thread.sleep(4000);
        driver.navigate().to("https://www.amazon.com");

        //Verify title contains : Smile

        String expectedTitleWord="Smile";
        String actualTitle=driver.getTitle();

        if(actualTitle.contains(expectedTitleWord)){
            System.out.println("Amazon title contains Smile and title verification has passed");
        }else {
            System.out.println("Amazon title does not contains Smile and title verification has failed");
        }
        System.out.println("Actual title is ="+actualTitle);
        driver.close();




    }

}
