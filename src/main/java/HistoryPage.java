import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HistoryPage extends PageBase{
    public HistoryPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.paymob.auc_coin.alpha:id/recycler_view\"]/android.widget.RelativeLayout[1]")
    MobileElement RefundHalan;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/refund")
    MobileElement Refundbtn;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/Email")
    MobileElement UserName;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/Password")
    MobileElement Password;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/login")
    MobileElement confm;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/amount")
    MobileElement Amt;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/refund")
    MobileElement Refnd;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/pin")
    MobileElement Pin;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/confirm")
    MobileElement Confirm;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btn")
    MobileElement Printrcpt;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/main")
    MobileElement HomePage;

    public void HalanRefund(String user , String pass , String amount , String pin){

        clickbtn(RefundHalan);
        clickbtn(Refundbtn);
        setTextElement(UserName, user);
        setTextElement(Password ,pass);
        clickbtn(confm);
        setTextElement(Amt, amount);
        clickbtn(Refnd);
        setTextElement(Pin , pin);
        clickbtn(Confirm);
        clickbtn(Printrcpt);
        clickbtn(HomePage);


    }
}
