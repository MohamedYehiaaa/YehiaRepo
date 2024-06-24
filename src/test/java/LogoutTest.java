import org.testng.annotations.Test;

public class LogoutTest extends TestBase{

    LaunchAppPage launchObject;

    @Test(priority = 10)
    public void LogoutUser(){
        launchObject = new LaunchAppPage(driver);
        launchObject.Logout();

    }
}
