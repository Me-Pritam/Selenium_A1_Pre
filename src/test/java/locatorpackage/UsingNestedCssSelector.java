package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNestedCssSelector
{
    public static void main(String[] args) {

        try{

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://demoqa.com/webtables");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("table.-striped.-highlight.table.table-striped.table-bordered.table-hover>tbody>tr:first-child>td:last-child span#delete-record-1"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
