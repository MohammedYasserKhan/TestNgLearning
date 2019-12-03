package functionality;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.QuoteEpGrantSave;
import utility.EReport;

public class QuoteEpgrantSaveTest extends EReport
{
	
public WebDriver driver;
	
	@Test()
	public void QuoteEpgrantSaveTesting() throws InterruptedException, AWTException
	{
		
		test=extent.createTest("Quote EP Grant file and translate test");
		QuoteEpGrantSave D2 = new QuoteEpGrantSave(MyDriver.driver);
		System.out.println("now moved to Quote ");
		
		if(D2.QuoteEpfileandtranslate())
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
		
		if(D2.QuoteEpfileandtranslatecontinue1())
		{
			System.out.println("================================================================");
			System.out.println("Step 5 : users is tested validation");
			Reporter.log("users is tested validation");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not tested validation");
			Reporter.log("User is not tested validation"); 
		}
	
		
		if(D2.QuoteEpfileandtranslatecontinue2())
		{
			System.out.println("================================================================");
			System.out.println("Step 6 : Patent details gets loaded up");
			Reporter.log("Patent details gets loaded up");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Patent details is not loaded up");
			Reporter.log("Patent details is not loaded up"); 
		}
		
		if(D2.claims())
		{
			System.out.println("================================================================");
			System.out.println("Step 7 : User is opting for Yes to claims");
			Reporter.log("User is opting for Yes to claims");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is opting for No to claims");
			Reporter.log("User is opting for No to claims"); 
		
		}
		
		if(D2.Jurisdiction_1())
		{
			System.out.println("================================================================");
			System.out.println("Step 8 : User is Choosing the target countries");
			Reporter.log("User is Choosing the target countries");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not choosing the target countries");
			Reporter.log("User is not choosing the target countries"); 
		}
		
		if(D2.Fileupload())
		{
			System.out.println("================================================================");
			System.out.println("Step 9 : file uploading");
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
	
		if(D2.quotesubmisison())
		{
			System.out.println("================================================================");
			System.out.println("Step 10 : submission page");
			Reporter.log("submission page");
			test.log(Status.PASS, "passed");
			
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("not in submission page");
			Reporter.log("not in submission page");
			test.log(Status.FAIL, "Failed");
		}
	
		if(D2.export())
		{
			System.out.println("================================================================");
			System.out.println("Exported excel");
			Reporter.log("Exported excel");
			test.log(Status.PASS, "passed");
			
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Not exported");
			Reporter.log("Not exported");
			test.log(Status.FAIL, "Failed");
		
		}
		
		if(D2.approve())
		{
			System.out.println("================================================================");
			System.out.println("Step 11 : save quote");
			Reporter.log("save quote");
			test.log(Status.PASS, "passed");
			
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Quote not saved ");
			Reporter.log("Quote not saved");
			test.log(Status.FAIL, "Failed");
		}
	
	
		}
	
}
