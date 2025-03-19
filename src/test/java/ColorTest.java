import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ColorTest extends  Base{


ColorCheck color;

@BeforeMethod

    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        color = PageFactory.initElements(driver, ColorCheck.class);
}
    @Test
     void verifyButtonColor() {
        color.getSearchButtonBackgroundColor();
        String actualColor = color.getSearchButtonBackgroundColor();
        String expectedColor = "rgba(0, 0, 0, 0)";
        Assert.assertEquals(actualColor, expectedColor);

    }
    @Test
    void verifyHeaderColor() {
        color.getHeaderBackgroundColor();
        String actualColor = color.getHeaderBackgroundColor();
        String expectedColor = "rgb(19, 25, 33)";
        Assert.assertEquals(actualColor, expectedColor);
    }



    @AfterMethod
    void cleanUp() {
         clean();
    }}



