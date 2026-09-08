package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByContainsInYoutube
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://www.youtube.com/");

         Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='search_query']"))
                 .sendKeys("kai vs brooklyn");

         Thread.sleep(2000);

         driver.findElement(By.xpath("//button[contains(@class,'SearchButton')]"))
                 .click();

         Thread.sleep(2000);

         driver.findElement(By.xpath("//a[contains(@aria-label,\"BEYBLADE GREVOLUTION EN Episode 47:\")]"))
                 .click();
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
