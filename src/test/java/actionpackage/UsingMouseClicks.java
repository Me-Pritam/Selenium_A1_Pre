package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingMouseClicks
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/buttons");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            action.click(driver.findElement(By.xpath("//button[text()='Click Me']")))
                    .pause(Duration.ofSeconds(1))
                    .contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']")))
                    .pause(Duration.ofSeconds(1))
                    .doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']")))
                    .perform();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
