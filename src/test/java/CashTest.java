import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CashTest extends TestBase{

    LaunchAppPage launchObject;
    CashPage CashObject;
    String Amt = "50000";

    @Test(priority = 3 , enabled = false)
    public void RunApp(){

        launchObject = new LaunchAppPage(driver);
        launchObject.OpenAPp();
        launchObject.homeTab();
    }

    @Test(priority = 4)
    public void scrollingtocash(){
        launchObject = new LaunchAppPage(driver);
       // launchObject.scc();
        launchObject.cashicon();

    }

    @Test(priority = 5)
    public void CashTrx(){

        CashObject = new CashPage(driver);
        CashObject.CashFeature(Amt);
        CashObject.CashPrint();
    }

    @Test(priority = 6)
    public void CashHomeScreen(){

        CashObject.CashHome();
        Assert.assertTrue(launchObject.WelcomeDiv.getText().contains("Welcome to Paymob services"));

    }
}
