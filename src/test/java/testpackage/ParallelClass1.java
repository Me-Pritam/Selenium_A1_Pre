package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pompackage.InventoryPagePOM;
import pompackage.LeftSideMenuPOM;
import pompackage.LogInPagePOM;
import pompackage.NavBarPOM;

import java.time.Duration;

public class ParallelClass1
{
    WebDriver driver;
    LogInPagePOM login;
    NavBarPOM navBar;
    LeftSideMenuPOM leftMenu;

    @Test
    public void openBrowser()
    {
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://www.saucedemo.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dependsOnMethods = "openBrowser")
    public void loadAllPages()
    {
        login = new LogInPagePOM(driver);
        navBar = new NavBarPOM(driver);
        leftMenu = new LeftSideMenuPOM(driver);
    }

    @Test(dependsOnMethods = "loadAllPages")
    public void doLogIn()
    {
        login.performLogIn("standard_user","secret_sauce");
    }

    @Test(dependsOnMethods = "doLogIn")
    public void doLogOut()
    {
        navBar.clickOnMenuIcon();
        leftMenu.clickOnLogOutLink();
    }
}
