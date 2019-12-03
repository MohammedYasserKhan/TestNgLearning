package MicrosoftPageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import pageFactory.login.MyDriver;
import utility.Constants;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class MicrosoftLogin 
{
	public  WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);

	public MicrosoftLogin(WebDriver driver) 
	{
		this.driver = driver;
		MyDriver.driver=driver;
		// This initElements method will create all WebElements
		// PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
		// Dashboard
		@FindBy(xpath = "//h1[contains(.,'Welcome, VNDR.Clarion2')]")
		WebElement Dashboard;

		// for Micorsoft credentials login///
		@FindBy(xpath = "//a[contains(.,'Client Solutions Login')]")
		WebElement clientsolutionlogin;

		@FindBy(xpath = "//input[contains(@type,'email')]")
		WebElement microusername;
		
		@FindBy(xpath = "//input[contains(@type,'submit')]")
		WebElement mnext;
		
		@FindBy(xpath = "//input[contains(@name,'passwd')]")
		WebElement mpassword;
		
		@FindBy(xpath = "//input[contains(@type,'submit')]")
		WebElement msingin;
		
		@FindBy(xpath = "//input[@value='Yes']")
		WebElement Yes;
		
		// Submit Login Form
		public boolean micrologin() throws InterruptedException
		{
			clientsolutionlogin.click();
			microusername.clear();
			microusername.sendKeys(Constants.musername);
			mnext.click();
			mpassword.clear();
			mpassword.sendKeys(Constants.mpassword);
			Thread.sleep(2000);
			msingin.click();
			Thread.sleep(20000);
			Yes.click(); 
			return true;
		}
		
		// Verify User logged-In
		public boolean verifymicrologin() throws InterruptedException
		{
			micrologin();
			boolean userLoggedIn = SeleniumFunc.IsElementPresent(Dashboard);
			Reporter.log("User logged- In"+userLoggedIn);
			if(userLoggedIn==true)
			{
				Reporter.log("Success !! User Logged-In Successfully");
				return true;
			}
			else
			{
				Reporter.log("Failure !! Login Failed");
				return false;
			}
		}
}