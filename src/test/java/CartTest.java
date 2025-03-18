import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Base {

    CartPage aCart;
    @BeforeMethod

    void openBrowser() {
        setUp("https://www.amazon.com");
        driver.manage().window().maximize();
        aCart = PageFactory.initElements(driver, CartPage.class);
    }

    @Test
    void checkCart() {
        boolean cCart=aCart.iscartClickable();
        Assert.assertTrue(cCart);
    }

    @Test
    void verifyCarturl() {
        aCart.verifyaddeditemCart("Apple Watch");
        driver.navigate().refresh();
        String expectedinUrl = "ref_=nav_cart";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedinUrl));
    }
    @Test
    void verifyCartQuantity() {
        aCart.verifyaddeditemQuantity("Apple Watch");
        driver.navigate().refresh();
        Assert.assertTrue(aCart.cartQuantity.getText().contains("1"));
    }

    @Test
    void deleteingAllQuantity() {
        aCart.trashAddedQuantity("Apple Watch");
        driver.navigate().refresh();
        Assert.assertTrue(aCart.cartQuantity.getText().contains("0"));
        Assert.assertTrue(aCart.emptyCartPage.getText().contains("Your Amazon Cart is empty"));
    }

    @Test
    void verifyIncreasedQuantity() {
        aCart.increaseItemQuantity("Apple Watch");
        driver.navigate().refresh();
        Assert.assertTrue(aCart.cartQuantity.getText().contains("2"));
    }

    @Test
    void verifyDecreasedQuantity() {
        aCart.decreaseItemQuantity("Apple Watch");
        driver.navigate().refresh();
        Assert.assertTrue(aCart.cartQuantity.getText().contains("1"));
    }



    @AfterMethod
    void cleanUp(){
        // clean();
    }

}

