import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends Base{
    @FindBy  (id="createAccountSubmit") WebElement createAccountButton;
    @FindBy(css = "[data-csa-c-content-id='nav_ya_signin']") WebElement accountsAndlists;
    @FindBy (css = "[class='nav-action-inner']") WebElement signInbutton;
    @FindBy(id = "authportal-main-section") WebElement createAndSignin;



    boolean createAccountButtonEnabled() {
        waitforElementvisibility(5000, accountsAndlists);
        accountsAndlists.click();
        impWait(3000);
        signInbutton.click();
        waitforElementvisibility(5000, createAndSignin);
        movetoElement(createAndSignin);
        return createAccountButton.isEnabled();
    }
}
