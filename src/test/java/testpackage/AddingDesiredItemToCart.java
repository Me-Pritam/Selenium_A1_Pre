package testpackage;

import basepackage.AddingDesiredItemBaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddingDesiredItemToCart extends AddingDesiredItemBaseClass
{
    public WebDriver driver;

    @Test
    public void selectDesiredProduct()
    {
        this.driver = browserUtil.getDriver();

        Assert.assertEquals(browserUtil.getURL(),"https://www.saucedemo.com/inventory.html","Inventory Page is not opened");
        Reporter.log("The Inventory Page is opened",true);

        inventory.selectDesiredProductByName(desiredProduct);

//        Assert.fail("Failed Intensionally");
    }

    @Test(dependsOnMethods = "selectDesiredProduct")
    public void addProductToCart()
    {
        Assert.assertTrue(browserUtil.getURL().contains("-item"),"The Product Page  has bug");
        Reporter.log("The URL contains of 'Item KeyWord'",true);

        Assert.assertFalse(product.getAddToCartButton().isDisplayed(),"The cart Button is not displayed");
        Reporter.log("The Add-To-Cart Button is displayed",true);

        product.clickOnAddToCartButton();
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void goToCartPage()
    {
        Assert.assertTrue(navBar.getCartIcon().isDisplayed(),"The Cart Icon is not displayed");
        Reporter.log("The Cart Icon is displayed",true);

        navBar.clickOnCartIcon();
    }

    @Test(dependsOnMethods = "goToCartPage")
    public void continuePurchasing()
    {
        Assert.assertEquals(browserUtil.getURL(),"https://www.saucedemo.com/cart.html","The Cart Page is not opened");
        Reporter.log("The Cart Page is Opened",true);

        cart.clickOnCheckOutButton();
    }

}
