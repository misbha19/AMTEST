import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HyrAlert extends  Base{

@FindBy(id = "alertBox") WebElement simpAlert;
@FindBy(css = "#output") WebElement outputBox;
@FindBy(id = "confirmBox") WebElement conAlert;

    void performsimpleAlert() {
        impWait(5000);
        simpAlert.click();
        impWait(5000);
        acceptAlert();
        impWait(5000);
        movetoElement(outputBox);

    }
    void dismissingconfirmationAlert() {
        waitforElementvisibility(10000, conAlert);
        conAlert.click();
        impWait(2000);
        dismissAlert();
        waitforElementvisibility(10000, outputBox);
        scrolltoElement(outputBox);


    }
    void acceptingconfirmationAlert() {
        waitforElementvisibility(10000, conAlert);
        conAlert.click();
        impWait(2000);
        acceptAlert();
        waitforElementvisibility(10000, outputBox);
        scrolltoElement(outputBox);
    }}



