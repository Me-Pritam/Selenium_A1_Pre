package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingImplicitWaitInYoutube
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.youtube.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("Godzilla minus zero");

            driver.findElement(By.xpath("//button[@title='Search']"))
                    .click();

            driver.findElement(By.xpath("//a[contains(@aria-label,'GODZILLA MINUS ZERO | Official 1.43:1 Trailer')]"))
                    .click();

            driver.manage().window().fullscreen();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
