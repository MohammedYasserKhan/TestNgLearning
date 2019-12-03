package MicrosoftFunctionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import MicrosoftPageFactory.login.Micro_QuotePCTTranslationDiscard;
import pageFactory.login.MyDriver;
import utility.EReport;

public class Micro_QuotePCTTranslateDiscardTest extends EReport
{
	@Test
	public void Micro_QuotePCTTranslationSaveTesting() throws InterruptedException, AWTException
	{
		test=extent.createTest("Quote EP Grant file and translate test");
		Micro_QuotePCTTranslationDiscard QPCT = new Micro_QuotePCTTranslationDiscard(MyDriver.driver);
		System.out.println("================================================================");
		System.out.println("Step 3 : users is now selecting the customer and requester");
		
		if(QPCT.QuotePCTSelecting())
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
		
		if(QPCT.patent())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : users is proding the patent number");
			Reporter.log("user is now providing the patent number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not providing the patent number");
			Reporter.log("User is not providing the patent number"); 
		}
		
		if(QPCT.fileandtranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : users has opted/chosen File and Translate");
			Reporter.log("users has opted/chosen File and Translate");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not choosen File and Translate");
			Reporter.log("User is not choosen File and Translate"); 
		}
		
		if(QPCT.targetjurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : users is selecting the countries");
			Reporter.log("users is selecting the countries");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users has not selected the countries");
			Reporter.log("users has not selected the countries"); 
		}
		
		if(QPCT.Fileupload())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : file uploading");
			Reporter.log("file uploading");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("file uploading stpped");
			Reporter.log("file uplaoding  stopped"); 
		
		}
		if(QPCT.fileuplaodingquote())
		{
			System.out.println("================================================================");
			System.out.println("File uploded successfully");
			Reporter.log("File uploded successfully");
			test.log(Status.PASS, "passed");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User has not uploaded file");
			Reporter.log("User has not uploaded file");
			test.log(Status.FAIL, "Failed");
		}
		
		if(QPCT.reviewpage())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : exporting Quote");
			Reporter.log("exporting Quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Not exporting Quote");
			Reporter.log("Not exporting Quote"); 
		
		}
		
		if(QPCT.Discard())
		{
			System.out.println("================================================================");
			System.out.println("Step 10 : Discard Quote");
			Reporter.log("Discard Quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Not Discard Quote");
			Reporter.log("Not Discard Quote"); 
		}
	}
}
