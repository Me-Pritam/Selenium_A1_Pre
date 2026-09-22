package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingClickAndHoldMethod
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

         driver.get("https://yonobusiness.sbi.bank.in/");

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

         wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//a[@role='button' and contains(@class,'ng-tns-c2785778308-3')]"))))
                 .click();

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Login']")))
                 .click();

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='loginOfmenu']")))
                         .click();

         wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//input[@aria-label='PASSWORD']"))));

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='PASSWORD']")))
                 .sendKeys("Password@12345");

         Actions action  = new Actions(driver);

         action.clickAndHold(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/img/Revamp/icon_eye_close.svg']"))))
                 .pause(Duration.ofSeconds(2))
                 .release()
                 .perform();
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
