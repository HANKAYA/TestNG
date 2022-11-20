package code.studyHall.Day08_June_08_2022;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//        Go to the above URL.
//        Get the current window's handle and write to the console window. It must be the first window handle.
//        Locate the "Visit W3Schools.com!" link and click it.
//        Get all window handles and hold them in a list.
//        Write to total window handle number to the console. It must be 2.
//        Switch t the second window.
//        Get the current window's handle and write to the console window. It must be a second window handle.
//        Check the upper left side logo in the second window.
//        Go back (Switch) to the first window.
//        Get the current window's handle and write to the console window. It must be the first window handle.
//        Check the See Run Button Text. It must contain "Run >" text.
public class w3schoolsWindowPractice {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

    }
    @Test
    public void TC_w3schoolWindowSwicth(){
        String currentWindowAtThisPoint=driver.getWindowHandle();
        System.out.println(currentWindowAtThisPoint);
        driver.switchTo().frame("iframeResult");
       WebElement link= driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']"));
        link.click();
        Set<String> allwindows=driver.getWindowHandles();
        System.out.println(allwindows.size());// this is will give us how many windows are open currently

        List<String> windowsList= new ArrayList<>();
        for(String eachWindow:allwindows){
            windowsList.add(eachWindow);
            driver.switchTo().window(eachWindow);
            System.out.println(driver.getTitle()+eachWindow+" is the current Title and Window ID");
        }

        WebElement logoOnSecondWindow=driver.findElement(By.xpath("//a[@title='Home']"));

        Assert.assertTrue(logoOnSecondWindow.isDisplayed());
        driver.switchTo().window(windowsList.get(0));

        System.out.println(currentWindowAtThisPoint);

        WebElement runButton=driver.findElement(By.xpath("//button[@id='runbtn']"));

        String expectedTextForRunButton="Run ❯";
        Assert.assertTrue(runButton.getText().contains(expectedTextForRunButton));



    }


}
