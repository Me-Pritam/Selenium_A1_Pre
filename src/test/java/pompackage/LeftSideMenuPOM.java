package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftSideMenuPOM
{
    @FindBy(xpath = "//a[text()='All Items']")
    private WebElement allItemsLink;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logOutLink;

    public LeftSideMenuPOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getAllItemsLink() {
        return allItemsLink;
    }

    public WebElement getLogOutLink() {
        return logOutLink;
    }

    public void clickOnLogOutLink()
    {
        getLogOutLink().click();
    }
}
