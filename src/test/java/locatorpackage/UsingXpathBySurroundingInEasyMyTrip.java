package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySurroundingInEasyMyTrip
{
    public static void main(String[] args) {

       try
       {
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.easemytrip.com/");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//div[@id='dvfarecal']")).click();
           Thread.sleep(2000);
           while(true)
           {
               String monthNameBox =driver.findElement(By.xpath("//div[@class='month2']")).getText();
               System.out.println(monthNameBox);
               if (monthNameBox.equalsIgnoreCase("Feb 2027"))
               { driver.findElement(By.xpath("//div[@class='month2']/../..//li[text()='17']"))
                       .click();
                   break;
               }
               else{
                   Thread.sleep(2000);
                   driver.findElement(By.xpath("//img[@src='/img/nextarrow.png']"))
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
