package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingDataProvider
{
    @Test(dataProviderClass = dataproviderpackage.DataStorage.class,dataProvider = "ExcelDataReader")
    public void actionMethod(String username, String password)
    {
        Reporter.log(username+" ----> "+password,true);
    }
}
