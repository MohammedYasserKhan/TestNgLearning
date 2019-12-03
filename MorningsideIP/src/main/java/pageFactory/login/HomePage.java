package pageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class HomePage extends LoginPage
{
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	// Webelements of Home page//
	@FindBy(xpath = "//a[contains(.,'Submit New Order')]")
	WebElement Order;
	
	@FindBy(xpath = "//a[contains(.,'Request a Quote')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[contains(.,'View My Projects')]")
	WebElement MyProjects;
	
	@FindBy(xpath = "//span[contains(.,'New Order')]")
	WebElement Neworder;
	
	@FindBy(xpath = "//i[contains(@class,'fas fa-home')]")
	WebElement Home;
	
	@FindBy(xpath = "//span[contains(.,'New Quote')]")
	WebElement Newquote;
	
	@FindBy(xpath = "//a[@tabindex='-1'][contains(.,'Orders')]")
	WebElement Orderview;
	
	public boolean Clickorder()
	{
		
		Order.click();
		boolean Orderclicked = SeleniumFunc.IsElementPresent(Neworder);
		Reporter.log("User is in Neworder page" + Orderclicked);
		if(Orderclicked==true)
		{
			Reporter.log("Success!! user is in New order page");
			return true;
		}
		else
		{
			Reporter.log("unsuccessfull!! use is not in new order page");
			return false;
		}
	}
	
	
	
}
