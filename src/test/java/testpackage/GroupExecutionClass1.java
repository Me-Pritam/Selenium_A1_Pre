package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecutionClass1
{
    @Test(groups = "Integration")
    public void m1()
    {
        Reporter.log("This is method 1 form class 1",true);
    }

    @Test(groups = "Integration")
    public void m2()
    {
        Reporter.log("This is method 2 form class 1",true);
    }

    @Test(groups = "Integration")
    public void m3()
    {
        Reporter.log("This is method 3 form class 1",true);
    }
}
