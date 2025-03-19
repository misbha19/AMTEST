import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterSection extends Base {
    @FindBy(id = "navFooter")
    WebElement footerArea;
    @FindBy(css = ".navFooterDescLine")
    WebElement subFooterArea;
    @FindBy(css = ".navFooterDescLine a") List<WebElement> mfooterTitle;
    @FindBy(css = "#navFooter a") List<WebElement> mainAndsublFooterTitle;

    boolean isFooterareaVisible() {
        waitforElementvisibility(5000, footerArea);
        return footerArea.isDisplayed();
    }

    boolean isSubFooterareaVisible() {
        waitforElementvisibility(5000, subFooterArea);
        return subFooterArea.isDisplayed();
    }

    boolean arefooterLinksPresent() {
        waitforElementvisibility(5000, footerArea);
        return !mfooterTitle.isEmpty();
    }
    int getfooterTitleCount() {
        waitforElementvisibility(5000, footerArea);
        for(WebElement ft : mfooterTitle){
            System.out.println("Below are footer main and sub footer title...........");
            System.out.println(ft.getText());
            System.out.println("Below is the link...........");
            System.out.println(ft.getDomAttribute("href"));
        }
        return mfooterTitle.size();
    }
    int getTotalFooterTitle() {
        waitforElementvisibility(5000, footerArea);
        for(WebElement tft : mainAndsublFooterTitle) {
            System.out.println("Below is the title...........");
            System.out.println(tft.getText());
            System.out.println("Below is the link...........");
            System.out.println(tft.getDomAttribute("href"));
        }
        return mainAndsublFooterTitle.size();
    }
    }



