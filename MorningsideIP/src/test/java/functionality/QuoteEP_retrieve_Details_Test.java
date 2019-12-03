package functionality;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageFactory.login.MyDriver;
import pageFactory.login.QuoteEP_Retrieve_Details;
import utility.EReport;

public class QuoteEP_retrieve_Details_Test extends EReport
{
	@Test
	public void QuoteEP_retrieve_Details_Testing() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote EP Grant file and translate test");
		QuoteEP_Retrieve_Details D2 = new QuoteEP_Retrieve_Details(MyDriver.driver);
		System.out.println("step 3: now moved to Quote ");
		
		if(D2.EpRetrieveDeatails())
		{
			System.out.println("================================================================");
			System.out.println("Step 4 : users is now in Ep grant page");
			Reporter.log("user is in quote");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in EP grant page");
			Reporter.log("User is not in EP grant page"); 
		}
		
		if(D2.EPnumberpassing())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : Passing the application number");
			Reporter.log("Passing the application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not passing the application number");
			Reporter.log("User is not passing the application number"); 
		
		}
		
		if(D2.fileandtranslate())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : Patent detail gets loaded up");
			Reporter.log("Patent Details gets loaded up");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Patent details is not loaded up");
			Reporter.log("Patent details is not loaded up"); 
		}
	}		
}
