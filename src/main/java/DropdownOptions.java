import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownOptions extends Base {

    @FindBy(css = "#searchDropdownBox")
    WebElement amazonDropdown;
    @FindBy(css = "#nav-search-submit-button")
    WebElement searchButton;
    @FindBy(css = "[class='a-size-base a-color-state a-text-bold']")
    WebElement deviceSearch;
    @FindBy(css = "[id='nav-progressive-subnav']")
    WebElement subHeader;
    @FindBy(xpath = "//div[@class='dcl-container d-page-type-browse d-widget-group-dossier-browse d-showcase dcl-centered']/div")
    WebElement techDeals;
    @FindBy(css = "[aria-describedby='s-refinements-a11y-summary']")
    WebElement aPharmacysearch;
    @FindBy(id = "nav-belt") WebElement header;




    void selectCategoryByVisibleText1(String text) {
        dropdownByVisibleText(amazonDropdown, text);
        waitforElementvisibility(5000, header);
        movetoElement(header);
    }
    void resultByVisibleText2(String text) {
        dropdownByVisibleText(amazonDropdown, text);
        impWait(3000);
        searchButton.click();
        impWait(5000);
        movetoElement(header);
}

    void resultByVisibleText3(String text) {
        dropdownByVisibleText(amazonDropdown, text);
        impWait(3000);
        searchButton.click();
        impWait(5000);
        movetoElement(header);
    }

     void selectCategoryByIndex3(int index) {
        dropdownByIndex(amazonDropdown, index);
        impWait(3000);
        searchButton.click();

    }
    void resultByIndex7(int index) {
        dropdownByIndex(amazonDropdown, index);
        impWait(3000);
        searchButton.click();
        impWait(5000);
        movetoElement(aPharmacysearch);
    }


    void selectCategoryByValue1(String value) {
        dropdownByValue(amazonDropdown, value);
        impWait(3000);
        searchButton.click();
    }
    void resultByValue2(String value) {
        dropdownByValue(amazonDropdown, value);
        impWait(3000);
        searchButton.click();
        waitforElementvisibility(5000, techDeals);
        scrolltoElement(techDeals);
    }
    void resultByValue3(String value) {
        dropdownByValue(amazonDropdown, value);
        impWait(3000);
        searchButton.click();
        impWait(3000);
        movetoElement(header);


    }}





