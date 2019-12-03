package functionality;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageFactory.login.MyDriver;
import pageFactory.login.Order_EP_FilenTranslate_Submission;
import utility.EReport;


public class Order_EP_FilenTranslate_Submission_Test extends EReport
{
public  WebDriver driver;
	
	@Test()
	public void ordertesting() throws Exception
	{
		test=extent.createTest("order test");
		Order_EP_FilenTranslate_Submission o = new Order_EP_FilenTranslate_Submission(MyDriver.driver);
		System.out.println("now moved to order1");
		
		if(o.OrderEPSelection())
		{
			System.out.println("================================================================");
			System.out.println("users is in order page finallyyy");
			Reporter.log("user is in order");
			test.log(com.aventstack.extentreports.Status.PASS,"Success");
			test.log(Status.PASS, "success");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("user is not in order");
			Reporter.log("User is not in order"); 
			test.log(Status.FAIL, "failed");
		}
		
		if(o.validationtest())
		{
			System.out.println("================================================================");
			System.out.println("Testing validations in step2");
			Reporter.log("Testing validations in step2");
			test.log(com.aventstack.extentreports.Status.PASS,"success validation tested");
			test.log(Status.PASS, "success validation tested");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Validation is not tested");
			Reporter.log("Validation is not tested"); 
			test.log(Status.FAIL, "Validation failed");
		}
		
		if(o.Applicationnumber())
		{
			System.out.println("================================================================");
			System.out.println("Providing valid application number");
			Reporter.log("Providing valid application number");
			test.log(com.aventstack.extentreports.Status.PASS,"Application number is provided");
			test.log(Status.PASS, "Application number is provided");
		}
		else
		{
			System.out.println("================================================================");
			System.out.println("Application  number is not provided");
			Reporter.log("Application  number is not provided"); 
			test.log(Status.FAIL, "Application  number is not provided");
		}
		
		if(o.sourcelanguage())
		{
			
		}
			
		if(o.EPCliams())
		{
			
		}
		
		if(o.EPFileandTranslate())
		{
			
		}
		if(o.patentinfo())
		{
			
		}
		if(o.targetcountries())
		{
			
		}
		if(o.step2nextbutton())
		{
			
		}
		
		if(o.fileuploadbutton())
		{
			
		}
		if(o.movingtoreviewpage())
		{
			
		}
		
		if(o.ordersubmission())
		{
			
		}
		
	}
	
	
}
