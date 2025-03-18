import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Base {
    @FindBy(css = "[placeholder='Search Amazon']") WebElement search;
    @FindBy(id = "a-autoid-1-announce") WebElement watchAtc;
    @FindBy (id= "nav-belt") WebElement header;
    @FindBy(css = "[class='nav-a nav-a-2 nav-progressive-attribute']") WebElement cart;
    @FindBy (css = "#nav-cart-count-container") WebElement cartQuantity;
    @FindBy(css = "[data-a-selector='increment-icon']") WebElement increaseQuantity;
    @FindBy(css="[class='a-icon a-icon-small-remove']") WebElement decreaseQuantity;
    @FindBy(css = "[class='a-icon a-icon-small-trash']") WebElement trashQuantity;
    @FindBy(css = ".a-container.sc-background-dark") WebElement emptyCartPage;


    boolean iscartClickable() {
        waitforElementvisibility(5000, cart);
        return cart.isEnabled();

    }

    void verifyaddeditemCart(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        watchAtc.click();
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(cart);
        cart.click();
    }

    void verifyaddeditemQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        watchAtc.click();
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(cart);
        cart.click();
        waitforElementvisibility(10000, cartQuantity);
        movetoElement(cartQuantity);

    }
    void trashAddedQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        watchAtc.click();
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(cart);
        cart.click();
        waitforElementvisibility(10000, cartQuantity);
        movetoElement(cartQuantity);
        impWait(5000);
        trashQuantity.click();
        impWait(5000);
        movetoElement(emptyCartPage);
    }
    void increaseItemQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        watchAtc.click();
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(cart);
        cart.click();
        waitforElementvisibility(10000, cartQuantity);
        movetoElement(cartQuantity);
        impWait(5000);
        increaseQuantity.click();
    }

    void decreaseItemQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        watchAtc.click();
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(cart);
        cart.click();
        waitforElementvisibility(10000, cartQuantity);
        movetoElement(cartQuantity);
        impWait(5000);
        increaseQuantity.click();
        waitforElementvisibility(10000, cartQuantity);
        movetoElement(cartQuantity);
        impWait(5000);
        decreaseQuantity.click();



    }}
