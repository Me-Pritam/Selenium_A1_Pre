package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript
{
    public static void main(String[] args) {

        try
        {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(2000);

          String givenURL = "https://www.youtube.com/";

          driver.get(givenURL);

          Thread.sleep(2000);

            System.out.println(driver.getTitle());

            String actualURL = driver.getCurrentUrl();

            if (givenURL.equals(actualURL))
            {
                System.out.println("The Correct URL is opened");
            }
            else{

                System.out.println("Different URL is opened");
            }

            System.out.println(driver.getPageSource());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
