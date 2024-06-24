import org.testng.annotations.Test;

public class HalanTest extends TestBase{

    LaunchAppPage launchObject;
    HalanPage halanObject;
    String ClientCode = "150010001939";
    String Amount = "50000";
    String otp = "000000";
    HistoryPage historyObject;

    String user = "01125977878";
    String pass = "Yehia@1111";

    @Test(priority = 1)
    public void HalanTrx(){
        launchObject = new LaunchAppPage(driver);
        halanObject = new HalanPage(driver);
        launchObject.Halan();
        halanObject.ClientCodeChecking(ClientCode, Amount);
        halanObject.InstallmentPlan();
        halanObject.ReviewTrx(otp);
        halanObject.TransactionDetails();
    }

    @Test(priority = 2)
    public void HalanRefund(){
        launchObject = new LaunchAppPage(driver);
        launchObject.homeTab();
        launchObject.scc();
        launchObject.History();
        historyObject = new HistoryPage(driver);
        historyObject.HalanRefund(user,pass,Amount,otp);
    }


}