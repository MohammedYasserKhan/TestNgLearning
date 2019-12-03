package functionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.QuoteEpTranslationsubmisisonTemplate;
import utility.EReport;

public class QuoteEpTranslationsubmissionTemplateTest extends EReport
{
	@Test(priority=2)
	public void EPQuoteSubmissionTesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote EP Grant file and translate test");
		QuoteEpTranslationsubmisisonTemplate D2 = new QuoteEpTranslationsubmisisonTemplate(MyDriver.driver);
		System.out.println("now moved to Quote ");
	
		if(D2.Eptranslation())
		{
			System.out.println("================================================================");
			System.out.println("Step 4 : users is now in Ep grant page");
			Reporter.log("user is in quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in EP grant page");
			Reporter.log("User is not in EP grant page"); 
		}
			
		if(D2.appnumberpassing())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : users is now providing the application number");
			Reporter.log("user is now providing the application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not provinding the application number");
			Reporter.log("User is not providing the application number"); 
		}
		
		if(D2.translationonly())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : users is now opting for translation only");
			Reporter.log("users is now opting for translation only");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not opting for translation only");
			Reporter.log("users is not opting for translation only"); 
		}
		
		if(D2.jurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : users is Selecting the target countries");
			Reporter.log("users is Selecting the target countries");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not selecting the target countries");
			Reporter.log("users is not selecting the target countries"); 
		}
		
		if(D2.deliverydate())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : users is providing the delivery date");
			Reporter.log("users is providing the delivery date");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not providing the date");
			Reporter.log("users is not providing the date"); 
		
		}
		
		if(D2.Fileupload())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : file uploading");
			Reporter.log("file uploading");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("file uploading stpped");
			Reporter.log("file uplaoding  stopped"); 
		
		}
		if(D2.fileuplaodingquote())
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
		
		if(D2.template())
		{
			System.out.println("================================================================");
			System.out.println("Step 11 : save template");
			Reporter.log("save template");
			test.log(Status.PASS, "passed");
			
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("template not saved ");
			Reporter.log("template not saved");
			test.log(Status.FAIL, "Failed");
		}
	
				
	}
	
}
