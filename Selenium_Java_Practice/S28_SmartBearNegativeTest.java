package Selenium_Java_Practice;

import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class S28_SmartBearNegativeTest {

    // 1- Open a Chrome browser
    // 2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    // 3- enter incorrect username
    // 4- enter wrong password
    // 5- click login button
    // 6- verify error message displayed :Invalid Login or Password.
    // Note : create another utils method under SmartBearUtil class called negativeLoginForSmartBear
    // this method should cover step3,4,5

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test(dataProvider ="testData")
    public void TC1NegativeTest(String userID,String passwordID){
        SmartBearUtils.negativeLoginForSmartBear(driver,userID,passwordID);

    }

    @DataProvider(name = "testData")
    public static Object[][] wrongUserCredentials(){

        return new Object[][]{
                {"Ali", "Can72"},
                {"Bora", "Aydogdu11"},
                {"Eyup", "CeaserKing"},
                {"Eda", "Ca22"},
                {"Tester", "test"}
        };
    }
}
