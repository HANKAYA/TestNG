package code.studyHall.Day06_June_03_2022;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class spiceJet {
    WebDriver driver;
    @Test
    public void TC_1_SearchFlight(){
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        WebElement destination=driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
        destination.click();

        WebElement chooseDestionation= driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[16]"));
        chooseDestionation.click();

        List<WebElement> calendar=driver.findElements(By.xpath("//div[contains(@data-testid, 'undefined-calendar-day')]"));
        int count=0;
        int month=2;
        String day="10";
        for (WebElement each : calendar){

            if(each.getAttribute("data-testid").contains(day)){
                count++;
            }
            if (count==month){
                each.click();
            }
        }

    }
}
