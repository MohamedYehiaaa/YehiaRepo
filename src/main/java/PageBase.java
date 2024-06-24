import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class PageBase {

    AppiumDriver driver;

    public PageBase(AppiumDriver appiumDriver){

        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;

    }


    public void waitForElement(MobileElement element){

        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

     public void clickbtn(MobileElement clickk){

        waitForElement(clickk);
        clickk.click();

    }

    public void setTextElement(MobileElement text , String value){

        waitForElement(text);
        text.sendKeys(value);
    }

    public void scroll(MobileElement tr)  {


        waitForElement(tr);
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.8);
        int scrollEnd = (int) (dimension.getHeight() * 0.1);

        AndroidTouchAction actions = new AndroidTouchAction(driver)
                .press(PointOption.point(0,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0,scrollEnd))
                .release()
                .perform();
    }
    protected List<MobileElement> waitElementLoaded(By mobileBy, int sec)
    {
        List<MobileElement> elements;
        long startTime = System.currentTimeMillis();
        do {
            elements = driver.findElements(mobileBy);
            if (elements.size() > 0)
                break;
        } while (System.currentTimeMillis() < startTime + sec * 1000);
        return elements;
    }
}
