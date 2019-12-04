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

public class LoginPage {

	WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		// This initElements method will create all WebElements
		// PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
				Constants.WebDriverWaitDuration), this);
	}

	/*
	 * All WebElements are identified by @FindBy annotation
	 * 
	 * @FindBy can accept tagName, partialLinkText, name, linkText, id, css,
	 * className, xpath as attributes.
	 */

	// Username Input Field
	@FindBy(css = "")
	WebElement Username;

	// Password Input Field
	@FindBy(css = "")
	WebElement Password;

	// Login Button
	@FindBy(css = "")
	WebElement Login;

	// Logout Button
	@FindBy(css = "a[href='/logout']")
	WebElement Logout;

	// Dashboard
	@FindBy(css = "")
	WebElement Dashboard;

	// Submit Login Form
	public void submitLogin() {
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
