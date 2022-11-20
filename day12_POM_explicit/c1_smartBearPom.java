package code.day12_POM_explicit;

import code.Pages.SmartBearLoginPage;
import code.base.TestBase2;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c1_smartBearPom extends TestBase2 {

    @Test
    public void TC1_SmartBearPositiveVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
            smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                    PropertiesReadingUtil.getProperties("SmartBear_password"));
        }



    }

