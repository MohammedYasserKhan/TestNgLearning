package MicrosoftFunctionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import MicrosoftPageFactory.login.Micro_QuoteEPTranslationsubmission;
import pageFactory.login.MyDriver;
import utility.EReport;

public class Micro_QuoteEPTranslationTest extends EReport
{

	@Test()
	public void Micro_QuoteEPFnTSubmissionTesting() throws InterruptedException, AWTException
	{
		test=extent.createTest("Quote EP Grant file and translate test");
		Micro_QuoteEPTranslationsubmission QEP = new Micro_QuoteEPTranslationsubmission(MyDriver.driver);
		System.out.println("================================================================");
		System.out.println("Step 3 : users is now selecting the customer and requester");
		
		if(QEP.VerifyQuoteEPselectionSuccessful())
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
		System.out.println("Step 5 : users is now selecting the translation");
		
		if(QEP.verifytranslationselection())
		{
			System.out.println("================================================================");
			System.out.println("Success!! User has now selected the translation option");
			Reporter.log("Success!! User has now selected the translation option");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Fail!! User has not selected the translation");
			Reporter.log("Fail!! User has not selected the translation"); 
			test.log(Status.FAIL, "Fail!! User has not selected the translation");
		}
		
		System.out.println("================================================================");
		System.out.println("Step 6 : users is now selecting the target countries");
		
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
		System.out.println("Step 7 : users is now in file upload page and will the upload the file");
		
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
