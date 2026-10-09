package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class NavBarPOM
{
    @FindBys({@FindBy(xpath = "//button[@id='react-burger-menu-btn']"),
              @FindBy(xpath = "//button[@type='button']")})
    private WebElement menuIcon;

    @FindBys({@FindBy(xpath = "//div[@id='shopping_cart_container']"),
              @FindBy(xpath = "//div[@class='shopping_cart_container']")})
    private WebElement cartIcon;

    @FindBy(xpath = "//span[@data-test='shopping-cart-badge']")
    private WebElement addedElementNumberContainer;

    public NavBarPOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    public void clickOnMenuIcon()
    {
        menuIcon.click();
    }

    public void clickOnCartIcon()
    {
        cartIcon.click();
    }

    public String getProductNumber()
    {
        return addedElementNumberContainer.getText();
    }
}
