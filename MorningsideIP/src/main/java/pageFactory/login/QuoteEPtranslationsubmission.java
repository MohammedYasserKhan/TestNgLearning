package pageFactory.login;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import utility.Constants;
import utility.FileUpload;
import utility.SeleniumFunctions;

public class QuoteEPtranslationsubmission 
{
	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuoteEPtranslationsubmission(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement Newselection;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quoteselection;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=1'][contains(.,'EP Grant / Validation')]")
	WebElement EPselection;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationnumber;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement Sourcelanguage;
	
	@FindBy(xpath = "//select[@class='form-control']/option[2]")
	WebElement English;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71No')]")
	WebElement noclaims;
	
	@FindBy(xpath = "//input[@value='translation']")
	WebElement translationonly;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement targetjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Member States')]")
	WebElement memberstate;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement targetok;
	
	@FindBy(xpath = "//input[contains(@name,'txtRequestedDeliveryDate')]")
	WebElement delivertdate;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement next2;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//button[contains(@onclick,'step2CalculatorValidationHandler();')]")
	WebElement frameyes;
	
	@FindBy(xpath = "//button[contains(@id,'btnSubmit')]")
	WebElement  submitquote;
	
	public boolean Eptranslation() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(Newselection).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quoteselection).perform();
		actions.moveToElement(EPselection).perform();
		EPselection.click();
		return true;
	}
	
	public boolean appnumberpassing() throws InterruptedException
	{
		next2.click();
	Thread.sleep(2000);	
	applicationnumber.click();
	Thread.sleep(2000);
	applicationnumber.sendKeys(Constants.appnumber);
	Thread.sleep(2000);
	Sourcelanguage.click();
	Thread.sleep(2000);
	English.click();
	
	return true;
	}

	public boolean translationonly() throws InterruptedException
	{
		noclaims.click();
		Thread.sleep(2000);
		translationonly.click();
		return true;
	}
	
	public boolean jurisdiction() throws InterruptedException
	{
		Thread.sleep(2000);
		targetjurisdiction.click();
		Thread.sleep(2000);
		memberstate.click();
		targetok.click();
		return true;
	}
	
	public boolean deliverydate() throws InterruptedException
	{
		Thread.sleep(3000);
		delivertdate.click();
		delivertdate.sendKeys(Constants.requestdeliverydate);
		Thread.sleep(2000);
		next2.click();
		return true;
	}
	
	public boolean Fileupload() throws InterruptedException
	{
		Reporter.log("jhvfjhevf",true);
		Thread.sleep(5000);
		fileupload.click();
		return true;
		
	}
	
	public boolean fileuplaodingquote() throws AWTException, InterruptedException
	{
	FileUpload f = new FileUpload(driver);
	f.fileuploading();
	Thread.sleep(2000);
	filenext.click();
	return true;
	}
	
	public boolean quotecontinue() throws InterruptedException
	{
		Thread.sleep(6000);
		filenext.click();
		return true;
	}
	
	public boolean quotesubmission() throws InterruptedException
	{
		Thread.sleep(3000);
		submitquote.click();
		return true;
	}
}
