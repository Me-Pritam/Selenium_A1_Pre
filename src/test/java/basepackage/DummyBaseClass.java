package basepackage;

import org.testng.Reporter;
import org.testng.annotations.*;

public class DummyBaseClass
{
    @BeforeSuite
    public void beforeSuite()
    {
        Reporter.log("This is BeforeSuite",true);
    }

    @BeforeTest
    public void beforeTest()
    {
        Reporter.log("This is BeforeTest",true);
    }

    @BeforeClass
    public void beforeClass()
    {
        Reporter.log("This is BeforeClass",true);
    }

    @BeforeMethod
    public void beforeMethod()
    {
        Reporter.log("This is BeforeMethod",true);
    }

    @AfterMethod
    public void afterMethod()
    {
        Reporter.log("This is AfterMethod",true);
    }

    @AfterClass
    public void afterClass()
    {
        Reporter.log("This is AfterClass",true);
    }

    @AfterTest
    public void afterTest()
    {
        Reporter.log("This is AfterTest",true);
    }

    @AfterSuite
    public void afterSuite()
    {
        Reporter.log("This is AfterSuite",true);
    }
}
