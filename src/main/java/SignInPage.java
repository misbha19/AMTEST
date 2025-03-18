import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends Base{

    @FindBy(css = "[data-csa-c-content-id='nav_ya_signin']") WebElement accountsAndlists;
    @FindBy (css = "[class='nav-action-inner']") WebElement signInbutton;
    @FindBy(id = "authportal-main-section") WebElement createAndSignin;
    @FindBy(css = "[class='a-input-text a-span12 auth-autofocus auth-required-field auth-require-claim-validation']") WebElement emailBox;
    @FindBy(css = "[aria-labelledby='continue-announce']") WebElement continueButton;



    boolean isSignButtonEnabled() {
        waitforElementvisibility(5000, accountsAndlists);
        return signInbutton.isEnabled();
    }
    boolean isEmailboxdisplayed() {
        waitforElementvisibility(5000, accountsAndlists);
        accountsAndlists.click();
        signInbutton.click();
        waitforElementvisibility(10000, createAndSignin);
        emailBox.sendKeys("johnroberts45@gmail.com");//, Keys.ENTER);
        impWait(5000);
        movetoElement(emailBox);
        return emailBox.isDisplayed();
    }
    void invalidEmail() {
        waitforElementvisibility(5000, accountsAndlists);
        accountsAndlists.click();
        waitforElementvisibility(10000, signInbutton);
        signInbutton.click();
        waitforElementvisibility(10000, createAndSignin);
        switchtoFrame(createAndSignin);
       // movetoElement(createAndSignin);
        impWait(5000);
        emailBox.sendKeys("johnroberts45@gmail.com", Keys.ENTER);
        waitforElementvisibility(5000, continueButton);
        continueButton.click();


    }}
