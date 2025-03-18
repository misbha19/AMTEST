import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleFrameAndWindowTest extends Base {


    GoogleFrameAndWindow iGoogle;

    @BeforeMethod
    void openBrowser() {
        setUp2("https://www.google.com");
        driver.manage().window().maximize();
        iGoogle = PageFactory.initElements(driver, GoogleFrameAndWindow.class);
    }
        @Test
        void checkSignIn(){
            iGoogle.googleSignIn();
           String expectedinUrl="https://accounts.google.com/v3/signin/identifier?";
            Assert.assertTrue(driver.getCurrentUrl().contains(expectedinUrl));
        }

    @Test
    void verifyVisibletext() {
        iGoogle.checkingSignInfield();
        Assert.assertTrue(iGoogle.signInarea.isDisplayed());
        Assert.assertTrue(iGoogle.signInarea.getText().contains("with your Google Account. This account will be available to other Google apps in the browser."));

    }
    @Test
    void testSignInWithInvalidEmail() {
        iGoogle.invalidEmail();
        String expectedinUrl2="https://accounts.google.com/v3/signin/rejected?";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedinUrl2));
        Assert.assertTrue(iGoogle.nextPage.getText().contains("Couldn’t sign you in"));

    }

    @Test
    void testSignInWithValidEmail() {
        iGoogle.validEmail();
        String expectedinUrl3 = "https://accounts.google.com/v3/signin/rejected?";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedinUrl3));
        Assert.assertTrue(iGoogle.nextPage.getText().contains("This browser or app may not be secure."));
    }
    @AfterMethod
    void cleanUp(){
        //clean();
    }


}
