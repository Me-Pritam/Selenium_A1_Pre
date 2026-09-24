package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingMoveToElement
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.myntra.com");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          WebElement targetElement = driver.findElement(By.xpath("//a[@href='/shop/kids']"));

          Actions action = new Actions(driver);

          action.moveToElement(targetElement).perform();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
