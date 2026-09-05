package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubetask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[name='search_query']"))
                    .sendKeys("Dude Orchestral Suite");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button[title='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("yt-formatted-string[aria-label*=\"Dude – Orchestral Suite\"]"))
                    .click();

            Thread.sleep(4000);

//            driver.manage().window().fullscreen();

            driver.findElement(By.cssSelector("button[aria-label*='Full screen keyboard']"))
                    .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
