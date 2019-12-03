package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.Quote_EP_CliamsnTranslation;
import utility.EReport;
import utility.SeleniumFunctions;

public class Quote_Ep_ClaimsnTranslation_Test extends EReport
{
public WebDriver driver;
	
	@Test
	public void Epquotesubmissiontesting() throws InterruptedException, AWTException
	{
		test=extent.createTest("EP Qupte Submission");
		int AssertFailedCount = 0;
		SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
		Quote_EP_CliamsnTranslation quote = new Quote_EP_CliamsnTranslation();
		EReport screenshot = new EReport();
		
		if(quote.EPSelection())
		{
			System.out.println("Success!! user has now selected EP under Quote");
			Reporter.log("Success!! user has now selected EP under Quote");
			test.log(Status.PASS, "Success!! user has now selected EP under Quote");
		}
		
		else
		{
			System.out.println("Failure!! user has not selected EP under Quote");
			Reporter.log("Failure!! user has not selected EP under Quote");
			test.log(Status.FAIL, "Failure!! user has not selected EP under Quote");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		if(quote.validationtest())
		{
			System.out.println("Success!!! validaiton message found");
			Reporter.log("Success!!! validaiton message found");
			test.log(Status.PASS, "Success!!! validaiton message found");
		}
		else
		{
			System.out.println("Failure!!! validaiton message not found");
			Reporter.log("Failure!!! validaiton message not found");
			test.log(Status.FAIL, "Failure!!! validaiton message not found");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		if(quote.ApplicationNumber())
		{
			System.out.println("Success!!Application nummber provided ");
			Reporter.log("Success!!Application nummber provided ");
			test.log(Status.PASS, "Success!!Application nummber provided ");
		}
		else
		{
			System.out.println("Failure!!Application number not  provided ");
			Reporter.log("Failure!!Application number not  provided ");
			test.log(Status.FAIL, "Failure!!Application number not  provided ");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		if(quote.SourceLanguageSelection())
		{
			System.out.println("Success!!Source language Selected ");
			Reporter.log("Success!!Source language Selected");
			test.log(Status.PASS, "Success!!Source language Selected");
		}
		else
		{
			System.out.println("Failure!!Source language is not Selected ");
			Reporter.log("Failure!!Source language is not Selected ");
			test.log(Status.FAIL, "Failure!!Source language is not Selected ");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		
		if(quote.ClaimSelection())
		{
			System.out.println("Success!!Claims date is selected ");
			Reporter.log("Success!!Claims date is selected ");
			test.log(Status.PASS, "Success!!Claims date is selected ");
		}
		else
		{
			System.out.println("Failure!!Claims Date is not Selected ");
			Reporter.log("Failure!!Claims Date is not Selected  ");
			test.log(Status.FAIL, "Failure!!Claims Date is not Selected ");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		if(quote.EPTranslation())
		{
			System.out.println("Success!! File and Translate option is selected");
			Reporter.log("Success!! File and Translate option is selected");
			test.log(Status.PASS, "Success!! File and Translate option is selected");
		}
		else
		{
			System.out.println("Failed!! File and Translate option is not selected");
			Reporter.log("Failed!! File and Translate option is not selected");
			test.log(Status.PASS, "Failed!! File and Translate option is not selected");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		if(quote.CountrySelection())
		{
			
		}
		
		if(quote.Fileupload())
		{
			
		}
		
		if(quote.export())
		{
			
		}
		if(quote.approve())
		{
			
		}
	}
	
}
