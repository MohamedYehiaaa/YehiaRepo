import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginObject;
    LaunchAppPage launchObject;
    String user = "01125977878";
    String pass = "Yehia@1111";


    @Test(priority = 1)
    public void ruinApp() {

        launchObject = new LaunchAppPage(driver);
        launchObject.OpenAPp();

    }
        @Test(priority = 2)
        public void LoginToApp () {

            loginObject = new LoginPage(driver);
            loginObject.Login(user, pass);
            launchObject.homeTab();
            launchObject.Notification();

        }
    }
