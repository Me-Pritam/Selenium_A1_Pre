package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPagePOM
{
    @FindBy(xpath = "//div[@class='inventory_item']/descendant::div[@data-test='inventory-item-name']")
    private List<WebElement> allProductNames;

    public InventoryPagePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getAllProductNames() {
        return allProductNames;
    }

    public void selectDesiredProductByName(String desiredProductName)
    {
        for(WebElement productName : allProductNames)
        {
            if (productName.getText().equals(desiredProductName))
            {
                productName.click();
                break;
            }
        }
    }
}
