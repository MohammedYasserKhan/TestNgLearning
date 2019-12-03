package MicrosoftFunctionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import MicrosoftPageFactory.login.Micro_QuoteEPFnTDiscard;
import pageFactory.login.MyDriver;
import utility.EReport;

public class Micro_QuoteEPFnTDiscardTest extends EReport
{
	@Test
	public void Micro_QuoteEPFnTDiscardTesting() throws InterruptedException, AWTException
	{
		test=extent.createTest("Quote EP Grant file and translate test");
		Micro_QuoteEPFnTDiscard QPCT = new Micro_QuoteEPFnTDiscard(MyDriver.driver);
		System.out.println("================================================================");
		System.out.println("Step 3 : users is now selecting the customer and requester");
		
		if(QPCT.verifyEPselectionSuccessful())
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
		
		if(QPCT.verifyEPapplicaitonnumber())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : users is proding the application number");
			Reporter.log("user is now providing the application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not providing the application number");
			Reporter.log("User is not providing the application number"); 
		}
		
		if(QPCT.Quoteepclaim())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : users has opted/chosen claims");
			Reporter.log("users has opted/chosen claims");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not choosen claims");
			Reporter.log("User is not choosen claims"); 
		}
		
		if(QPCT.QuoteEPFileandTranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : users is chosing/selecting file and translate");
			Reporter.log("users is chosing/selecting file and translate");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not chosing/selecting file and translate");
			Reporter.log("users is not chosing/selecting file and translate"); 
		}
		
		if(QPCT.Jurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : User is choosing the target countries");
			Reporter.log("User is choosing the target countries");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not choosing the target countries");
			Reporter.log("User is not choosing the target countries"); 
		
		}
		if(QPCT.Fileupload())
		{
			System.out.println("================================================================");
			System.out.println("File uploding");
			Reporter.log("File uploding");
			test.log(Status.PASS, "passed");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User has not uploaded file");
			Reporter.log("User has not uploaded file");
			test.log(Status.FAIL, "Failed");
		}
		
		if(QPCT.fileuplaodingquote())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : uploaded succesfully");
			Reporter.log("uploaded successfully");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("not uploaded successfully");
			Reporter.log("Not uploaded successfully"); 
		
		}
		

		if(QPCT.Discard())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : Discard Quote");
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
