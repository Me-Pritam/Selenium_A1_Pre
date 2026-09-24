package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingScrollToElement
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.snapdeal.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action  = new Actions(driver);

            action.pause(Duration.ofSeconds(4))
                    .scrollToElement(driver.findElement(By.xpath("//h4[text()='Snapdeal Business']")))
                    .pause(Duration.ofSeconds(2))
                    .click(driver.findElement(By.xpath("//button[.='View More']")))
                    .perform();



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
