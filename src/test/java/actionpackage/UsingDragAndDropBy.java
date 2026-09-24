package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingDragAndDropBy
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            WebElement srcElement = driver.findElement(By.xpath("//div[@id='draggable']"));

            action.dragAndDropBy(srcElement,0,100)
                    .pause(Duration.ofSeconds(1))
                    .dragAndDropBy(srcElement,60,40)
                    .pause(Duration.ofSeconds(1))
                    .dragAndDropBy(srcElement,-40,-50)
                    .pause(Duration.ofSeconds(1))
                    .dragAndDropBy(srcElement,60,40)
                    .pause(Duration.ofSeconds(1))
                    .dragAndDropBy(srcElement,-40,-50)
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
