import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationUpdate extends Base {
    @FindBy(id = "nav-global-location-popover-link") WebElement updateLocation;
    @FindBy(id = "GLUXZipUpdateInput") WebElement locationZipcodeField;
    @FindBy (css = "[aria-labelledby='GLUXZipUpdate-announce']") WebElement applyUpdatedLocation;
    @FindBy(id= "a-autoid-1-announce") WebElement locationUpdateButton;
    @FindBy (id= "nav-belt") WebElement header;



    void updateTheLocation(String input) {
        waitforElementvisibility(10000, updateLocation);
        updateLocation.click();
        locationZipcodeField.sendKeys(input);
        applyUpdatedLocation.click();
        waitforElementvisibility(10000, locationUpdateButton);
        locationUpdateButton.click();

    }

}

