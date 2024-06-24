import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase{
    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/userName_et")
    MobileElement UserNameElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/userPassword_et")
    MobileElement PasswordElement;

    @AndroidFindBy(id = "com.paymob.auc_coin.alpha:id/login_btn")
    MobileElement LoginElement;


    public void Login(String User , String Pass){

        setTextElement(UserNameElement , User);
        setTextElement(PasswordElement , Pass);
        clickbtn(LoginElement);
    }

}
