package switchingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingToMultiPage
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.flipkart.com/");

            Thread.sleep(4000);

            driver.findElement(By.xpath("//span[text()='✕']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"))
                    .sendKeys("vivo mobiles");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products')]"))
                    .click();


            for(int i=1;i<=2;i++)
            {
                Thread.sleep(2000);
                driver.findElement(By.xpath("(//div[@class='jIjQ8S'])["+i+"]")).click();

            }

            Thread.sleep(2000);


            Set<String> allPageIds = driver.getWindowHandles();

            for(String pageId : allPageIds)
            {
                driver.switchTo().window(pageId);

                if (driver.getTitle().contains("vivo T5 Lite"))
                {
                    break;
                }
            }

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[text()='Buy with EMI']/ancestor::div[contains(@class,'_1psv1zeb9 _1psv1ze0 _7dzyg20')]/descendant::*[name()='svg']"))
                    .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
