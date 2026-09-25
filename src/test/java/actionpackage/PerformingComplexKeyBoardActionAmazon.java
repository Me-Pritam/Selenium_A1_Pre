package actionpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PerformingComplexKeyBoardActionAmazon
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");

            Actions actions = new Actions(driver);

            actions.pause(Duration.ofSeconds(2))
                    .keyDown(Keys.CONTROL)
                    .sendKeys("A")
                    .keyUp(Keys.CONTROL)
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
