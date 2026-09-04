package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.amazon.in/");

            Thread.sleep(4000);

            driver.findElement(By.linkText("Mobiles")).click();

            Thread.sleep(2000);

            driver.findElement(By.linkText("Mobile Accessorie"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
