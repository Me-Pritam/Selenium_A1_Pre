package testpackage;

import basepackage.DummyBaseClass;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingBaseAnnotation extends DummyBaseClass
{
    @Test
    public void testMethod()
    {
        Reporter.log("This is a Test Method",true);
    }
}
