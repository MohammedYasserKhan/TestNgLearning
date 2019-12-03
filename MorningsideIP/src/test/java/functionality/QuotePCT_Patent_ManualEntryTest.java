package functionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.QuotePCT_Patent_ManualEntry;
import utility.EReport;

public class QuotePCT_Patent_ManualEntryTest extends EReport 
{
	@Test
	public void QuotePCT_Patent_ManualEntryTesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote EP Grant file and translate test");
		QuotePCT_Patent_ManualEntry D4 = new QuotePCT_Patent_ManualEntry(MyDriver.driver);
		System.out.println("now moved to Quote ");
	
		if(D4.PCTFileandtranslating_1())
		{
			System.out.println("================================================================");
			System.out.println("Step 4 : users is now in PCT grant page");
			Reporter.log("user is in PCT quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in PCT grant page");
			Reporter.log("User is not in PCT grant page"); 
		}
				
		if(D4.patent())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : users is now providing pct number");
			Reporter.log("users is now providing pct number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not providing pct number");
			Reporter.log("users is not providing pct number"); 
		}
			
		if(D4.fileandtranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : users is opting for file and translate");
			Reporter.log("users is opting for file and translate");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not opting for file and translate");
			Reporter.log("users is not opting for file and translate"); 
		}
		
		if(D4.patent_details())
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
			System.out.println("users is now manually providing the patent details");
			Reporter.log("users is now manually providing the patent details"); 
		
		}
		
		if(D4.targetjurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : users is now selecting the countries");
			Reporter.log("users is now selecting the countires");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not selecting the countires");
			Reporter.log("users is not selecting the countires"); 
		}
		
		if(D4.Fileupload())
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
		
		if(D4.fileuplaodingquote())
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
		
		if(D4.reviewpage())
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
		
		if(D4.approvequpote())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : approving Quote");
			Reporter.log("approving  Quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Not approving Quote");
			Reporter.log("Not approving  Quote"); 
		
		}
	}
	
}
