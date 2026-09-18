package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class USingExplicitWaitInQTalk
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

         driver.get("https://chat.qspiders.com/");

         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")))
                 .sendKeys("john@gmail.com");

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")))
                 .sendKeys("Password@12345");

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")))
                 .click();

         String warningMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")))
                 .getText();

         System.out.println(warningMessage);
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
