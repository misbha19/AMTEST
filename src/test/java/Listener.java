import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Listener extends Base implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/HH-mm-ss");
        Date date = new Date();
        String name = dateFormat.format(date);
        //screenshot
        File file = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/screenshot/" + name +".png"));
        } catch (IOException e) {

        }

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is successful");
    }
}