import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ColorCheck extends Base{



    @FindBy (id= "nav-belt") WebElement header;
    @FindBy(id = "nav-search-submit-button") WebElement searchButton;



    String getSearchButtonBackgroundColor() {

        return searchButton.getCssValue("background-color");
    }
    String getHeaderBackgroundColor() {

        return header.getCssValue("background-color");
    }
}


