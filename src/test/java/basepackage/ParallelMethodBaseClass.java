package basepackage;

import org.testng.annotations.BeforeMethod;
import pompackage.*;
import utilitypackage.BrowserUtility;
import utilitypackage.PropertyFileUtility;

public class ParallelMethodBaseClass
{
    public String browser;
    public String desiredProduct;
    public String password;
    public String url;
    public String username;

    public PropertyFileUtility property;
    public BrowserUtility browserUtils;

    public LogInPagePOM login;
    public NavBarPOM navbar;
    public InventoryPagePOM inventory;
    public CartPagePOM cart;
    public ProductPagePOM product;

    @BeforeMethod
    public void loadConfiguration()
    {
        try
        {
            property = new PropertyFileUtility();
            browser = property.getData("browser");
            url = property.getData("url");
            username = property.getData("username");
            password = property.getData("password");

            browserUtils = new BrowserUtility();

            browserUtils.openBrowser(browser);
            browserUtils.maximizeBrowser();
            browserUtils.waitForPage(10);
            browserUtils.openUrl(url);
            browserUtils.waitForElement(10);

            login = new LogInPagePOM(browserUtils.getDriver());
            navbar = new NavBarPOM(browserUtils.getDriver());
            inventory = new InventoryPagePOM(browserUtils.getDriver());
            product = new ProductPagePOM(browserUtils.getDriver());
            cart = new CartPagePOM(browserUtils.getDriver());

            login.performLogIn(username,password);

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
