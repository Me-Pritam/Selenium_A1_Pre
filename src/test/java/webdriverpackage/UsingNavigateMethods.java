package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class UsingNavigateMethods
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(2000);

            driver.navigate().back();

            Thread.sleep(2000);

            driver.navigate().forward();

            Thread.sleep(2000);

            driver.navigate().to("https://www.amazon.in/");

            Thread.sleep(2000);

            driver.navigate().to(new URL("https://www.flipkart.com/"));



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
