package functionality;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.OrderEpgrant;
import utility.EReport;

public class OrderEpgrantTest extends EReport

{
	public  WebDriver driver;
	
	@Test(priority=2)
	public void ordertesting() throws Exception
	{
		
		test=extent.createTest("order test");
		OrderEpgrant o = new OrderEpgrant(MyDriver.driver);
		System.out.println("now moved to order1");
		
		if(o.order1())
		{
			System.out.println("================================================================");
			System.out.println("users is in order page finallyyy");
			Reporter.log("user is in order");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			//test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not in order");
			Reporter.log("User is not in order"); 
			//test.log(Status.FAIL, "failed");
		}

		if(o.passvalue())
		{
			System.out.println("================================================================");
			System.out.println("user has provided the application number");
			Reporter.log("User ha sprovided the application numbmer");
			test.log(com.aventstack.extentreports.Status.PASS,"passed" );
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user has not provided the application number");
			Reporter.log("User has not provided the application numbmer");
			test.log(com.aventstack.extentreports.Status.FAIL,"failed" );
		}
		
		if(o.page1cont())
		{
			System.out.println("================================================================");
			System.out.println("User is now in target jurisdiction");
			Reporter.log("User is now in target jurisdiction");
			test.log(Status.PASS, "passed");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in target jurisdiction");
			Reporter.log("User is not in target jurisdiction");
			test.log(Status.FAIL, "Failed");
		}
		
		if(o.page2())
		{
			System.out.println("================================================================");
			System.out.println("User is in  uploaded file");
			Reporter.log("User is in uploaded file");
			test.log(Status.PASS, "passed");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("User is not in uploading page");
			Reporter.log("User is not in uploading page");
			test.log(Status.FAIL, "failed");
		}
			
		if(o.fileuplaodingorder())
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
		o.ordercontinue();
	}

	
	
	
	
}
