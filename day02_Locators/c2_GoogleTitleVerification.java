package code.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_GoogleTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //Task
        //1.Open Chrome Browser
        //2.Go to google
        //3.Verify title : Expected : Google


        //1.Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //another way to maximize web screen
        driver.manage().window().fullscreen();

        //2.Go to google
        Thread.sleep(2000);
        driver.get("https://www.google.com");

        //3.Verify title : Expected : Google

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification has passed");
        }else {
            System.out.println("Google title verification has failed");
        }

        System.out.println("actual title is="+actualTitle);
        driver.close();









    }
}
