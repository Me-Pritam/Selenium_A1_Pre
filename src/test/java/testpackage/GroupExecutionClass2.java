package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecutionClass2
{
    @Test(groups = "System")
    public void m4()
    {
        Reporter.log("This is method 4 form class 2",true);
    }

    @Test(groups = {"Integration","System"})
    public void m5()
    {
        Reporter.log("This is method 5 form class 2",true);
    }

    @Test(groups = "System")
    public void m6()
    {
        Reporter.log("This is method 6 form class 2",true);
    }
}
