package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 




import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
 
public class EReport
{
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
     
    @BeforeSuite
    public void setUp()
    {
        //htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/Regression Test Report.html");
    	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/src/test/resources/screenshot/RegressionTestReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    
        extent.setSystemInfo("OS", "Windows 7 x64");
        //extent.setSystemInfo("Host Name", "Sarfaraz");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Sarfaraz Doni");
         
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Automation Demo Report");
        htmlReporter.config().setReportName("Regression Test Automation Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.DARK);
    }
     
    @AfterMethod
    public void getResult(ITestResult result)
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        else
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
     
    @AfterSuite
    public void flush_Report()
    {
        extent.flush();
    }
    
    public void captureAndDisplayScreenShot(WebDriver driver, ExtentTest test){
    	String extentReportImage = System.getProperty("user.dir") + "/src/test/resources/screenshot/" + System.currentTimeMillis() + ".png";
    		// Take screenshot and store as a file format
    		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		try {
    			// now copy the screenshot to desired location using copyFile method
    			org.aspectj.util.FileUtil.copyFile(src, new File(extentReportImage));
    			test.log(Status.INFO, "Screenshot from : " + extentReportImage, MediaEntityBuilder.createScreenCaptureFromPath(extentReportImage).build());
    		} catch (IOException e)
    		{
    			System.out.println("Error in the captureAndDisplayScreenShot method: " + e.getMessage());
    		}
    	}
}