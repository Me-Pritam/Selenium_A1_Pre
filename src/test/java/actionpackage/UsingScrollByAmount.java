package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingScrollByAmount
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

          WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Flags of the World']")));

          Actions action = new Actions(driver);

          action.pause(Duration.ofSeconds(2))
                  .scrollByAmount(0,3000)
                  .perform();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
