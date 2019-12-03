package functionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.Order_PCT_FileandTranslate;
import utility.EReport;

public class Order_PCt_FileandTranslate_Test extends EReport 
{

	@Test()
	public void PCTQuoteSubmissionTesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote EP Grant file and translate test");
		Order_PCT_FileandTranslate orderPCT = new Order_PCT_FileandTranslate(MyDriver.driver);
		System.out.println("now moved to Quote ");
		
		if(orderPCT.OrderPCTSelection())
		{
			System.out.println("================================================================");
			System.out.println("Step 4 : users is now in Order PCT grant page");
			Reporter.log("user is in Order PCT ");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in PCT grant page");
			Reporter.log("User is not in PCT grant page"); 
		}
		
		if(orderPCT.applicationnumberpct())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : users is now in providing the application number");
			Reporter.log("users is now in providing the application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not in providing the application number");
			Reporter.log("users is not in providing the application number"); 
		}
		
		if(orderPCT.orderpct_fileandtranslate())
		{

			System.out.println("================================================================");
			System.out.println("Step 6 : users is now selecting file and translate");
			Reporter.log("users is now selecting file and translate");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not selecting file and translate");
			Reporter.log("users is now selecting file and translate"); 
		}
	
		if(orderPCT.targetjurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : users is now selecting target countries");
			Reporter.log("users is now selecting target countries");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not selecting target countries");
			Reporter.log("users is not selecting target countries"); 
		
		}
		if(orderPCT.Fileupload())
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
		if(orderPCT.fileuplaodingquote())
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
		
		if(orderPCT.ordersubmission())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : PCT Order Submission");
			Reporter.log("PCT Order Submission");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("PCT Order Submission failed");
			Reporter.log("PCT Order Submission failed");
		}
	}
}
