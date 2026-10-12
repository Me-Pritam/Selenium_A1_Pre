package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingInvocationCount
{
    ArrayList<String> data = new ArrayList<>(List.of("John","Jimmy","Johnson","JSON","Jackson"));



//    final int i=5;

    @Test(invocationCount = 5)
    public void testMethod()
    {
        for(int i=0;i<data.size();i++)
        {
            Reporter.log(data.get(i),true);
        }
    }
}
