
import org.testng.annotations.Test;

public class TransfersTest extends TestBase{

    LaunchAppPage launchObject;


    @Test(priority = '1')
    public void ruinApp(){

        launchObject = new LaunchAppPage(driver);
        launchObject.OpenAPp();
        launchObject.homeTab();
    }

    @Test(priority = '2')
    public void Transfers() {

     //   launchObject = new LaunchAppPage(driver);
        launchObject.scc();
        launchObject.Apptransfer();
    }

}
