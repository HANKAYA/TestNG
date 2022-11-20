package Selenium_Java_Practice;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class S30_Tabs extends TestBase {

    //oop concept, inheritance method


    @Test
    public void TC1_TabHandle(){
        //navigate to https://renas-practice.herokuapp.com/home
        driver.get("https://renas-practice.herokuapp.com/home");
        // Click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on Windows
        BrowserUtils.wait(4);
        driver.findElement(By.id("WindowsII")).click();

        //this will store current and only one window
        String currentWindow= driver.getWindowHandle();

        System.out.println("current window= "+currentWindow);
        System.out.println("current title= "+driver.getTitle());

        WebElement openTabButton=driver.findElement(By.id("open-tab"));
        openTabButton.click();

        System.out.println("The current title"+driver.getTitle());

        Set<String> allTabs=driver.getWindowHandles(); // This will store all tabs
        for(String tab:allTabs){
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());
        }
    }
}
