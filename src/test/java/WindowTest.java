import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowTest extends Base {
    WindowPage aWindow;

    @BeforeMethod
    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        aWindow = PageFactory.initElements(driver, WindowPage.class);
    }

    @Test
    void testnavigationtoHomepagefromHelp() {
        aWindow.checkHelpWindow();
        String expectedinUrl = "https://www.amazon.com/ref=nav_logo";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedinUrl));
    }

    @Test
    void testConditionsWindow() {
        aWindow.checkConditionsWindow();
        String expectedText2 = "Please read these conditions carefully";
        Assert.assertTrue(aWindow.conditionsPagebody.getText().contains(expectedText2));

    }

    @Test
    void testPrivacywindowLogo() {
        boolean footerLogo = aWindow.isPrivacyWindowfooterHasLogo();
        Assert.assertTrue(footerLogo);
    }

    @AfterMethod
    void cleanUp() {
        // clean();
    }

}

