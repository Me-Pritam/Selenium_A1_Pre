package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilitypackage.ActionsUtility;
import utilitypackage.BrowserUtility;
import utilitypackage.PropertyFileUtility;

public class LogInUsingUtility
{
    public static String username;
    public static String url;
    public static String password;
    public static String browser;

    public static WebDriver driver;

    public static BrowserUtility browserUtils;
    public static ActionsUtility actions;
    public static  PropertyFileUtility propertyFileUtility;

    public static void main(String[] args) {

        try
        {
            propertyFileUtility = new PropertyFileUtility();

           browser = propertyFileUtility.getData("browser");
           url = propertyFileUtility.getData("url");
           username = propertyFileUtility.getData("username");
           password = propertyFileUtility.getData("password");

           browserUtils = new BrowserUtility();

           browserUtils.openBrowser(browser);
           browserUtils.maximizeBrowser();
           browserUtils.waitForPage(10);
           browserUtils.openUrl(url);
           browserUtils.waitForElement(10);

           driver = browserUtils.getDriver();

           actions = new ActionsUtility(browserUtils.getDriver());

           WebElement userNameField = driver.findElement(By.xpath("//input[@id='user-name']"));
           WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
           WebElement logInButton = driver.findElement(By.xpath("//input[@id='login-button']"));


           actions.writeInInputField(userNameField,username);
           actions.writeInInputField(passwordField,password);
           actions.clickOnElement(logInButton);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
