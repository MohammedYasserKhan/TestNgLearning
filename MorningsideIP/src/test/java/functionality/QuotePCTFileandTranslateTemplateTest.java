package functionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.QuotePCTFileandTranslateTemplate;
import utility.EReport;

public class QuotePCTFileandTranslateTemplateTest extends EReport 
{
	@Test(priority=2)
	public void QuotePCTFileandSubmissionSaveTesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote EP Grant file and translate test");
		QuotePCTFileandTranslateTemplate D2 = new QuotePCTFileandTranslateTemplate(MyDriver.driver);
		System.out.println("now moved to Quote ");
		
		if(D2.PCTFileandtranslating())
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
		
		if(D2.patent())
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
		
		if(D2.fileandtranslate())
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
		
		if(D2.targetjurisdiction())
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
		
		if(D2.Fileupload())
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
		
		if(D2.reviewpage())
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
		
		if(D2.Template())
		{
			System.out.println("================================================================");
			System.out.println("Step 10 : Template Creation");
			Reporter.log("Template Creation");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("No Template Creation");
			Reporter.log("No Template Creation"); 
		}
	}

}
