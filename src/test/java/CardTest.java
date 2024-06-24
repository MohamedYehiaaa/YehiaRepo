import org.testng.annotations.Test;

public class CardTest extends TestBase{

    LaunchAppPage launchObject;

    @Test(priority = 1)
    public void CardTest(){

        launchObject = new LaunchAppPage(driver);
        launchObject.Card();
    }

    @Test(priority = 2)
    public void CardTestPIN(){

        launchObject.CardPin();
    }
}
