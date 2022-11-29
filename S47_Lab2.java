package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S47_Lab2 {

    // TC #1: Facebook title verification
    // TASK - 1
    // Open Chrome Browser
    // Go to https://www.facebook.com
    // Verify title: Expected: "Facebook - Log In or Sign Up"
    // Task - 2
    // Open Chrome Browser
    // Go to google
    // Navigate back
    // Navigate forward
    // Navigate to https://www.amazon.com
    // Verify title contains : Smile


    // TASK - 2
    // Go to https://www.etsy.com/
    // Maximize window
    // Verify title doesn't contain "Smile"
    // Verify Current Url
    // Go to https://www.amazon.com/
    // Verify title
    // Verify Current Url
    // Navigate Back
    // Refresh
    // Quit browser

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification has been passed");
        } else {
            System.out.println("Verification has been failed");
        }
        System.out.println("actual Title = " + actualTitle);
        System.out.println("expected Title = " + expectedTitle);
        System.out.println();

        //t2
        driver.get("https://www.google.com");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().to("https://www.amazon.com");
        String expectedTitle2 = "Smile";
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.contains(expectedTitle2)) {
            System.out.println("Verification has been passed");
        } else {
            System.out.println("Verification has been failed");
        }
        System.out.println("actual Title 2= " + actualTitle2);
        System.out.println("expected Title 2= " + expectedTitle2);
        System.out.println();

        //t22
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
        String expectedTitle3 = "Smile";
        String actualTitle3 = driver.getTitle();
        if (actualTitle3.contains(expectedTitle3)) {
            System.out.println("Verification has been passed");
        } else {
            System.out.println("Verification has been failed");
        }
        System.out.println("actual Title 3= " + actualTitle3);
        System.out.println("expected Title 3= " + expectedTitle3);
        System.out.println();
        driver.navigate().to("https://www.amazon.com");
        String actualTitle4 = driver.getTitle();
        System.out.println("actual Title 4= " + actualTitle4);
        System.out.println("Title has been verified");
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("CurrentUrl = " + CurrentUrl);
        System.out.println("Current Url has been verified");
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.quit();
    }
}
