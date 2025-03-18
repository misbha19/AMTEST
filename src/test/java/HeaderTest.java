import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends  Base{
    HeaderPage aFrame;
    @BeforeMethod

    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        aFrame = PageFactory.initElements(driver, HeaderPage.class);

    }
    @Test
    void testFrame() {
        aFrame.checkFrame();
       Assert.assertTrue(aFrame.adsFrame.isEnabled());
    }

    @AfterMethod
    void cleanUp(){
        // clean();
    }


}
