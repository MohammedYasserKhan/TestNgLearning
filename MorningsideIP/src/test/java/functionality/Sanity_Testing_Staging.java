package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.Sanity_test;
import utility.EReport;
import utility.SeleniumFunctions;

public class Sanity_Testing_Staging extends EReport 
{

	public WebDriver driver;
	@Test
	public void Sanitytest() throws InterruptedException, AWTException
	{
		test=extent.createTest("Sanity Testing in staging");
		int AssertFailedCount = 0;
		SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
		Sanity_test quote = new Sanity_test();
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
		if(quote.ReviewPageApprove())
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
		System.out.println("================================================================");
		System.out.println("Step9:  Verifying  home page selection and now save quote scenario");
		Reporter.log("Step9: Verifying  home page selection and now save quote scenario");
		if(quote.HomeSelection())
		{
			System.out.println("Success!! home page selection");
			Reporter.log("Success!! home page selection");
			test.log(Status.PASS, "Success!! home page selection");
		}
		else
		{
			System.out.println("Failure!! home page  not selected");
			Reporter.log("Failure!! home page  not selected");
			test.log(Status.FAIL, "Failure!! home page  not selected");
			screenshot.captureAndDisplayScreenShot(driver, test);
			AssertFailedCount++;
		}
		
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
		System.out.println("Step10: Verifying validation is present or not");
		Reporter.log("Step10: Verifying validation is present or not");
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
		System.out.println("Step11: Passing Application number");
		Reporter.log("Step11: Passing Application number");
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
		System.out.println("Step12: Source langugage selection");
		Reporter.log("Step12: Source langugage selection");
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
//		
//		System.out.println("================================================================");
//		System.out.println("Step13: Verifying the source language selection");
//		Reporter.log("Step13: Verifying the source language selection");
//		if(quote.ClaimsSelection())
//		{
//			System.out.println("Success!! Claims Selected");
//			Reporter.log("Success!! Claims Selected");
//			test.log(Status.PASS, "Success!! Claims Selected");
//		}
//		else
//		{
//			System.out.println("Failure!! Claims  not Selected");
//			Reporter.log("Failure!! Claims  not Selected");
//			test.log(Status.FAIL, "Failure!! Claims  not Selected");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step14: Verifying File and translate option selected");
//		Reporter.log("Step14: Verifying File and translate option selected");
//		
//		if(quote.FileandTranslate())
//		{
//			System.out.println("Success!! File and translate selected");
//			Reporter.log("Success!! File and translate selected");
//			test.log(Status.PASS, "Success!! File and translate selected");
//		}
//		else
//		{
//			System.out.println("Failure!! File and translate not selected");
//			Reporter.log("Failure!! File and translate not selected");
//			test.log(Status.FAIL, "Failure!! File and translate not selected");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step15: Verifying  target countries are being selected");
//		Reporter.log("Step15: Verifying  target countries are being selected");
//		if(quote.TargetCountries())
//		{
//			System.out.println("Success!! User is selecting the targert countries");
//			Reporter.log("Success!! User is selecting the targert countries");
//			test.log(Status.PASS, "Success!! User is selecting the targert countries");
//		}
//		else
//		{
//			System.out.println("Failure!! User has not selecting the targert countries");
//			Reporter.log("Failure!! User has not selecting the targert countries");
//			test.log(Status.FAIL, "Failure!! User has not selecting the targert countries");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step16: Verifying  File uplaoding is being perfomed");
//		Reporter.log("Step16: Verifying  File uplaoding is being perfomed");
//		if(quote.FileUploading())
//		{
//				System.out.println("Success!! File is being uplaoded");
//				Reporter.log("Success!! File is being uplaoded");
//				test.log(Status.PASS, "Success!! File is being uplaoded");
//		}
//		else
//		{
//				System.out.println("Failure!! File is not uplaoded");
//				Reporter.log("Failure!! File is not uplaoded");
//				test.log(Status.FAIL, "Failure!! File is not uplaoded");
//				screenshot.captureAndDisplayScreenShot(driver, test);
//				AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step17: Verifying  export excel and save quote functionality");
//		Reporter.log("Step17: Verifying  export excel and save quote functionality");
//		if(quote.ReviewPageSave())
//		{
//			System.out.println("Success!! file exported and later quote saved");
//			Reporter.log("Success!! file exported and later quote saved");
//			test.log(Status.PASS, "Success!! file exported and later quote saved");
//		}
//		else
//		{
//			System.out.println("Failure!! file exported and later quote saved failed");
//			Reporter.log("Failure!! file exported and later quote saved failed");
//			test.log(Status.FAIL, "Failure!! file exported and later quote saved failed");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step18:  Verifying  home page selection and now save quote scenario");
//		Reporter.log("Step18: Verifying  home page selection and now save quote scenario");
//		if(quote.HomeSelection())
//		{
//			System.out.println("Success!! home page selection");
//			Reporter.log("Success!! home page selection");
//			test.log(Status.PASS, "Success!! home page selection");
//		}
//		else
//		{
//			System.out.println("Failure!! home page  not selected");
//			Reporter.log("Failure!! home page  not selected");
//			test.log(Status.FAIL, "Failure!! home page  not selected");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		if(quote.verifyEPQuoteSelection())
//		{
//			System.out.println("Success!! user has now selected EP under Quote");
//			Reporter.log("Success!! user has now selected EP under Quote");
//			test.log(Status.PASS, "Success!! user has now selected EP under Quote");
//		}
//		else
//		{
//			System.out.println("Failure!! user has not selected EP under Quote");
//			Reporter.log("Failure!! user has not selected EP under Quote");
//			test.log(Status.FAIL, "Failure!! user has not selected EP under Quote");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step19: Verifying validation is present or not");
//		Reporter.log("Step19: Verifying validation is present or not");
//		if(quote.verifyValidationmessage())
//		{
//			System.out.println("Success!! Validation message found");
//			Reporter.log("Success!! Validation message found");
//			test.log(Status.PASS, "Success!! Validation message found");
//		}
//		else
//		{
//			System.out.println("Failure!! Validation message not found");
//			Reporter.log("Failure!! Validation message not found");
//			test.log(Status.FAIL, "Failure!! Validation message not found");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step20: Passing Application number");
//		Reporter.log("Step20: Passing Application number");
//		if(quote.ProvidingApplicationNumber())
//		{
//			System.out.println("Success!! Application number Provided");
//			Reporter.log("Success!! Application number Provided");
//			test.log(Status.PASS, "Success!! Application number Provided");
//		}
//		else
//		{
//			System.out.println("Failure!! Application number not Provided");
//			Reporter.log("Failure!! Application number not Provided");
//			test.log(Status.FAIL, "Failure!! Application number not Provided");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step21: Source langugage selection");
//		Reporter.log("Step21: Source langugage selection");
//		if(quote.SourceLanguageSelection())
//		{
//			System.out.println("Success!! Source language selected");
//			Reporter.log("Success!! Source language selected");
//			test.log(Status.PASS, "Success!! Source language selected");
//		}
//		else
//		{
//			System.out.println("Failure!! Source language not selected");
//			Reporter.log("Failure!! Source language not selected");
//			test.log(Status.FAIL, "Failure!! Source language not selected");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step22: Verifying the source language selection");
//		Reporter.log("Step22: Verifying the source language selection");
//		if(quote.ClaimsSelection())
//		{
//			System.out.println("Success!! Claims Selected");
//			Reporter.log("Success!! Claims Selected");
//			test.log(Status.PASS, "Success!! Claims Selected");
//		}
//		else
//		{
//			System.out.println("Failure!! Claims  not Selected");
//			Reporter.log("Failure!! Claims  not Selected");
//			test.log(Status.FAIL, "Failure!! Claims  not Selected");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step23: Verifying the Translation only selection");
//		Reporter.log("Step22: Verifying the Translation only selection");
//		if(quote.TargetCountriesforTranslation())
//		{
//			System.out.println("Success!! Translation only  Selected");
//			Reporter.log("Success!! Translation only  Selected");
//			test.log(Status.PASS, "Success!! Translation only  Selected");
//		}
//		else
//		{
//			System.out.println("Failure!! Translations  not Selected");
//			Reporter.log("Failure!! Translations  not Selected");
//			test.log(Status.FAIL, "Failure!! Translations  not Selected");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//	
//		System.out.println("================================================================");
//		System.out.println("Step24: Verifying  target countries are being selected");
//		Reporter.log("Step24: Verifying  target countries are being selected");
//		if(quote.TargetCountries())
//		{
//			System.out.println("Success!! User is selecting the targert countries");
//			Reporter.log("Success!! User is selecting the targert countries");
//			test.log(Status.PASS, "Success!! User is selecting the targert countries");
//		}
//		else
//		{
//			System.out.println("Failure!! User has not selecting the targert countries");
//			Reporter.log("Failure!! User has not selecting the targert countries");
//			test.log(Status.FAIL, "Failure!! User has not selecting the targert countries");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step25: Providing request delivery date");
//		Reporter.log("Step25: Providing request delivery date");
//		
////		if(quote.Deliverydate())
////		{
////			System.out.println("Success!! Delivery date submitted");
////			Reporter.log("Success!! Delivery date submitted");
////			test.log(Status.PASS, "Success!! Delivery date submitted");
////		}
////		else
////		{
////			System.out.println("Failure!! Delivery date  not Selected");
////			Reporter.log("Failure!! Delivery date  not Selected");
////			test.log(Status.FAIL, "Failure!! Delivery date  not Selected");
////			screenshot.captureAndDisplayScreenShot(driver, test);
////			AssertFailedCount++;
////		
////		}
////	
//		System.out.println("================================================================");
//		System.out.println("Step26: Verifying  File uplaoding is being perfomed");
//		Reporter.log("Step26: Verifying  File uplaoding is being perfomed");
//		if(quote.FileUploading())
//		{
//				System.out.println("Success!! File is being uplaoded");
//				Reporter.log("Success!! File is being uplaoded");
//				test.log(Status.PASS, "Success!! File is being uplaoded");
//		}
//		else
//		{
//				System.out.println("Failure!! File is not uplaoded");
//				Reporter.log("Failure!! File is not uplaoded");
//				test.log(Status.FAIL, "Failure!! File is not uplaoded");
//				screenshot.captureAndDisplayScreenShot(driver, test);
//				AssertFailedCount++;
//		}
//		
//		System.out.println("================================================================");
//		System.out.println("Step17: Verifying  export excel and save quote functionality");
//		Reporter.log("Step17: Verifying  export excel and save quote functionality");
//		if(quote.ReviewPageSave())
//		{
//			System.out.println("Success!! file exported and later quote saved");
//			Reporter.log("Success!! file exported and later quote saved");
//			test.log(Status.PASS, "Success!! file exported and later quote saved");
//		}
//		else
//		{
//			System.out.println("Failure!! file exported and later quote saved failed");
//			Reporter.log("Failure!! file exported and later quote saved failed");
//			test.log(Status.FAIL, "Failure!! file exported and later quote saved failed");
//			screenshot.captureAndDisplayScreenShot(driver, test);
//			AssertFailedCount++;
//		}
		
		
	}
}		

