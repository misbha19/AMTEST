import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPage extends Base {

    @FindBy(id = "nav-hamburger-menu")
    WebElement allMenuButton;
    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//li//a")
    List<WebElement> menuOptions;
    @FindBy(css = "[class='hmenu-item']")
    List<WebElement> hmenu;
    @FindBy(id = "nav-belt") WebElement header;
    @FindBy(css = "[class='hmenu hmenu-visible']") WebElement menuArea;
    @FindBy (xpath = "//ul[@class='hmenu hmenu-visible']/li[2]/a") WebElement bestSeller;
    @FindBy(css = "[class='_p13n-zg-banner-landing-page-header_style_zgLandingPageBannerTitleContainer__3pQqv']") WebElement bestSellerPage;



    void checkingBestSeller () {
        waitforElementvisibility(5000, header);
        movetoElement(header);
        impWait(3000);
        allMenuButton.click();
        waitforElementvisibility(5000, bestSeller);
        bestSeller.click();
        waitforElementvisibility(3000, bestSellerPage);

    }
    int getTotalMenuTitle() {
        waitforElementvisibility(5000, header);
        movetoElement(header);
        impWait(3000);
        allMenuButton.click();
        impWait(3000);
        return menuOptions.size();

    }}



