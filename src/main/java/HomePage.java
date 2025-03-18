import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    @FindBy(css = "#nav-logo") WebElement logo;
    @FindBy(css = "[placeholder='Search Amazon']") WebElement search;


    boolean isLogoVisible() {
        waitforElementvisibility(5000, logo);
        return logo.isDisplayed();
    }

    void search(String text) {
        waitforElementvisibility(5000, search);
        search.sendKeys(text, Keys.ENTER);
    }

}
