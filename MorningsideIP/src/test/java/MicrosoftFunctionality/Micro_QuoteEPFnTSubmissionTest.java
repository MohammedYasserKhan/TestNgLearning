package MicrosoftFunctionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import MicrosoftPageFactory.login.Micro_QuoteEPFnTSubmission;
import pageFactory.login.MyDriver;
import utility.EReport;

public class Micro_QuoteEPFnTSubmissionTest extends EReport 
{
	
	@Test()
	public void Micro_QuoteEPFnTSubmissionTesting() throws InterruptedException, AWTException
	{
		test=extent.createTest("Quote EP Grant file and translate test");
		Micro_QuoteEPFnTSubmission QEP = new Micro_QuoteEPFnTSubmission(MyDriver.driver);
		System.out.println("================================================================");
		System.out.println("Step 3 : users is now selecting the customer and requester");
		
		if(QEP.verifyEPselectionSuccessful())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has now selected EP product forom quote section");
			Reporter.log("Success!! User has now selected EP product forom quote section");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail !! User has not selected the product");
			Reporter.log("Fail !! User has not selected the product"); 
			test.log(Status.FAIL, "Fail !! User has not selected the product");

		}
		
		System.out.println("================================================================");
		System.out.println("Step 4 : users is now providing the application number");
		
		if(QEP.verifyEPapplicaitonnumber())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has now provided the application number");
			Reporter.log("Success!! User has now provided the application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail!! User has not provided the application number");
			Reporter.log("Fail!! User has not provided the application number"); 
			test.log(Status.FAIL, "Fail!! User has not provided the application number");
		}
		
		System.out.println("================================================================");
		System.out.println("Step 5 : users is now Selecting claims");
		
		if(QEP.verifyEPclaimselection())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has now selected claims in Ep under Quote");
			Reporter.log("Success!! User has now selected claims in Ep under Quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail!! User has not selected Claims uncer EP quote");
			Reporter.log("Fail!! User has not selected Claims uncer EP quote"); 
			test.log(Status.FAIL, "Fail!! User has not selected Claims uncer EP quote");
		}
		
		System.out.println("================================================================");
		System.out.println("Step 6 : users is now Selecting file and translation in EP");
		
		if(QEP.verifyEPfileandtranslationselection())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has now selected file and translate in Ep under Quote");
			Reporter.log("Success!! User has now selected file and translate in Ep under Quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail!! User has not selected file and translate uncer EP quote");
			Reporter.log("Fail!! User has not selected file and translate under EP quote"); 
			test.log(Status.FAIL, "Fail!! User has not selected Claims uncer EP quote");
		}
		
		System.out.println("================================================================");
		System.out.println("Step 7 : users is now Selecting target countries");
		
		if(QEP.verifytargetjurisdictionselection())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has now selected Target Countries");
			Reporter.log("Success!! User has now selected Target Countries");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail!! User has not selected target countries");
			Reporter.log("Fail!! User has not selected target countries"); 
			test.log(Status.FAIL, "Fail!! User has not selected target countries");
		}
		
		System.out.println("================================================================");
		System.out.println("Step 8 : users is now in file upload page and will the upload the file");
		
		if(QEP.Fileupload())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has now uploading the files");
			Reporter.log("Success!! User has now uploading the files");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail!! User has not uploading the file");
			Reporter.log("Fail!! User has not uploading the file"); 
			test.log(Status.FAIL, "Fail!! User has not uploading the file");
		}
		
		if(QEP.fileuplaodingquote())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has loaded the file");
			Reporter.log("Success!! User has now uploaded the files");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail!! User has not uploaded the file");
			Reporter.log("Fail!! User has not uploaded the file"); 
			test.log(Status.FAIL, "Fail!! User has not uploading the file");

		}
	}
}
