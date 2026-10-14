package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPagePOM
{
  @FindBy(xpath = "//div[@class='cart_item']")
    private List<WebElement> allAddedProductCards;


  @FindBy(xpath = "//button[text()='Checkout']")
    private WebElement checkOutButton;

  @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement continueShoppingButton;

  public CartPagePOM(WebDriver driver)
  {
      PageFactory.initElements(driver,this);
  }

    public List<WebElement> getAllAddedProducts() {
        return allAddedProductCards;
    }

    public WebElement getCheckOutButton() {
        return checkOutButton;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public void removeDesiredProductByName(String desiredProductName)
    {
        for(WebElement product : allAddedProductCards)
        {
            String productName = product.findElement(By.xpath("./descendant::div[@class='inventory_item_name']"))
                                        .getText();

            if (productName.equals(desiredProductName))
            {
                product.findElement(By.xpath("./descendant::button")).click();

                break;
            }

        }
    }

    public void clickOnCheckOutButton()
    {
        getCheckOutButton().click();
    }

    public void clickOnContinueShoppingButton()
    {
        getContinueShoppingButton().click();
    }

}
