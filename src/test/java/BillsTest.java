import org.testng.Assert;
import org.testng.annotations.Test;

public class BillsTest extends TestBase{

    LaunchAppPage launchObject;
    BillsPage billsObject;
    String number = "0126655878";
    String balance = "50";

    @Test(priority = 7)
    public void VodafoneBills(){

        launchObject = new LaunchAppPage(driver);
        billsObject = new BillsPage(driver);
        launchObject.Bills();
        billsObject.BillTrx();
        //Assert.assertTrue(billsObject.Div1.getText().contains("Transaction done successfully"));

    }

    @Test(priority = 8)
    public void OrangeBills(){

        launchObject = new LaunchAppPage(driver);
        launchObject.scc();
        billsObject.OrangeBill(number , balance);
    }

    @Test(priority = 9)
    public void DonationBill(){

        billsObject.DonationBill(number, balance);
    }
}
