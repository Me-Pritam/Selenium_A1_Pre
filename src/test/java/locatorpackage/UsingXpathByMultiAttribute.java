package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByMultiAttribute
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.snapdeal.com/");

            Thread.sleep(4000);

            driver.findElement(By.xpath("(//img[contains(@class,'ExploreMoreProductsStyle') and contains(@src,'https://g.sdlcdn.com/imgs/')])[9]"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
