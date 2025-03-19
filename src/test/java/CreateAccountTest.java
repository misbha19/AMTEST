import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends Base{
    CreateAccountPage create;
    @BeforeMethod

    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        create = PageFactory.initElements(driver, CreateAccountPage.class);
    }
    @Test
    void checkSignInButton() {
        boolean check = create.createAccountButtonEnabled();
        Assert.assertTrue(check);
    }

    @AfterMethod
    void cleanUp(){
        clean();
    }

}



