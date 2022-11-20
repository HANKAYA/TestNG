package code.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BasePage {
    //2. @FindBy annotation to locate webElements.
    //		-> Using this FindBy annotation, help us to locate web elements.


    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordBox;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    private WebElement statusMessage;
    //encapsulation


    //3. Create methods related webelements

    public void loginSmartBear(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }

    public String getStatusMessage(){
        return statusMessage.getText();
    }


}
