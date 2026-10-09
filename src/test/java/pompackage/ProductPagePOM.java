package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPagePOM
{
    @FindBy(xpath = "//button[@id='add-to-cart']")
    private WebElement addToCartButton;

    public ProductPagePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickOnAddToCartButton()
    {
        addToCartButton.click();
    }
}
