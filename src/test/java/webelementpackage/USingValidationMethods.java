package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class USingValidationMethods
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.instagram.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[.='Log in']"))
                            .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='pass']"))
                    .sendKeys("Password21234567");

            Thread.sleep(2000);

            WebElement logInButton = driver.findElement(By.xpath("//span[text()='Log in']"));
            WebElement eyeIcon = driver.findElement(By.xpath("//div[@aria-label='Show password']"));

            if (eyeIcon.isDisplayed())
            {
                System.out.println("The Eye Icon is displayed");
            }
            else System.out.println("The eyeIcon is not displayed");

            Thread.sleep(2000);

            driver.get("https://testkru.com/Elements/TextFields");

            Thread.sleep(8000);

            WebElement disabledInputField = driver.findElement(By.xpath("//input[@name='disabledField']"));

            if (disabledInputField.isEnabled())
            {
                System.out.println("The Check Box is enabled");
            }
            else{
                System.out.println("The Check Box is disabled");
            }

        }
        catch (Exception e)

        {
            e.printStackTrace();
        }

    }

}
