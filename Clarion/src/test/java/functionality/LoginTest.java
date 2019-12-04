package functionality;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.LoginPage;
import utility.Browser;
import utility.Constants;
import utility.EReport;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class LoginTest extends EReport
{
	private WebDriver driver;
	private Browser b = new Browser();
	JavaHelpers JH = new JavaHelpers();
	
	
	@Parameters({ "browser", "environment", "os" })
	@BeforeMethod
	public void setUp(String browser, String environment , String OS) throws Exception 
	{		
		driver= b.setUp(browser, environment, OS);
		
	}

	@AfterMethod
	public void teardown() throws Exception
	{
		b.tearDown();
	}
	
	
	/* Test 1: 
	 * Verify that user can login successfully
	*/
	
	@Parameters({ "username", "password" })
	@Test
	private void loginSuccessful(String username , String password) throws Exception
	{
		System.out.println("====" + "\n" +
				"Test 4 : Verify that user can login with valid credentials"  + "\n" +
	 			"====");
		Reporter.log("====" + "\n" +
	 			  "Test 4 : Verify that user can login with valid credentials"  + "\n" +
			 	  "====");
		test = extent.createTest("Login Test");
		
		int AssertFailedCount=0 ;
		SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
		LoginPage login = new LoginPage(driver);
		EReport screenShot  = new EReport();

		System.out.println("Step 1 : Navigate to Login page : " + Constants.ApplicationURL);
		SeleniumFunc.ToGoToUrl(Constants.ApplicationURL);
		Reporter.log("Step 1 : Navigate to Login page : " + Constants.ApplicationURL); 
			

		System.out.println("Step 3 : Verifying whether user is logged-in successfully or not");
		Reporter.log("Step 3 : Verifying whether user is logged-in successfully or not"); 
			
			if(login.verifyLoginSuccessful())
			{
				System.out.println("Success !! User logged-in Successfully");
				Reporter.log("Success !! User logged-in Successfully"); 
				test.log(Status.PASS, "Success !! User logged-in Successfully");
			}
			else
			{
				System.out.println("Failure !! Login Failed");
				Reporter.log("Failure !! Login Failed"); 
				test.log(Status.FAIL,"Failure !! Login Failed");
				screenShot.captureAndDisplayScreenShot(driver, test);
				AssertFailedCount++;
			}
			
		
		/*
		 * Marking Test Pass or Fail as per the value of AssertFailedCount variable
		 */
	 	if(AssertFailedCount>0)	
		{
			
			//Marking this test as Failed
			
			System.out.println("---- Test Failed. Please check the console or TestNg report for details");
			Reporter.log("---- Test Failed. Please check the console or TestNg report for details");
			
			Assert.fail();
		}
		
	}	
		
}
