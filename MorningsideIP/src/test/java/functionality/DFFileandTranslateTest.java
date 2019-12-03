package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.DFFileandTranslate;
import pageFactory.login.MyDriver;
import utility.EReport;

public class DFFileandTranslateTest extends EReport
{

public WebDriver driver;
	
	@Test(priority=2)
	public void quotetesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote pct test");
		DFFileandTranslate D1= new DFFileandTranslate(MyDriver.driver);
		System.out.println("now moved to Quote ");
		
		if(D1.DFFile())
		{
			System.out.println("================================================================");
			System.out.println("Step 4: users is Selecting quote");
			Reporter.log("user is in quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not in Quote");
			Reporter.log("User is not in quote"); 
		}
		if(D1.POnumberpassing())
		{
			System.out.println("================================================================");
			System.out.println("Step 5: PO number passing");
			Reporter.log("Step 5: PO number passing");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not passing Po number");
			Reporter.log("User is not passing Po number"); 
		
		}
		if(D1.sourcelanguage())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : Source langauage selection passing");
			Reporter.log("Step 6 : Source langauage selection passing");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Source langauge not selected");
			Reporter.log("Source language not selected"); 
		
		}
		
		if(D1.fileandtranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : User choose file and translate");
			Reporter.log("Step 7 : User choose file and translate");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Source langauge not opted for file and translate");
			Reporter.log("Source language not opted for file and translate"); 
		
		}
			
		if(D1.pateninfo())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : Patent info passed");
			Reporter.log("Step 8 : Patent info passed");
			//System.out.println("number of priority application info provided");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Patent info not passed");
			Reporter.log("Patent info not passed"); 
		
		}
		
		if(D1.TargetJurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : Selecting the target countries");
			Reporter.log("Step 9 : Selecting the target countries");
			//System.out.println("number of priority application info provided");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Target countries not selected");
			Reporter.log("Target countries not selected"); 
		
		}
		
		if(D1.Fileupload())
		{
			System.out.println("================================================================");
			System.out.println("file uploading");
			Reporter.log("file uploading");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("file uploading stpped");
			Reporter.log("file uplaoding  stopped"); 
		
		}
		if(D1.fileuplaodingquote())
		{
			System.out.println("================================================================");
			System.out.println("User has uploaded file");
			Reporter.log("User has uploaded file");
			test.log(Status.PASS, "passed");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User has not uploaded file");
			Reporter.log("User has not uploaded file");
			test.log(Status.FAIL, "Failed");
	
		}
		if(D1.quotecontinue())
		{
			System.out.println("================================================================");
			System.out.println("User is now moving to review page");
			Reporter.log("User is now moving to review page");
			test.log(Status.PASS, "passed");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not moving to review page");
			Reporter.log("User is now moving to review page");
			test.log(Status.FAIL, "Failed");
		}
		if(D1.reviewpage())
		{
			System.out.println("================================================================");
			System.out.println("User is now in review page and submitting the quote");
			Reporter.log("User is now in review page and submitting the quote");
			test.log(Status.PASS, "passed");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in review page and not submitting the quote");
			Reporter.log("User is not in review page and not submitting the quote");
			test.log(Status.FAIL, "Failed");
		}	
		}
	
		

}
