package testpackage;

import basepackage.AddingDesiredItemBaseClass;
import org.testng.annotations.Test;

public class AddingDesiredItemToCart extends AddingDesiredItemBaseClass
{

    @Test
    public void selectDesiredProduct()
    {
        inventory.selectDesiredProductByName(desiredProduct);
    }

    @Test(dependsOnMethods = "selectDesiredProduct")
    public void addProductToCart()
    {
        product.clickOnAddToCartButton();
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void goToCartPage()
    {
        navBar.clickOnCartIcon();
    }

    @Test(dependsOnMethods = "goToCartPage")
    public void continuePurchasing()
    {
        cart.clickOnCheckOutButton();
    }

}
