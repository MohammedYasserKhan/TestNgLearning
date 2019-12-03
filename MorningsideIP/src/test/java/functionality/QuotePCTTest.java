package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.QuotePCT;
import utility.EReport;

public class QuotePCTTest extends EReport
{
	
	public WebDriver driver;
	
	@Test(priority=2)
	public void quotetesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote pct test");
		QuotePCT q1 = new QuotePCT(MyDriver.driver);
		System.out.println("now moved to Quote ");
		
		if(q1.quote1())
		{
			System.out.println("================================================================");
			System.out.println("users is in quote page finallyyy");
			Reporter.log("user is in order");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not in Quote");
			Reporter.log("User is not in quote"); 
		}
		
		if(q1.appnumber())
		{
			System.out.println("================================================================");
			System.out.println("users has given the application number");
			Reporter.log("user has given the application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user has not provided appnumber");
			Reporter.log("User has not provided the appnumber"); 
		}
		
		if(q1.page1continue())
		{
			System.out.println("================================================================");
			System.out.println("users is page continuation");
			Reporter.log("users is page continuation");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user has stpped");
			Reporter.log("User has stopped"); 
		
		}
		
		if(q1.page2())
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
		if(q1.fileuplaodingquote())
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
		if(q1.quotecontinue())
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
		if(q1.reviewpage())
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

