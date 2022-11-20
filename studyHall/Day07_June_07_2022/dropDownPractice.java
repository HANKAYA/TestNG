package code.studyHall.Day07_June_07_2022;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDownPractice {

    WebDriver driver;
    @Test
    public void TC_1_dropDown(){
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

        WebElement dropDown=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
        Select select= new Select(dropDown);
//        select.selectByIndex(2);

        for (int i=0; i<4; i++){

            select.selectByIndex(i);
            System.out.println(select.getOptions().get(i).getText());

        }


    }
}
