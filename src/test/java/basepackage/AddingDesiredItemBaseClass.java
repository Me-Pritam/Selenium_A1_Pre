package basepackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pompackage.*;
import utilitypackage.ActionsUtility;
import utilitypackage.BrowserUtility;
import utilitypackage.PropertyFileUtility;

public class AddingDesiredItemBaseClass
{
    public String browser;
    public String desiredProduct;
    public String password;
    public String url;
    public String username;

    public BrowserUtility browserUtil;
    public ActionsUtility action;
    public PropertyFileUtility propertyFileUtility;

    public WebDriver driver;

    public LogInPagePOM login;
    public NavBarPOM navBar;
    public InventoryPagePOM inventory;
    public ProductPagePOM product;
    public CartPagePOM cart;

    @BeforeTest
    public void loadConfiguration()
    {
        try
        {
            propertyFileUtility = new PropertyFileUtility();

            browser = propertyFileUtility.getData("browser");
            url = propertyFileUtility.getData("url");
            username = propertyFileUtility.getData("username");
            password = propertyFileUtility.getData("password");
            desiredProduct = propertyFileUtility.getData("desiredProduct");
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

    @BeforeClass
    public void doConfiguration()
    {
        browserUtil = new BrowserUtility();

        browserUtil.openBrowser(browser);
        browserUtil.maximizeBrowser();
        browserUtil.waitForPage(10);
        browserUtil.openUrl(url);
        browserUtil.waitForElement(10);

        driver = browserUtil.getDriver();
    }

    @BeforeClass(dependsOnMethods = "doConfiguration")
    public void loadAllPages()
    {
        login = new LogInPagePOM(driver);
        navBar = new NavBarPOM(driver);
        inventory = new InventoryPagePOM(driver);
        product = new ProductPagePOM(driver);
        cart = new CartPagePOM(driver);

        login.performLogIn(username,password);
    }
}
