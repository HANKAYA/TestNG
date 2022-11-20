//package Selenium_Java_Practice;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class S05_GoogleNameLocator {
//
//    // T A S K  : Google search
//    // 1- Open a Chrome browser
//    // 2- Go to: https://google.com
//    // 3- Write “orange” in search box
//    // 4- Click google search button
//    // 5- Verify title:
//    // Expected: Title should start with “orange” word
//    // 6-navigate back
//    // 7-write banana in search box
//    // 8-verify title contains banana.
//
//    public static void main(String[] args) throws InterruptedException{
//        // 1- Open a Chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.manage().window().fullscreen();
//        // 2- Go to: https://google.com
//        driver.get("https://google.com");
//        // 3- Write “orange” in search box
//        // We find google search box element using name locator
//        WebElement searchBox= driver.findElement(By.name("q"));
//        searchBox.sendKeys("orange");
//        Thread.sleep(5000);
//        // 4- Click google search button
//        WebElement searchButton= driver.findElement(By.name("btnk"));
//        searchButton.click();
//        // 5- Verify title:
//        // Expected: Title should start with "orange" word
//        String expectedTitle= "orange";
//        String actualTitle  = driver.getTitle();
//        if (actualTitle.startsWith(expectedTitle)){
//            System.out.println("Title verification has passed");
//        }else {
//            System.out.println("Title verification has failed");
//        }
//        System.out.println("Actual title is: " +actualTitle);
//    }
//}
