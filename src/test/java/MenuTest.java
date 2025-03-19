import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MenuTest extends Base{

    MenuPage menu;

    @BeforeMethod

    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        menu = PageFactory.initElements(driver, MenuPage.class);
    }
       @Test
        void testBestSeller(){
            menu.checkingBestSeller();
           Assert.assertTrue(menu.bestSellerPage.getText().contains("Our most popular products based on sales. Updated frequently."));
       }
    @Test
    void checkTotalMenuTitles() {
        int actualCount = menu.getTotalMenuTitle();
        int expectedCount = 60;
        Assert.assertEquals(actualCount, expectedCount);
    }

    @AfterMethod
    void cleanUp() {
         clean();
    }}

