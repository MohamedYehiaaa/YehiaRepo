import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class AmanPage extends PageBase {
    public AmanPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    //9000000161089326
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"com.paymob.auc_coin.alpha:id/constraint_background\"])[3]")
    MobileElement Amanlogo;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/etCardNumber")
    MobileElement cardNum;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/etAmount")
    MobileElement Amount;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btnConfirm")
    MobileElement confirm;


    public void amanEntryPage(){
        clickbtn(Amanlogo);
    }

    public void amanDetails(String cardnumber ,String Amnt ){

        setTextElement(cardNum , cardnumber);
        setTextElement(Amount,Amnt);
        clickbtn(confirm);
      //  waitElementLoaded(By.id("22"), 2);
    }

}
