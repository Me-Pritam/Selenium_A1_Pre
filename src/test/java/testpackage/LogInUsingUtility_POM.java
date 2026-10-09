package testpackage;

import org.openqa.selenium.WebDriver;
import pompackage.InventoryPagePOM;
import pompackage.LogInPagePOM;
import pompackage.NavBarPOM;
import pompackage.ProductPagePOM;
import utilitypackage.ActionsUtility;
import utilitypackage.BrowserUtility;
import utilitypackage.PropertyFileUtiltiy;

public class LogInUsingUtility_POM
{
    public static String browser;
    public static String url;
    public static String username;
    public static String password;
    public static String desiredProduct;

    public static BrowserUtility browserUtils;
    public static ActionsUtility actionsUtils;

    public static LogInPagePOM login;
    public static NavBarPOM navBar;
    public static InventoryPagePOM inventory;
    public static ProductPagePOM product;

    public static WebDriver driver;

    public static void main(String[] args) {

        try
        {
          browser = PropertyFileUtiltiy.getData("browser");
          url = PropertyFileUtiltiy.getData("url");
          username = PropertyFileUtiltiy.getData("username");
          password = PropertyFileUtiltiy.getData("password");
          desiredProduct = PropertyFileUtiltiy.getData("desiredProduct");

          browserUtils = new BrowserUtility();

          browserUtils.openBrowser(browser);
          browserUtils.maximizeBrowser();
          browserUtils.waitForPage(10);
          browserUtils.openUrl(url);
          browserUtils.waitForElement(10);

          driver = browserUtils.getDriver();

          login = new LogInPagePOM(driver);
          navBar = new NavBarPOM(driver);
          inventory = new InventoryPagePOM(driver);
          product = new ProductPagePOM(driver);

          login.performLogIn(username,password);
          inventory.selectDesiredProductByName(desiredProduct);
          product.clickOnAddToCartButton();
          navBar.clickOnCartIcon();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
