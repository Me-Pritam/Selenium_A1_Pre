package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FLipKartAutoSuggestion
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

         driver.get("https://www.flipkart.com/");

         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='✕']")))
                         .click();

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")))
                 .sendKeys("Hotwheels BMW");

       List<WebElement> allOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class,'VCplLH lTpUwR bRjjIF')]/descendant::div[contains(@class,'VDtK0l _1psv1ze2u')]")));

       for(WebElement option : allOptions)
       {
           if (option.getText().contains("hotwheels bmw"))
           {
               option.click();
               break;
           }
       }

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'QSCKDh dLgFEE')]/descendant::div[@class='nZIRY7']/descendant::div[@class='RGLWAk'])[2]")))
               .click();

     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
