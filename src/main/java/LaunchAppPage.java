import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAccessibilityId;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.accessibility.Accessible;

public class LaunchAppPage extends PageBase{
    public LaunchAppPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
        @AndroidFindBy (accessibility = "Paymob")
        MobileElement splash;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/action_item1")
       MobileElement home;

       @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.paymob.auc_coin.alpha:id/textView_payment_method\" and @text=\"Transfers\"]")
      MobileElement transfer;

       @AndroidFindBy(xpath = "//android.widget.ScrollView")
       MobileElement scrollx;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/textView_payment_method1")
       MobileElement CashIcon;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/button9")
       MobileElement NotificationElement;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/textView_payment_method")
       MobileElement BillElement;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/welcome")
       MobileElement WelcomeDiv;

       @AndroidFindBy(accessibility = "Profile")
       MobileElement ProfileElement;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/btn")
       MobileElement LogoutElement;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/positive_btn_style_1")
       MobileElement SignoutElement;

       @AndroidFindBy(accessibility = "Card payment")
       MobileElement CardPaymenticon;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/button_2")
       MobileElement Digit1;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/button_0")
       MobileElement Digit2;

       @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/keyboard_proceed_btn")
       MobileElement PayElement;

       @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.pax.daemon:id/btn_three\"]")
       MobileElement PIN;

       @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.pax.daemon:id/btn_sure\"]")
       MobileElement ConfirmPIN;

       @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"com.paymob.auc_coin.alpha:id/constraint_background\"])[6]")
       MobileElement HalanIcon;

       @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"com.paymob.auc_coin.alpha:id/constraint_background\"])[7]")
       MobileElement History;


     // @AndroidFindBy(MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollintoview(text(\"Transfers\"))"
          //    MobileElement trans;

    public void OpenAPp() {

        clickbtn(splash);

    }
    public void homeTab() {

        clickbtn(home);
    }

 public void Apptransfer(){

    clickbtn(transfer);
 }

 public void scc() {

        scroll(scrollx);
 }

 public void cashicon(){

        clickbtn(CashIcon);
 }

 public void Notification(){

        clickbtn(NotificationElement);
 }

 public void Bills(){

        clickbtn(BillElement);
 }
 public void Card() {

     clickbtn(CardPaymenticon);
     clickbtn(Digit1);
     clickbtn(Digit1);
     clickbtn(Digit2);
     clickbtn(Digit2);
     clickbtn(PayElement);

 }
        public void CardPin() {

         clickbtn(PIN);
         clickbtn(PIN);
         clickbtn(PIN);
         clickbtn(PIN);
         clickbtn(ConfirmPIN);
     }



 public void Logout(){

        clickbtn(ProfileElement);
        scc();
        clickbtn(LogoutElement);
        clickbtn(SignoutElement);
 }

 public void Halan(){

        clickbtn(HalanIcon);
 }

 public void History(){

        clickbtn(History);
 }

}

