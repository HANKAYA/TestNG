package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S03_AmazonTitleVerification {

    // Task -2 ==> Open Chrome Browser --> Go to GooGLe --> Navigate back --> Navigate forward -->
    // Navigate to https://www.amazon.com --> Verify title contains : Smile

    public static void main(String[] args) throws InterruptedException {
        // Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        // Go to GooGle
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // Navigate back
        driver.navigate().back();
        // Navigate forward
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(5000);

        // Verify title contains " Smile "
        String expectedTitleWord= "Smile";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleWord)){
            System.out.println("Amazon title contains Smile and title verification has passed");
        }else {
            System.out.println("Amazon title does not contains Smile and title verification has failed");
        }
        System.out.println("Actual title is: " +actualTitle);
        driver.close();

    }
}
