package webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingManageMethods
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.get("https://www.vivo.com/in");

            Thread.sleep(2000);

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.manage().window().fullscreen();

            Thread.sleep(2000);

//            driver.manage().window().minimize();

            System.out.println(driver.manage().window().getSize());


            driver.manage().window().setSize(new Dimension(500,500));

            Thread.sleep(2000);

            System.out.println(driver.manage().window().getSize());

            System.out.println(driver.manage().window().getPosition());

            driver.manage().window().setPosition(new Point(800,500));
            Thread.sleep(1000);

            driver.manage().window().setPosition(new Point(-200,100));
            Thread.sleep(1000);

            driver.manage().window().setPosition(new Point(400,500));
            Thread.sleep(1000);

            driver.manage().window().setPosition(new Point(-50,50));
            Thread.sleep(1000);


            System.out.println(driver.manage().window().getPosition());



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
