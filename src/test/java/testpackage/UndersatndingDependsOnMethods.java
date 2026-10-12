package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UndersatndingDependsOnMethods
{
    @Test
    public void logIn()
    {
        Reporter.log("LogIn is successful",true);
    }

    @Test(dependsOnMethods = "logIn")
    public void searchProduct()
    {
        Reporter.log("The Product is searched",true);
    }

    @Test(dependsOnMethods = "searchProduct",priority = -1)
    public void addProductToCart()
    {
        Reporter.log("The Product is added to Cart",true);
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void goToCart()
    {
        Reporter.log("The Cart Page is opened",true);
    }

    @Test(dependsOnMethods = "goToCart")
    public void changeQuantity()
    {
        Reporter.log("The quantity is changed",true);
    }

    @Test(dependsOnMethods = "changeQuantity",enabled = false)
    public void purchaseProduct()
    {
        Reporter.log("The Product is purchased",true);
    }
}
