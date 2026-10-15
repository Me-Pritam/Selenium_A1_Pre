package testpackage;

import basepackage.AddingDesiredItemBaseClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddingDesiredItemUsingSoftAssertion extends AddingDesiredItemBaseClass
{
    @Test

    public void purchaseDesiredItem()
    {
        SoftAssert sAssert = new SoftAssert();

        sAssert.assertNotEquals(browserUtil.getURL(),"https://www.saucedemo.com/inventory.html","Inventory Page is not opened");
        Reporter.log("The Inventory Page is opened",true);


        inventory.selectDesiredProductByName(desiredProduct);

        sAssert.assertTrue(browserUtil.getURL().contains("-item"),"The Product Page  has bug");
        Reporter.log("The URL contains of 'Item KeyWord'",true);


        sAssert.assertTrue(product.getAddToCartButton().isDisplayed(),"The cart Button is not displayed");
        Reporter.log("The Add-To-Cart Button is displayed",true);

        sAssert.assertTrue(navBar.getCartIcon().isDisplayed(),"The Cart Icon is not displayed");
        Reporter.log("The Cart Icon is displayed",true);

        navBar.clickOnCartIcon();

        sAssert.assertEquals(browserUtil.getURL(),"https://www.saucedemo.com/cart.html","The Cart Page is not opened");
        Reporter.log("The Cart Page is Opened",true);

        cart.clickOnCheckOutButton();

        sAssert.assertAll();
    }

}
