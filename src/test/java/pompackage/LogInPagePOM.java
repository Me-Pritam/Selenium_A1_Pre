package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPagePOM
{

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement logInButton;


    public LogInPagePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getUserNameField() {
        return userNameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public void performLogIn(String username, String password)
    {
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        logInButton.click();
    }
}
