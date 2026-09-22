package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingDragAndDrop
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demo.automationtesting.in/Dynamic.html");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            WebElement srcElement = driver.findElement(By.xpath("//img[@id='angular']"));

            WebElement targetElement = driver.findElement(By.xpath("//div[@id='droparea']"));

            action.pause(Duration.ofSeconds(2)).dragAndDrop(srcElement,targetElement).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
