package pageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import utility.Constants;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class LoginPage 
{
	public  WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		MyDriver.driver=driver;
		// This initElements method will create all WebElements
		// PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}

	
	// Username Input Field
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Username;

	// Password Input Field
	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement Password;

	// Login Button
	@FindBy(xpath = "//input[contains(@type,'button')]")
	WebElement Login;

	// Logout Button
	@FindBy(css = "a[href='/logout']")
	WebElement Logout;

	// Dashboard
	@FindBy(xpath = "//h1[contains(.,'Welcome, Clarion - Yaseer')]")
	WebElement Dashboard;

	// Submit Login Form
	public void submitLogin() 
	{
		Username.clear();
		Password.clear();
		Username.sendKeys(Constants.Username);
		Password.sendKeys(Constants.Password);
		Login.click();
	}

	// Verify User logged-In
	public boolean verifyLoginSuccessful()
	{
		submitLogin();
		boolean userLoggedIn = SeleniumFunc.IsElementPresent(Dashboard);
		Reporter.log("User Logged-In : "+userLoggedIn);
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
