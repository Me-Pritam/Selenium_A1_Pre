package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingCssForMultipleElements
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input.ytSearchboxComponentInput.yt-searchbox-input.title"))
                    .sendKeys("Odimaga");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button[title='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("yt-formatted-string[aria-label*='Odimaga | Aavesham | Jithu Madhavan |Fahadh Faasil']"))
                    .click();

            Thread.sleep(6000);

            List<WebElement> allComments = driver.findElements(By.cssSelector("div#comment-container yt-attributed-string#content-text"));

            for(WebElement comment : allComments)
            {
                System.out.println(comment.getText());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
