import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends Base {


    @FindBy(css = "[placeholder='Search Amazon']") WebElement search;
    @FindBy(css = "[id='ape_Search_auto-bottom-advertising-0_portal-batch-fast-btf-loom_9a86d8f1-b73a-44f2-9d82-642f7f1ef83a_iframe']") WebElement adsFrame;



    void checkFrame() {
        impWait(5000);
        search.sendKeys("amazon ads", Keys.ENTER);
        impWait(5000);
        scrolltoElement(adsFrame);
        switchtoFrame(adsFrame);

   }

}
