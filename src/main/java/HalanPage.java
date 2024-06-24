import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.omg.CORBA.PUBLIC_MEMBER;

public class HalanPage extends PageBase{
    public HalanPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/etNationalId")
    MobileElement ClientCode;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/etAmountNumber")
    MobileElement Amount;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnNext")
    MobileElement Nextbtn;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.paymob.auc_coin.alpha:id/rvInstallment\"]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup")
    MobileElement Installment;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnNextScreen")
    MobileElement Next;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/etOtp")
    MobileElement OTP;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnConfirmTransaction")
    MobileElement Confirm;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnPrint")
    MobileElement Print;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnHome")
    MobileElement BackHome;


    public void ClientCodeChecking(String cli , String Amt){

        setTextElement(ClientCode, cli);
        setTextElement(Amount,Amt);
        clickbtn(Nextbtn);
    }

    public void InstallmentPlan(){

        clickbtn(Installment);
        clickbtn(Next);

    }

    public void ReviewTrx(String otp){

        setTextElement(OTP ,otp);
        clickbtn(Confirm);
    }

    public void TransactionDetails(){

        clickbtn(Print);
        clickbtn(BackHome);
    }



}
