import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends Base{

    @FindBy (css = "[data-csa-c-content-id='nav_ya_signin']")
    WebElement accountsAndlists;
    @FindBy (css = "[class='nav-action-inner']") WebElement signInbutton;
    @FindBy (xpath = "//a[contains(text(), 'Help')]") WebElement helpButton;
    @FindBy (id= "nav-belt") WebElement header;
    @FindBy(css = "#nav-logo") WebElement logo;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-text-center a-size-mini']/ul/li[1]") WebElement conditionsOfuse;
    @FindBy(css = "[class='cs-help-content']") WebElement conditionsPagebody;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-text-center a-size-mini']/ul/li[2]") WebElement privacyNotice;
    @FindBy(css = "[class='navFooterLine navFooterLinkLine navFooterDescLine']")
    WebElement aFooter;



    void checkHelpWindow() {
        waitforElementvisibility(5000, accountsAndlists);
        movetoElement(accountsAndlists);
        impWait(3000);
        scrolltoElement(signInbutton);
        impWait(3000);
        signInbutton.click();
        impWait(3000);
        helpButton.click();
        impWait(3000);
        switchtoCurrentwindow();
        movetoElement(header);
        impWait(3000);
        logo.click();

    }
    void checkConditionsWindow() {
        waitforElementvisibility(5000, accountsAndlists);
        movetoElement(accountsAndlists);
        impWait(3000);
        scrolltoElement(signInbutton);
        impWait(3000);
        signInbutton.click();
        impWait(3000);
        conditionsOfuse.click();
        switchtoCurrentwindow();
        impWait(3000);
        scrolltoElement(conditionsPagebody);

    }
    boolean isPrivacyWindowfooterHasLogo() {
        waitforElementvisibility(5000, accountsAndlists);
        movetoElement(accountsAndlists);
        impWait(3000);
        scrolltoElement(signInbutton);
        impWait(3000);
        signInbutton.click();
        impWait(3000);
        privacyNotice.click();
        switchtoCurrentwindow();
        impWait(3000);
        movetoElement(aFooter);
        return logo.isDisplayed();


    }}
