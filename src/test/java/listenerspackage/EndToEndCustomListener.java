package listenerspackage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.lang.reflect.Field;

public class EndToEndCustomListener implements ITestListener
{
    @Override
    public void onTestStart(ITestResult result)
    {
        Reporter.log(result.getMethod().getMethodName()+" ~~~~~~~ Test Method is started",true);
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        Reporter.log(result.getMethod().getMethodName()+" ~~~~~~~~ Test method is successful",true);
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        try
        {
            Object object= result.getInstance();

            Field field = object.getClass().getField("driver");

            field.setAccessible(true);

            WebDriver tDriver = (WebDriver) field.get(object);

            TakesScreenshot screenShot = (TakesScreenshot) tDriver;

            File tempFile = screenShot.getScreenshotAs(OutputType.FILE);

            File destFile = new File("./ScreenshotFolder/"+result.getMethod().getMethodName()+".png");

            FileHandler.copy(tempFile,destFile);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        Reporter.log(result.getMethod().getMethodName()+"~~~~~~~~ Test Method is Skipped",true);
    }

    @Override
    public void onStart(ITestContext context)
    {
        Reporter.log(context.getName()+" ~~~~~~~~~ Test Execution is started",true);
    }

    @Override
    public void onFinish(ITestContext context)
    {
        Reporter.log(context.getName()+" ~~~~~~~~~~ Test Execution is Finished",true);
    }
}
