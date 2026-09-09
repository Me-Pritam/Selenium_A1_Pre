package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySorroundingInClearTrip
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.cleartrip.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[name()='svg' and @data-testid='closeIcon']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']"))
                    .click();

            Thread.sleep(2000);

            for(;;)
            {
                String monthName= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"))
                        .getText();

                if (monthName.equalsIgnoreCase("December 2026"))
                {
                    driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/..//div[text()='31']"))
                            .click();
                    break;
                }
                else{

                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']"))
                            .click();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
