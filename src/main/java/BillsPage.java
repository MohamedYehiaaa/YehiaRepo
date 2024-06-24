import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.http.util.Asserts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillsPage extends PageBase{
    public BillsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.paymob.auc_coin.alpha:id/ivProviderImg\"])[2]")
    MobileElement VodafoneServiceElement;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.paymob.auc_coin.alpha:id/btnPay\"]")
    MobileElement PayButtonElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPayForService")
    MobileElement ConfirmButtonElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPrintReceipt")
    MobileElement DuplicateReceipt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Transaction done successfully\"]")
    MobileElement Div1;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.paymob.auc_coin.alpha:id/tvProviderName\" and @text=\"Orange [stg]\"]")
    MobileElement OrangeServiceElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/etInput")
    MobileElement PhoneNumberElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/etRechargeAmount")
    MobileElement BalanceElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPay")
    MobileElement ProceedElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPayForService")
    MobileElement CnfmElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPrintReceipt")
    MobileElement OrangePrintElement;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.paymob.auc_coin.alpha:id/tvProviderName\" and @text=\"Donations [stg]\"]")
    MobileElement DonationsElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.paymob.auc_coin.alpha:id/etInput\" and @text=\"Mobile Number\"]")
    MobileElement MobileNumberDonation;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.paymob.auc_coin.alpha:id/etInput\" and @text=\"Amount Field\"]")
    MobileElement AmountDonation;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPay")
    MobileElement ProceedDonation;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPayForService")
    MobileElement ConfirmDonation;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPrintReceipt")
    MobileElement PrintrcptDonation;
    public void BillTrx(){

        clickbtn(VodafoneServiceElement);
        clickbtn(PayButtonElement);
        clickbtn(ConfirmButtonElement);
        clickbtn(DuplicateReceipt);
        driver.navigate().back();

    }

    public void OrangeBill(String Number , String Balance){

        clickbtn(OrangeServiceElement);
        setTextElement(PhoneNumberElement , Number);
        setTextElement(BalanceElement , Balance);
        clickbtn(ProceedElement);
        clickbtn(CnfmElement);
        clickbtn(OrangePrintElement);
        driver.navigate().back();

    }

    public void DonationBill(String number , String Amnt){

        clickbtn(DonationsElement);
        setTextElement(MobileNumberDonation, number);
        setTextElement(AmountDonation,Amnt);
        clickbtn(ProceedDonation);
        clickbtn(ConfirmDonation);
        clickbtn(PrintrcptDonation);
        driver.navigate().back();
        driver.navigate().back();

    }

}
