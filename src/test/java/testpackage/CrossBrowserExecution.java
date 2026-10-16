package testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pompackage.LogInPagePOM;
import utilitypackage.BrowserUtility;

public class CrossBrowserExecution
{
    BrowserUtility browserUtils;
    WebDriver driver;
    LogInPagePOM login;

    @Parameters("browser")
    @Test
    public void chooseBrowser(String browser)
    {
        browserUtils = new BrowserUtility();

        browserUtils.openBrowser(browser);
        browserUtils.waitForPage(10);
        browserUtils.openUrl("https://www.saucedemo.com/");
        driver = browserUtils.getDriver();
        login = new LogInPagePOM(driver);
        login.performLogIn("standard_user","secret_sauce");
    }
}
