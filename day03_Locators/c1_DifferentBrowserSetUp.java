package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c1_DifferentBrowserSetUp {
    public static void main(String[] args) {
        //firefox Browser setup
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver=new FirefoxDriver();
//        driver.get("https://www.google.com");

        //Edge Browser Setup
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");

    }
}
