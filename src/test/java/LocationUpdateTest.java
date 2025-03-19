import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocationUpdateTest extends Base {

    LocationUpdate location;

    @BeforeMethod
    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        location = PageFactory.initElements(driver, LocationUpdate.class);

    }
    @Test
        void checkUpdatedLocation () {
        location.updateTheLocation("11377");
        driver.navigate().refresh();
        String updatedLocationText = location.header.getText().trim();
        Assert.assertTrue(updatedLocationText.contains("Woodside 11377"));

    }

    @AfterMethod
    void cleanup(){

        clean();
    }

}
