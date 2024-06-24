import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    @BeforeSuite
    public void Precond() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("PlatformName", "Android");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, caps);

    }

    @AfterSuite
    public void closeApp() {

           // if (null != driver) {
           // driver.terminateApp("com.paymob.auc_coin.alpha");
            driver.quit();

        }
        }


