package utilitypackage;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserUtility
{
    ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

    public void openBrowser(String browser)
    {
        switch (browser.toLowerCase())
        {
            case "chrome":

                tldriver.set(new ChromeDriver());
                break;

            case  "firefox":

                tldriver.set(new FirefoxDriver());
                break;

            case "edge":

                tldriver.set(new EdgeDriver());
                break;

            default: throw new InvalidArgumentException("invalid browser name");


        }
    }

    public WebDriver getDriver()
    {
        return tldriver.get();
    }

    public void openUrl(String url)
    {
        getDriver().get(url);
    }

    public void refreshBrowser()
    {
        getDriver().navigate().refresh();
    }

    public void maximizeBrowser()
    {
        getDriver().manage().window().maximize();
    }

    public void waitForPage(int time)
    {
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time));
    }

    public void waitForElement(int time)
    {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public String getURL()
    {
        return getDriver().getCurrentUrl();
    }

    public void closeBrowser()
    {
        if (getDriver()!=null)
        {
            getDriver().quit();
        }

        tldriver.remove();
    }
}
