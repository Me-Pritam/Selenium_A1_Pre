package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActionsMethods
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://chat.qspiders.com/");

            Thread.sleep(2000);

            WebElement userNameField = driver.findElement(By.xpath("//input[@name='username']"));

            userNameField.sendKeys("john@gmail.com");

            Thread.sleep(2000);

            userNameField.clear();

            Thread.sleep(2000);

            WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));

            passwordField.sendKeys("Password@1234");

            Thread.sleep(2000);

            passwordField.click();

            Thread.sleep(2000);

            passwordField.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[text()='Login']"))
                    .submit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
