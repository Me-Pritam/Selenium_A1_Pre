package switchingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class UsingSwitchToForSingleChild
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.amazon.in/");

            Thread.sleep(6000);

            String parentId = driver.getWindowHandle();

            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                    .sendKeys("beyblade metal fusion");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//h2[contains(@aria-label,'DZLING Metal Fusion Spinning Top Battle Set with High-Speed Launcher,')]"))
                    .click();

            Thread.sleep(2000);

            Set<String> allPageIds = driver.getWindowHandles();

            for(String pageId : allPageIds)
            {
                if (pageId.equals(parentId))
                {
                    continue;
                }
                else{
                    driver.switchTo().window(pageId);
                    break;
                }

            }

            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@id='submit.add-to-cart']/descendant::input"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
