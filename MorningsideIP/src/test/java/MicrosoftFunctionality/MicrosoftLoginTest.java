package MicrosoftFunctionality;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import MicrosoftPageFactory.login.MicrosoftLogin;
import utility.Browser;
import utility.Constants;
import utility.EReport;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class MicrosoftLoginTest extends EReport
{
	public WebDriver driver;
	public Browser b = new Browser();
	JavaHelpers JH = new JavaHelpers();
	
	@Parameters({ "browser", "environment", "os" })
	@BeforeMethod
	public void setUp(String browser, String environment , String OS) throws Exception 
	{		
		driver= b.setUp(browser, environment, OS);
	}

//	@AfterMethod
//	public void teardown() throws Exception
//	{
//		b.tearDown();
//	}
//	
	
	/* Test 1: 
	 * Verify that user can login successfully
	*/
	
	@Parameters({ "Username", "Password" })
	@Test
	public void loginSuccessful() throws Exception
	{
		driver.manage().window().maximize();
//		System.out.println("================================================" + "\n" +
//				"Test 4 : Verify that user can login with valid credentials"  + "\n" +
//	 			"====");
//		Reporter.log("=======================================================" + "\n" +
//	 			  "Test 4 : Verify that user can login with valid credentials"  + "\n" +
//			 	  "====");
		test = extent.createTest("Microsoft Login Test");
		int AssertFailedCount=0 ;
		SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
		MicrosoftLogin login = new MicrosoftLogin(driver);
		EReport screenShot = new EReport();
		System.out.println("================================================================");
		System.out.println("Step 1 : Navigate to Login page : " + Constants.ApplicationURL);
		SeleniumFunc.ToGoToUrl(Constants.ApplicationURL);
		Reporter.log("Step 1 : Navigate to Login page : " + Constants.ApplicationURL); 
		System.out.println("================================================================");
		System.out.println("Step 2 : Verifying whether user is logged-in successfully or not");
		Reporter.log("Step 2 : Verifying whether user is logged-in successfully or not"); 
		if(login.micrologin())
		{
			System.out.println("================================================================");
			System.out.println("Success !! User logged-in Successfully");
			Reporter.log("Success !! User logged-in Successfully"); 
			test.log(Status.PASS, "Success !! User logged-in Successfully");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Faile !! User logged-in unsuccessfully");
			Reporter.log("Faile !! User logged-in unsuccessfully"); 
			test.log(Status.FAIL, "FAile !! User logged-in unsuccessfully");
		}

		// */ Marking Test Pass or Fail as per the value of AssertFailedCount variable
		// */
	 	if(AssertFailedCount>0)	
		{
	 		//Marking this test as Failed
			System.out.println("---- Test Failed. Please check the console or TestNg report for details");
			Reporter.log("---- Test Failed. Please check the console or TestNg report for details");
			Assert.fail();
		}
	}
}
