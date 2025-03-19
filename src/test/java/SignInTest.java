import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends Base{
    SignInPage sign;
    @BeforeMethod

    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        sign = PageFactory.initElements(driver, SignInPage.class);
    }
    @Test
    void checkSignInButton() {
        boolean check = sign.isSignButtonEnabled();
        Assert.assertTrue(check);
    }
    @Test
    void checkEmailField() {
        boolean  visibility= sign.isEmailboxdisplayed();
        Assert.assertTrue(visibility);
    }
        @Test
        void testWithInvalidEmail(){
            sign.invalidEmail();
    }



    @AfterMethod
    void cleanUp(){
         clean();
    }

}

