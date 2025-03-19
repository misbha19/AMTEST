import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HyrAlertTest extends  Base{
    HyrAlert alt;

    @BeforeMethod
    void openBrowser() {
        setUp("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        alt = PageFactory.initElements(driver, HyrAlert.class);
    }

    @Test
    void testSimpleAlert() {
        alt.performsimpleAlert();
        String expectedText = "You selected alert popup";
        Assert.assertTrue(alt.outputBox.getText().contains(expectedText));

    }

    @Test
    void dismissConfirmationAlert() {
        alt.dismissingconfirmationAlert();
        String expectedText = "You pressed Cancel in confirmation popup";
        Assert.assertTrue(alt.outputBox.getText().contains(expectedText));
    }

    @Test
    void acceptConfirmationAlert() {
        alt.acceptingconfirmationAlert();
        String expectedCon = "You pressed OK in confirmation popup";
        Assert.assertTrue(alt.outputBox.getText().contains(expectedCon));
    }

    @AfterMethod
    void cleanUp() {
        clean();
    }

}



