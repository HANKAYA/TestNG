package code.studyHall.Day05_June_02_2022;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class cheapFlights {
    WebDriver driver;
    @Test
    public void TC_1_verification(){
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.cheapflights.ca/");
       // driver.findElement(By.id("c4UgI-switch-display-status")).click();
        driver.findElement(By.className("wIIH-chevron")).click();
        List<WebElement> radiobuttons=driver.findElements(By.xpath("//li[@role='tab']"));
       cheapFlightsUtil.chooseTripType(radiobuttons,"One-way").click();
       //We created a method for below code which is chooseTriptype
//        for (WebElement each: radiobuttons){
//            System.out.println(each.getAttribute("aria-label"));
//            if (each.getAttribute("aria-label").contains("One-way")){
//                each.click();
//            }
//        }

        driver.findElement(By.className("S9tW-chevron")).click();//Passenger type
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement increaseAdultNumber=driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[1]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        increaseAdultNumber.click();

    }

}
