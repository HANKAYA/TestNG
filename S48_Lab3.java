package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S48_Lab3 {
    public void main(String[] args) throws InterruptedException {


    // TASK: Google search
    // 1- Open a Chrome browser
    // 2- Go to: https://google.com
    // 3- Write “apple” in search box
    // 4- Click google search button
    // 5- Verify title:
    // Expected: Title should start with "apple" word
    // 6-navigate back
    // 7-write cherry in search box
    // 8-verify title contains cherry.



    // TASK2: Google Feeling lucky button
    // 1- Open a Chrome browser
    // 2- Go to: https://google.com
    // 3- Write "apple" in search box
    // click I am feeling lucky button
    // Verify title contains Apple
    // Go to https://opensource-demo.orangehrmlive.com/
    // locate username and send username, (username=Admin)
    // locate user password and send password (password=admin123)
    // Click on the login button


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://google.com");
            WebElement SearchBox = driver.findElement(By.name("q"));
            Thread.sleep(2000);
            SearchBox.sendKeys("apple");
            Thread.sleep(2000);
            WebElement SearchButton = driver.findElement(By.name("btnK"));
            SearchButton.click();
            Thread.sleep(2000);
            String expectedTitle = "apple";
            String actualTitle = driver.getTitle();

            if (actualTitle.startsWith(expectedTitle)) {
                System.out.println("Verification has been passed");
            } else {
                System.out.println("Verification has been failed");
            }
            System.out.println("actual Title = " + actualTitle);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.findElement(By.name("q")).sendKeys("cherry");
            Thread.sleep(2000);
            driver.findElement(By.name("btnK")).click();
            String expectedTitle2 = "cherry";
            String actualTitle2 = driver.getTitle();

            if (actualTitle2.contains(expectedTitle2)) {
                System.out.println("Verification has been passed");
            } else {
                System.out.println("Verification has been failed");
            }
            System.out.println("actual Title2 = " + actualTitle2);

            // TASK2: Google Feeling lucky button
            // 1- Open a Chrome browser
            // 2- Go to: https://google.com
            // 3- Write "apple" in search box
            // click I am feeling lucky button
            // Verify title contains Apple
            // Go to https://opensource-demo.orangehrmlive.com/
            // locate username and send username, (username=Admin)
            // locate user password and send password (password=admin123)
            // Click on the login button

            driver.navigate().to("https://google.com");
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys("apple");
            Thread.sleep(200);
            driver.findElement(By.name("btnI")).click();
            String expectedTitle3 = "Apple";
            String actualTitle3 = driver.getTitle();

            if (actualTitle3.contains(expectedTitle3)) {
                System.out.println("Verification has been passed");
            } else {
                System.out.println("Verification has been failed");
            }
            System.out.println("actual Title3 = " + actualTitle3);

            driver.get("https://opensource-demo.orangehrmlive.com/");
            Thread.sleep(2000);

            driver.findElement(By.id("txtUsername")).sendKeys("Admin");

            Thread.sleep(2000);
            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            Thread.sleep(2000);
            driver.findElement(By.name("Submit")).click();

    }
}
