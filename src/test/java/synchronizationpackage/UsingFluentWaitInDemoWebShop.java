package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class UsingFluentWaitInDemoWebShop
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demowebshop.tricentis.com/");

            FluentWait<WebDriver> wait = new FluentWait(driver);
            wait.pollingEvery(Duration.ofSeconds(2));
            wait.withTimeout(Duration.ofSeconds(20));
            wait.ignoring(Exception.class);

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='top-menu']/descendant::a[@href='/books']")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Computing and Internet']")))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button-13']")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Shopping cart')]")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='removefromcart']")))
                    .click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='updatecart']")))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
