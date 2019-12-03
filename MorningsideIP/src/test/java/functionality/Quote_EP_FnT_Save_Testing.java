package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.Quote_EP_FnT_Save;
import utility.EReport;
import utility.SeleniumFunctions;

public class Quote_EP_FnT_Save_Testing extends EReport 
{
	public WebDriver driver;
	
	@Test
	public void Quote_EP_SaveTest() throws InterruptedException, AWTException
	{
		test=extent.createTest("EP Qupte Submission");
		int AssertFailedCount = 0;
		SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
		Quote_EP_FnT_Save quote = new Quote_EP_FnT_Save();
		EReport screenshot = new EReport();
		System.out.println("================================================================");
		System.out.println("step3: Verifying whether user selected ep quote or not");
		Reporter.log("Verifying whether user selected ep quote or not");
		if(quote.verifyEPQuoteSelection())
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
		
		System.out.println("================================================================");
		System.out.println("Step3: Verifying validation is present or not");
		Reporter.log("Step3: Verifying validation is present or not");
		if(quote.verifyValidationmessage())
		{
			System.out.println("Success!! Validation message found");
			Reporter.log("Success!! Validation message found");
			test.log(Status.PASS, "Success!! Validation message found");
		}
		else
		{
			System.out.println("Failure!! Validation message not found");
			Reporter.log("Failure!! Validation message not found");
			test.log(Status.FAIL, "Failure!! Validation message not found");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		System.out.println("================================================================");
		System.out.println("Step4: Passing Application number");
		Reporter.log("Step4: Passing Application number");
		if(quote.ProvidingApplicationNumber())
		{
			System.out.println("Success!! Application number Provided");
			Reporter.log("Success!! Application number Provided");
			test.log(Status.PASS, "Success!! Application number Provided");
		}
		else
		{
			System.out.println("Failure!! Application number not Provided");
			Reporter.log("Failure!! Application number not Provided");
			test.log(Status.FAIL, "Failure!! Application number not Provided");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		
		}
		
		System.out.println("================================================================");
		System.out.println("Step4: Source langugage selection");
		Reporter.log("Step4: Source langugage selection");
		if(quote.SourceLanguageSelection())
		{
			System.out.println("Success!! Source language selected");
			Reporter.log("Success!! Source language selected");
			test.log(Status.PASS, "Success!! Source language selected");
		}
		else
		{
			System.out.println("Failure!! Source language not selected");
			Reporter.log("Failure!! Source language not selected");
			test.log(Status.FAIL, "Failure!! Source language not selected");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		System.out.println("================================================================");
		System.out.println("Step5: Verifying the source language selection");
		Reporter.log("Step5: Verifying the source language selection");
		if(quote.ClaimsSelection())
		{
			System.out.println("Success!! Claims Selected");
			Reporter.log("Success!! Claims Selected");
			test.log(Status.PASS, "Success!! Claims Selected");
		}
		else
		{
			System.out.println("Failure!! Claims  not Selected");
			Reporter.log("Failure!! Claims  not Selected");
			test.log(Status.FAIL, "Failure!! Claims  not Selected");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		System.out.println("================================================================");
		System.out.println("Step6: Verifying File and translate option selected");
		Reporter.log("Step6: Verifying File and translate option selected");
		
		if(quote.FileandTranslate())
		{
			System.out.println("Success!! File and translate selected");
			Reporter.log("Success!! File and translate selected");
			test.log(Status.PASS, "Success!! File and translate selected");
		}
		else
		{
			System.out.println("Failure!! File and translate not selected");
			Reporter.log("Failure!! File and translate not selected");
			test.log(Status.FAIL, "Failure!! File and translate not selected");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		System.out.println("================================================================");
		System.out.println("Step7: Verifying  target countries are being selected");
		Reporter.log("Step7: Verifying  target countries are being selected");
		if(quote.TargetCountries())
		{
			System.out.println("Success!! User is selecting the targert countries");
			Reporter.log("Success!! User is selecting the targert countries");
			test.log(Status.PASS, "Success!! User is selecting the targert countries");
		}
		else
		{
			System.out.println("Failure!! User has not selecting the targert countries");
			Reporter.log("Failure!! User has not selecting the targert countries");
			test.log(Status.FAIL, "Failure!! User has not selecting the targert countries");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
		System.out.println("================================================================");
		System.out.println("Step7: Verifying  File uplaoding is being perfomed");
		Reporter.log("Step7: Verifying  File uplaoding is being perfomed");
		if(quote.FileUploading())
		{
				System.out.println("Success!! File is being uplaoded");
				Reporter.log("Success!! File is being uplaoded");
				test.log(Status.PASS, "Success!! File is being uplaoded");
		}
		else
		{
				System.out.println("Failure!! File is not uplaoded");
				Reporter.log("Failure!! File is not uplaoded");
				test.log(Status.FAIL, "Failure!! File is not uplaoded");
				screenshot.captureAndDisplayScreenShot(driver, test);
				AssertFailedCount++;
		}
		
		System.out.println("================================================================");
		System.out.println("Step8: Verifying  export excel and save quote functionality");
		Reporter.log("Step8: Verifying  export excel and save quote functionality");
		if(quote.ReviewPage())
		{
			System.out.println("Success!! file exported and later quote saved");
			Reporter.log("Success!! file exported and later quote saved");
			test.log(Status.PASS, "Success!! file exported and later quote saved");
		}
		else
		{
			System.out.println("Failure!! file exported and later quote saved failed");
			Reporter.log("Failure!! file exported and later quote saved failed");
			test.log(Status.FAIL, "Failure!! file exported and later quote saved failed");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
	}
}
