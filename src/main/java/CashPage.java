import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CashPage extends PageBase{
    public CashPage(AppiumDriver appiumDriver) {
        super(appiumDriver);

    }
    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/amount")
    MobileElement CashAmountElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/submit")
    MobileElement CashSubmitElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/print")
    MobileElement CashPrintElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/main")
    MobileElement CashMainElement;

    public void CashFeature(String Amount){

        setTextElement(CashAmountElement , Amount);
        clickbtn(CashSubmitElement);
    }

    public void CashPrint(){

        clickbtn(CashPrintElement);
    }

    public void CashHome(){

        clickbtn(CashMainElement);
    }
}
