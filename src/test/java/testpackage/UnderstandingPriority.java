package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UnderstandingPriority
{
  @Test(priority = 1)
    public void logIn()
  {
      Reporter.log("LogIn is successful",true);
  }

  @Test(priority = 2)
    public void friendRequest()
  {
      Reporter.log("Friend Request is sent successfully",true);
  }

  @Test(priority = 3)
    public void getNotification()
  {
      Reporter.log("Notification is received",true);
  }
}
