import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.NoSuchElementException;

public class CartPage extends Base {
    @FindBy(css = "[placeholder='Search Amazon']") WebElement search;
    @FindBy(css = "[id='add-to-cart-button']") WebElement atc;
    @FindBy(css = "[class='nav-a nav-a-2 nav-progressive-attribute']") WebElement cart;
    @FindBy(id = "[id='newAccordionRow_0']") WebElement productATCarea;
    @FindBy(css = "[id='attachSiNoCoverage-announce']") WebElement noThanksButton;
    @FindBy (css = "#nav-cart-count-container") WebElement cartQuantity;
    @FindBy(css = "[data-a-selector='increment-icon']") WebElement increaseQuantity;
    @FindBy(css="[class='a-icon a-icon-small-remove']") WebElement decreaseQuantity;
    @FindBy(css = "[class='a-icon a-icon-small-trash']") WebElement trashQuantity;
    @FindBy(css = ".a-container.sc-background-dark") WebElement emptyCartPage;
    @FindBy(css = "[aria-label='Sponsored Ad - 20V MAX Cordless Wet-Dry Vacuum, Portable Shop Vac, 2 Gallon Tank Capacity, Tool Only (DCV580H)']") WebElement product;


    boolean iscartClickable() {
        waitforElementvisibility(5000, cart);
        return cart.isEnabled();
    }

    void verifyaddeditemCart(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        waitforElementvisibility(10000, product);
        movetoElement(product);
        product.click();
//        waitforElementvisibility(5000, productATCarea);
//        scrolltoElement(productATCarea);
//        impWait(3000);
        waitforElementvisibility(5000, atc);
        atc.click();
        try {
            waitforElementvisibility(5000, noThanksButton);
            if(noThanksButton.isDisplayed()) {
                noThanksButton.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("'No Thanks' button did not appear.");
        }
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(cart);
        cart.click();
    }

    void verifyaddeditemQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        waitforElementvisibility(3000, product);
        product.click();
//        waitforElementvisibility(5000, productATCarea);
//        scrolltoElement(productATCarea);
//        impWait(3000);
        waitforElementvisibility(5000, atc);
        atc.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
        movetoElement(cart);
        cart.click();
        waitforElementvisibility(5000, cartQuantity);
        movetoElement(cartQuantity);

    }
    void trashAddedQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        waitforElementvisibility(3000, product);
        product.click();
//        waitforElementvisibility(5000, productATCarea);
//        scrolltoElement(productATCarea);
//        impWait(3000);
        waitforElementvisibility(5000, atc);
        atc.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        movetoElement(cart);
        cart.click();
        impWait(5000);
        //waitforElementvisibility(5000, cartQuantity);
        movetoElement(cartQuantity);
        impWait(5000);
        trashQuantity.click();
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(emptyCartPage);
    }
    void increaseItemQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        waitforElementvisibility(3000, product);
        product.click();
//        waitforElementvisibility(5000, productATCarea);
//        scrolltoElement(productATCarea);
//        impWait(3000);
        waitforElementvisibility(5000, atc);
        atc.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        movetoElement(cart);
        cart.click();
        driver.navigate().refresh();
        impWait(5000);
        movetoElement(cart);
        cart.click();
        impWait(5000);
        //waitforElementvisibility(5000, cartQuantity);
        movetoElement(cartQuantity);
        impWait(5000);
        increaseQuantity.click();
        driver.navigate().refresh();
        movetoElement(cartQuantity);
    }

    void decreaseItemQuantity(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
        waitforElementvisibility(3000, product);
        product.click();
        waitforElementvisibility(5000, atc);
//        waitforElementvisibility(5000, productATCarea);
//        scrolltoElement(productATCarea);
        atc.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        movetoElement(cart);
        cart.click();
        //waitforElementvisibility(5000, cartQuantity);
        impWait(5000);
        movetoElement(cartQuantity);
       // impWait(5000);
        increaseQuantity.click();
        driver.navigate().refresh();
        waitforElementvisibility(5000, cartQuantity);
        movetoElement(cartQuantity);
        waitforElementvisibility(5000, decreaseQuantity);
        decreaseQuantity.click();
        driver.navigate().refresh();
        movetoElement(cartQuantity);






    }}
