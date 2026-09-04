package webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningEdgeDriver
{
    public static void main(String[] args)
    {
        try
        {
            System.setProperty("webdriver.edge.driver","./AllBrowserDrivers/msedgedriver.exe");
//            WebDriver driver = new EdgeDriver();

            WebDriver driver = new FirefoxDriver();

            driver.get("https://www.meesho.com/");

            Thread.sleep(2000);

            driver.manage().window().minimize();

            Thread.sleep(2000);

//            driver.manage().window().setSize(new Dimension(500,500));

            driver.manage().window().setPosition(new Point(850,0));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
