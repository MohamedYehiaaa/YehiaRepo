import org.testng.annotations.Test;

public class OpenAppTest extends TestBase{

    LaunchAppPage launchObject;
    AmanPage amanObject;

    @Test(priority = '1')
    public void ruinApp(){

        launchObject = new LaunchAppPage(driver);
        launchObject.OpenAPp();
        launchObject.homeTab();
    }

    @Test(priority = '2')
    public void Aman(){

        amanObject = new AmanPage(driver);
        amanObject.amanEntryPage();
        }

    @Test(priority = '3')
    public void Aman_details(){

        amanObject.amanDetails("9000000161089326" , "50000");
        }
    }

