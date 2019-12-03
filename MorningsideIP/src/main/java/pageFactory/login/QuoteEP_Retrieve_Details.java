package pageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import functionality.LoginTest;
import utility.Constants;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class QuoteEP_Retrieve_Details extends LoginTest
{

	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuoteEP_Retrieve_Details(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
				Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=1'][contains(.,'EP Grant / Validation')]")
	WebElement EP;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement sourcelanguage;
	
	@FindBy(xpath = "//select[@class='form-control']/option[2]")
	WebElement french;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationnumber;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71No')]")
	WebElement noclaims;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
	public boolean EpRetrieveDeatails() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		actions.moveToElement(EP).perform();
		EP.click();
		return true;
	}
	
	public boolean EPnumberpassing() throws InterruptedException
	{
		applicationnumber.click();
		Thread.sleep(2000);
		applicationnumber.sendKeys(Constants.appnumber);
		Thread.sleep(2000);
		sourcelanguage.click();
		Thread.sleep(2000);
		french.click();
		Thread.sleep(2000);
		noclaims.click();
		return true;
	}
	
	public boolean fileandtranslate()
	{
		fileandtranslate.click();
		return true;
	}
	
	
}

