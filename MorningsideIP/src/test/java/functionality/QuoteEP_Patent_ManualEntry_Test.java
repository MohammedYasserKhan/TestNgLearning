package functionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.QuoteEP_Patent_ManualEntry;
import utility.EReport;

public class QuoteEP_Patent_ManualEntry_Test extends EReport 
{

	@Test()
	public void QuoteEP_Patent_ManualEntry_Testing() throws InterruptedException, AWTException
	{
		test=extent.createTest("Quote EP Grant file and translate test");
		QuoteEP_Patent_ManualEntry D2 = new QuoteEP_Patent_ManualEntry(MyDriver.driver);
		System.out.println("now moved to Quote ");
		
		if(D2.Epselection())
		{
			System.out.println("================================================================");
			System.out.println("Step 4 : users is now in EP page");
			Reporter.log("user is in EP quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in EP page");
			Reporter.log("User is not in EP page"); 
		}
		if(D2.applicationnumber())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : users is now providing the applicaiton number");
			Reporter.log("users is now providing the applicaiton number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not providing the applicaiton number");
			Reporter.log("users is not providing the applicaiton number"); 
		}
		
		if(D2.claimsEP())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : users is now opting for claims");
			Reporter.log("users is now opting for claims");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not opting for claims");
			Reporter.log("users is not opting for claims"); 
		}
		
		if(D2.patentdetails())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : users is now manually providing the patent details");
			Reporter.log("users is now manually providing the patent details");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not providing the patent details");
			Reporter.log("users is notproviding the patent details"); 
		}
		
		if(D2.Jurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : User is Choosing the target countries");
			Reporter.log("User is Choosing the target countries");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not choosing the target countries");
			Reporter.log("User is not choosing the target countries"); 
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
		
		if(D2.quotesubmisison())
		{
			System.out.println("================================================================");
			System.out.println("Step 10 : submission page");
			Reporter.log("submission page");
			test.log(Status.PASS, "passed");
			
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("not in submission page");
			Reporter.log("not in submission page");
			test.log(Status.FAIL, "Failed");
		}
	
		if(D2.export())
		{
			System.out.println("================================================================");
			System.out.println("Exported excel");
			Reporter.log("Exported excel");
			test.log(Status.PASS, "passed");
			
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Not exported");
			Reporter.log("Not exported");
			test.log(Status.FAIL, "Failed");
		
		}
		
		if(D2.approve())
		{
			System.out.println("================================================================");
			System.out.println("Step 11 : Quote approved page");
			Reporter.log("Quote approved");
			test.log(Status.PASS, "passed");
			
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Quote not approvced ");
			Reporter.log("Quote not approved");
			test.log(Status.FAIL, "Failed");
		}
	
		}
}