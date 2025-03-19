import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


    public class DropdownTest extends Base {

        DropdownOptions aDropdown;

        @BeforeMethod
        void openBrowser() {
            setUp("https://www.amazon.com");
            driver.manage().window().maximize();
            aDropdown = PageFactory.initElements(driver, DropdownOptions.class);
        }

        @Test
        void testDropdownByVisibleText1() {
            aDropdown.selectCategoryByVisibleText1("Books");
            Assert.assertTrue(aDropdown.header.isDisplayed());
        }

        @Test
        void checkresultByVisibility2() {
            aDropdown.resultByVisibleText2("Appliances");
            String expectedTx = "Appliances";
            Assert.assertTrue(aDropdown.header.getText().contains(expectedTx));
        }

        @Test
        void checkresultByVisibility3() {
            aDropdown.resultByVisibleText3("Beauty & Personal Care");
            String actualCategory = "Flooring";
            Assert.assertFalse(aDropdown.header.getText().contains(actualCategory));
        }

        @Test
        void testDropdownByValue() {
            aDropdown.selectCategoryByValue1("search-alias=electronics");
            Assert.assertTrue(aDropdown.subHeader.isEnabled());

        }
        @Test
        void checkresultByValue() {
            aDropdown.resultByValue2("search-alias=electronics");
            String expectedText = "Tech deals for you";
            Assert.assertTrue(aDropdown.techDeals.getText().contains(expectedText));
        }
        @Test
        void checkAutomotiveByValue() {
            aDropdown.resultByValue3("search-alias=vehicles");
            String expectedText = "Amazon";
            Assert.assertTrue(aDropdown.header.getText().contains(expectedText));
        }

        @Test()
        void testDropdownByIndex() {
            aDropdown.selectCategoryByIndex3(3);
            Assert.assertTrue(aDropdown.deviceSearch.isDisplayed());
        }
        @Test()
        void checkresultByIndex() {
            aDropdown.resultByIndex7(7);
            String expectedTextIn = "Top Brands in Health & Household";
            Assert.assertTrue(aDropdown.aPharmacysearch.getText().contains(expectedTextIn));
        }

    @AfterMethod
    void cleanup() {
        clean();

}}

