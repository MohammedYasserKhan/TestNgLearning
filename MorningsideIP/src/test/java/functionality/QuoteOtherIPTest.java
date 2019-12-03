package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.QuoteOtherIP;
import utility.EReport;

public class QuoteOtherIPTest extends EReport
{
	public WebDriver driver;
	
	
	@Test(priority=2)
	public void OtherIPTesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote OtherIP  test");
		QuoteOtherIP O1 = new QuoteOtherIP(MyDriver.driver);
		System.out.println("now moved to Quote ");
		if(O1.Otherip())
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
		
		if(O1.OtherIpContinue())
		{
			System.out.println("================================================================");
			System.out.println("Step 5: users is Selecting languages");
			Reporter.log("user is selecting the languages");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not in Quote");
			Reporter.log("User is not in quote"); 
		}

		if(O1.Fileupload())
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
		if(O1.fileuplaodingquote())
		{
			System.out.println("================================================================");
			System.out.println("User has uploaded file");
			Reporter.log("User has uploaded file");
			test.log(Status.PASS, "passed");
		}
		if(O1.reviewpage())
		{
			
		}
		
	}
	
	
}
