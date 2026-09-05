package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingImplicitlyWait
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://www.youtube.com/");

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.findElement(By.xpath("//input[@name='search_query']"))
                 .sendKeys("Odimaga");

         driver.findElement(By.xpath("//button[@title='Search']"))
                 .click();


         driver.findElement(By.xpath("//a[contains(@aria-label,'Odimaga | Aavesham | Jithu Madhavan |Fahadh Faasil')]"))
                 .click();

         String comment = driver.findElement(By.xpath("(//*[@id='comment']/descendant::yt-attributed-string[@id='content-text'])[2]"))
                 .getText();

         System.out.println(comment);
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
