package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.amazon.in/");

            Thread.sleep(2000);

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Vivo x300 Pro");

            Thread.sleep(2000);

            driver.findElement(By.id("nav-search-submit-button")).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
