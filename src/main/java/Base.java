import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Base {

    static WebDriver driver;

    void setUp(String url) {
        driver = new EdgeDriver();
        driver.get(url);
    }

    void setUp2(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

//    static WebDriver driver;
//    static WebDriver chromeDriver;
//    static WebDriver firefoxDriver;
//
//    void setUp(String url) {
//        if (firefoxDriver == null) {
//            firefoxDriver = new FirefoxDriver();
//        }
//        driver = firefoxDriver;
//        driver.get(url);
//    }
//
//    void setUp2(String url) {
//        if (chromeDriver == null) {
//            chromeDriver = new ChromeDriver();
//        }
//        driver = chromeDriver;
//        driver.get(url);
//    }

    void waitforElementvisibility(int time, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    void impWait(int milSeconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(milSeconds));
    }

    void movetoElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    void scrolltoElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.scrollToElement(element).perform();
    }
    void switchtoFrame(WebElement element) {
        driver.switchTo().frame(element);

    }
    void switchtoCurrentwindow() {
        String currentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        for (String tab : windows) {
            if (tab != currentWindow) {
                driver.switchTo().window(tab);
            }}}

    void dropdownByVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    void dropdownByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    void dropdownByValue(WebElement element, String value){
            Select select = new Select(element);
            select.selectByValue(value);

    }
    void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    void dismissAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    void dragNdrop(WebElement object, WebElement destination) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(object, destination).perform();
    }

    void doubleClick(WebElement element){
        Actions actions = new Actions(driver);
        actions.doubleClick(element);
    }

        void clean () {

        driver.quit();
        }}




