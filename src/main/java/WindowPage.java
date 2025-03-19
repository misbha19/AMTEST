import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends Base{

    @FindBy (css = "[data-csa-c-content-id='nav_ya_signin']")
    WebElement accountsAndlists;
    @FindBy (css = "[class='nav-action-inner']") WebElement signInbutton;
    @FindBy (xpath = "//a[contains(text(), 'Help')]") WebElement helpButton;
    @FindBy (id= "nav-belt") WebElement header;
    @FindBy(css = "#nav-logo") WebElement logo;
    @FindBy(css = "//div[@class='a-section a-spacing-top-extra-large auth-footer']/div[2]") WebElement footer;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-text-center a-size-mini']/ul/li[1]") WebElement conditionsOfuse;
    @FindBy(css = "[class='cs-help-content']") WebElement conditionsPagebody;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-text-center a-size-mini']/ul/li[2]") WebElement privacyNotice;
    @FindBy(css = "[class='navFooterLine navFooterLinkLine navFooterDescLine']")
    WebElement aFooter;



    // WebElement "footer" contains features (Conditions of Use,  Privacy Notice,  Help) that opens up a new window once these are clicked.


    void checkHelpWindow() {
        movetoElement(accountsAndlists);
        impWait(3000);
        accountsAndlists.click();
        waitforElementvisibility(5000, signInbutton);
        signInbutton.click();
        waitforElementvisibility(10000, footer);
        movetoElement(footer);
        impWait(3000);
        helpButton.click();
        impWait(5000);
        switchtoCurrentwindow();
        movetoElement(header);
        impWait(3000);
        logo.click();

    }
    void checkConditionsWindow() {
        movetoElement(accountsAndlists);
        impWait(3000);
        accountsAndlists.click();
        waitforElementvisibility(5000, signInbutton);
        signInbutton.click();
        waitforElementvisibility(10000, footer);
        movetoElement(footer);
        impWait(3000);
        conditionsOfuse.click();
        switchtoCurrentwindow();
        impWait(3000);
        scrolltoElement(conditionsPagebody);

    }
    boolean isPrivacyWindowfooterHasLogo() {
        waitforElementvisibility(5000, accountsAndlists);
        movetoElement(accountsAndlists);
        impWait(5000);
        accountsAndlists.click();
        waitforElementvisibility(5000, signInbutton);
        signInbutton.click();
        impWait(3000);
        driver.navigate().refresh();
        waitforElementvisibility(10000, footer);
        movetoElement(footer);
        impWait(5000);
        privacyNotice.click();
        switchtoCurrentwindow();
        impWait(5000);
        movetoElement(aFooter);
        return logo.isDisplayed();


    }}
