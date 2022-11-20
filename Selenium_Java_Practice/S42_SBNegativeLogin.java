package Selenium_Java_Practice;

import code.Pages.SmartBearLoginPage;
import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S42_SBNegativeLogin extends TestBase2 {

    //enter invalid username and password for SmartBear
    //Verify that you get error message

    SmartBearLoginPage smartBearLoginPage;
    @Test
    public void TC1_Negative_Test_SmartBearLogin(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("InvalidUserName"),
                PropertiesReadingUtil.getProperties("InvalidPassword"));


        String expectedMessage="Invalid Login or Password.";
        String actualMessage=smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedMessage,actualMessage,"negative login verification has failed, user was able to login");


        //we extend TestBase2 with logic of inheritance
        //we create page class(POM)
        //we stored in the page web-elements and the methods
        //we created an object from the Page in order to call the methods
        //we navigate to the url
        //we retrieve credential from Conf.Properties, and we used in the method
    }

}
