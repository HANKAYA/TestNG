package Selenium_Java_Practice;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class S31_Windows extends TestBase {

    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        // Click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.id("WindowsII")).click();
        // This will store current and only one window
        String currentWindow= driver.getWindowHandle();
        System.out.println("Current Window: " +currentWindow);
        System.out.println("Current Title : " +driver.getTitle());
        WebElement openWindowButton= driver.findElement(By.id("open-window"));
        openWindowButton.click();

        // After the click two windows will open
        // In order to work on second window, change focus of selenium on second window

        Set  <String> allWindows= driver.getWindowHandles(); // --> Store all the windows
        List <String> windowList= new ArrayList<>();
        for  (String NewWindow: allWindows){
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
            System.out.println("Current title is: " +driver.getTitle());
        }
        // Another method to switch windows
        driver.switchTo().window(windowList.get(1));
        System.out.println(driver.getTitle());
    }
}
