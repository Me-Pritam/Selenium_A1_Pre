package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingXpathByAxes
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");

            Thread.sleep(4000);

            driver.findElement(By.xpath("//label[text()='First Name']/parent::div/descendant::input"))
                    .sendKeys("John");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//label[text()='Last Name']/parent::div/descendant::input"))
                    .sendKeys("Doe");

            Thread.sleep(2000);

            List<WebElement> allGenders = driver.findElements(By.xpath("//label[text()='Gender']/parent::div/descendant::label[@class='form-check-label']"));

            for(WebElement gender :allGenders)
            {
                if (gender.getText().contains("Female"))
                {
                    gender.click();
                    break;
                }
            }

            driver.findElement(By.xpath("//label[text()='Date']/parent::div/descendant::input"))
                    .sendKeys("31-12-2026");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
