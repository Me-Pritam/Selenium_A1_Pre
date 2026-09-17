package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetterMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://demowebshop.tricentis.com/");

          Thread.sleep(2000);

          WebElement registerLinkText = driver.findElement(By.xpath("//a[@href='/register']"));

          System.out.println("The Visible Text ~~~~~~ "+registerLinkText.getText());
          System.out.println("The Font Colour ~~~~~~ "+registerLinkText.getCssValue("color"));
          System.out.println("The Class Attribute Value ~~~~~~~ "+registerLinkText.getDomAttribute("class"));
          System.out.println("The Size of Link is ~~~~~~~ "+registerLinkText.getSize());
          System.out.println("The Position of the Link is ~~~~~ "+registerLinkText.getLocation());
          System.out.println("The Rectangular Dimension is ~~~~~~ "+registerLinkText.getRect().getDimension());

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
