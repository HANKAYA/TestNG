package code.day13_ExplicitlyWait_ParallelTest;

import code.Pages.SeleniumPracticeHomePage;
import code.base.TestBase2;
import code.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_ExplicitlyWaitExamples extends TestBase2 {

//go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
// click on timer
// verify "WebDriver" text present

    @Test
    public void TC1_ExplicitlyWaitWithPOM(){
        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        SeleniumPracticeHomePage seleniumPracticeHomePage=new SeleniumPracticeHomePage();
        seleniumPracticeHomePage.clickTimerButton();
        seleniumPracticeHomePage.getDefaultText();
        // verify "WebDriver" text present
        String actualText=seleniumPracticeHomePage.getWebDriverText().getText();
        Assert.assertEquals(actualText,"WebDriver","WebDriver verification has failed!!!");

    }

}