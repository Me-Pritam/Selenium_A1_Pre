package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingExplicitWaitInShopperStack
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://www.shoppersstack.com/");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
