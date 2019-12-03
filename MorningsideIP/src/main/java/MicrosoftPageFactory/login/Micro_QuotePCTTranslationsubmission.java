package MicrosoftPageFactory.login;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import pageFactory.login.MyDriver;
import utility.Constants;
import utility.FileUpload;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class Micro_QuotePCTTranslationsubmission 
{
	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public Micro_QuotePCTTranslationsubmission(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=2'][contains(.,'PCT National Phase Entry')]")
	WebElement PCT;
	
	@FindBy(xpath = "//select[contains(@name,'CustomerId')]")
	WebElement customer;
	
	@FindBy(xpath = "//select[contains(@onchange,'contactPersonsChangeEvent();')]")
	WebElement requestername;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement pctappnumbner;
	
	@FindBy(xpath = "//input[@value='translation']")
	WebElement Translation;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement Targetjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'ARIPO (AP)')]")
	WebElement Aripo;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Australia (AU)')]")
	WebElement Australia;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement Targetok;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement next;
	
	@FindBy(xpath = "//button[contains(@onclick,'step2CalculatorValidationHandler();')]")
	WebElement frameYes;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//input[contains(@value,'Export Quote')]")
	WebElement export;
	
	@FindBy(xpath = "//input[contains(@class,'form-control boot-datepicker futureDatepicker')]")
	WebElement deliverydate;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Approve Quote')]")
	WebElement approvequote;
	
	public boolean QuotePCTSelecting() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		actions.moveToElement(PCT).perform();
		PCT.click();
		customer.click();
		Thread.sleep(2000);
		customer.sendKeys(Constants.clariontestcustomer);
		Thread.sleep(2000);
		requestername.click();
		Thread.sleep(2000);
		requestername.sendKeys(Constants.requesteryasser);
		return true;
	}
	
	public boolean patent() throws InterruptedException
	{
		next.click();
		Thread.sleep(2000);
		pctappnumbner.click();
		pctappnumbner.sendKeys(Constants.PCTAppnumber);
		return true;
	}
	
	public boolean fileandtranslate()
	{
		Translation.click();
		return true;
		
	}
	
	public boolean targetjurisdiction() throws InterruptedException
	{
		Thread.sleep(30000);
		Targetjurisdiction.click();
		Thread.sleep(3000);
		Aripo.click();
		Australia.click();
		Thread.sleep(2000);
		Targetok.click();
		Thread.sleep(2000);
		deliverydate.click();
		Thread.sleep(2000);
		deliverydate.sendKeys(Constants.requestdeliverydate);
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		frameYes.click();
		return true;
	}
	
	public boolean Fileupload() throws InterruptedException
	{
		Reporter.log("File uploading",true);
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
	
	public boolean quotePCtcontinue() throws InterruptedException
	{
		Thread.sleep(6000);
		filenext.click();
		return true;
	}
	
	public boolean reviewpage() throws InterruptedException
	{
		Thread.sleep(6000);
		export.click();
		return true;
	}
	
	public boolean approve() throws InterruptedException
	{
		Thread.sleep(2000);
		approvequote.click();
		return true;
	}
}
