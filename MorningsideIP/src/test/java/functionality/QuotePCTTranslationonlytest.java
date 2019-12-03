package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageFactory.login.MyDriver;
import pageFactory.login.QuotePCTTranslationonly;
import utility.EReport;


public class QuotePCTTranslationonlytest extends EReport
{
	public WebDriver driver;
	
	@Test(priority=2)
	public void quotetesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote pct test");
		QuotePCTTranslationonly q1= new QuotePCTTranslationonly(MyDriver.driver);
		System.out.println("====================================================================");
		System.out.println("Step 3 : user is slecting Quote ");
		if(q1.pcttranslation1())
		{
			System.out.println("================================================================");
			System.out.println("users is in quote page opting for translation ");
			Reporter.log("users is in quote page opting for translation ");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not in  quote page opting for translation ");
			Reporter.log("User is not in quote page");
		}
		
		
		if(q1.pcttranslationopted())
		{
			System.out.println("================================================================");
			System.out.println("users is opting for translation ");
			Reporter.log("user is opting for translation");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not opting for translation");
			Reporter.log("User is not opting for translation");
		}
		
		
		if(q1.jurisdiction())
		{
			System.out.println("================================================================");
			System.out.println("users is selecting the jurisdiction ");
			Reporter.log("user is selecting the jurisdiction");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not in jurisdiction");
			Reporter.log("User is not in jurisdiction");
		
		}
		
		if(q1.fileuplaoding())
		{
			System.out.println("================================================================");
			System.out.println("users is now in file uploading page and will upload the file");
			Reporter.log("users is now in file uploading page and will upload the file");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not in file upload page");
			Reporter.log("User is not in file upload page");
		
		}
		
		if(q1.fileuplaodingquote())
		{
			System.out.println("================================================================");
			System.out.println("users has uploaded the file");
			Reporter.log("users has uploaded the file");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not uploaded file");
			Reporter.log("User is not uploaded file");
		}
	
		if(q1.submission())
		{
			System.out.println("================================================================");
			System.out.println("users is now submitting the quote");
			Reporter.log("users is now submitting the quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not submitting the quote");
			Reporter.log("users is now submitting the quote");
		
		}
	}
}
