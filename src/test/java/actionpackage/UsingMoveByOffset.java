package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingMoveByOffset
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://excalidraw.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            action.click(driver.findElement(By.xpath("//button[@aria-label='Draw']")))
                    .pause(Duration.ofSeconds(1))
                    .moveByOffset(-60,80)
                    .clickAndHold()
                    .moveByOffset(600,0)
                    .pause(Duration.ofSeconds(1))
                    .release()
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
