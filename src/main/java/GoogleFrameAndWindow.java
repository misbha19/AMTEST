import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleFrameAndWindow extends Base{


    @FindBy (css = "[name='callout']") WebElement googleiFrame;
    @FindBy (css = "[aria-label='Sign in (opens a new tab)']") WebElement googleSignInButton;
    @FindBy (id = "e6yDCfi3") WebElement googleFrameText;
    @FindBy(css = "[aria-label='Email or phone']") WebElement emailOrphone;
    @FindBy(css = "[class='TcuCfd NQ5OL ']") WebElement signInarea;
    @FindBy(css = "[class='TcuCfd NQ5OL ']") WebElement nextPage;



    void googleSignIn() {
        waitforElementvisibility(5000, googleiFrame);
        switchtoFrame(googleiFrame);
        googleSignInButton.click();
        switchtoCurrentwindow();

    }
    void checkingSignInfield() {
        waitforElementvisibility(5000, googleiFrame);
        switchtoFrame(googleiFrame);
        impWait(3000);
        googleSignInButton.click();
        switchtoCurrentwindow();
        waitforElementvisibility(5000, signInarea);


    }

    void invalidEmail() {
        waitforElementvisibility(5000, googleiFrame);
        switchtoFrame(googleiFrame);
        impWait(3000);
        googleSignInButton.click();
        switchtoCurrentwindow();
        waitforElementvisibility(5000, emailOrphone);
        emailOrphone.sendKeys("johnroberts45@gmail.com", Keys.ENTER);
            try {
                Thread.sleep(5000);//Here I'm using Thread for "emailOrphone" to be loaded and execute properly. Otherwise, that kept on failing the test while "emailOrphone" was still loading.
            } catch (InterruptedException e) {
              //  throw new RuntimeException(e);
    }}

    void validEmail() {
            waitforElementvisibility(5000, googleiFrame);
            switchtoFrame(googleiFrame);
            impWait(3000);
            googleSignInButton.click();
            switchtoCurrentwindow();
            waitforElementvisibility(5000, emailOrphone);
            emailOrphone.sendKeys("ahmedmisbha06@gmail.com", Keys.ENTER);
            try {
            Thread.sleep(5000);//Here I'm using Thread for "emailOrphone" to be loaded and execute properly. Otherwise, that kept on failing the test while "emailOrphone" was still loading.
        } catch (InterruptedException e) {
               // throw new RuntimeException(e);
        }}}

