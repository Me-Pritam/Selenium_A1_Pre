package testpackage;

import basepackage.AddingDesiredItemBaseClass;
import basepackage.ParallelMethodBaseClass;
import org.testng.annotations.Test;

public class ParallelMethodAddBagAndLightToCart extends ParallelMethodBaseClass
{
    @Test
    public void addBagToCart()
    {
        try
        {
            inventory.selectDesiredProductByName("Sauce Labs Backpack");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    @Test
    public void addLightToCart()
    {
        try
        {
            inventory.selectDesiredProductByName("Sauce Labs Bike Light");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
