package MicrosoftFunctionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import MicrosoftPageFactory.login.MicrosoftAppnumberScrapping;
import pageFactory.login.MyDriver;
import utility.EReport;

public class MicrosoftAppnumberScrappingTest extends EReport  
{
	@Test()
	public void MicrosoftAppnumberScrappingTesting() throws InterruptedException, AWTException
	{
		test=extent.createTest("Quote EP Grant file and translate test");
		MicrosoftAppnumberScrapping s = new MicrosoftAppnumberScrapping(MyDriver.driver);
		if(s.EPSelection())
		{
			System.out.println("================================================================");
			System.out.println("Step 3 : users is now selecting the customer and requester");
			Reporter.log("users is now selecting the customer and requester");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.Pass, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("users is not selecting the customer");
			Reporter.log("users is not selecting the customer"); 
		}
		
		if(s.EPappnumber())
		{
			System.out.println("================================================================");
			System.out.println("Step 4 : users is now providing the application number");
			Reporter.log("user is providinig the application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not providing the application number");
			Reporter.log("User is not providing the application number"); 
		}
		
		if(s.epclaim())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : Users is Selecting the claims");
			Reporter.log("Users is Selecting the claims");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Users is not selecting the claims");
			Reporter.log("Users is not selecting the claims"); 
		}
		
		if(s.EPFileandTranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : Users is now selecting file and translate");
			Reporter.log("Users is now selecting file and translate");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Users is not selecting file and translate");
			Reporter.log("Users is not selecting file and translate"); 
		}
		
		if(s.EpTranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : Users is now selecting Translation");
			Reporter.log("Users is now selecting Translation");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Users is now selecting Translation");
			Reporter.log("Users is now selecting Translation"); 
		}
		
		if(s.PCTselection())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : Users is now selecting PCT");
			Reporter.log("Users is now selecting PCT");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Users is not selecting PCT");
			Reporter.log("Users is not selecting PCT"); 
		}
		
		if(s.PCTappnumber())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : Users is now providing PCT appnumber");
			Reporter.log("Users is now providing PCT appnumber");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Users is not providing PCT appnumber");
			Reporter.log("Users is not providing PCT appnumber"); 
		
		}
		
		if(s.PCTfileandtranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : Users is now PCT selecting file and translate");
			Reporter.log("Users is now PCT selecting file and translate");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Users is not PCT selecting file and translate");
			Reporter.log("Users is not PCT selecting file and translate"); 
		}
		
		if(s.pcttranslation())
		{
			System.out.println("================================================================");
			System.out.println("Step 10 : Users is now PCT selecting translate only option");
			Reporter.log("Users is now PCT selecting translate only option");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Users is not PCT selecting translate only option");
			Reporter.log("Users is not PCT selecting translate only option"); 
		}
	}
}
