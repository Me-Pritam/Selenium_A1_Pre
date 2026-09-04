package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.name("search_query")).sendKeys("dude orchestral suite");

            Thread.sleep(2000);

            driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
