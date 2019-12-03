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

public class Micro_QuoteEPFnTSave 
{
	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public Micro_QuoteEPFnTSave(WebDriver driver)
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
	
	@FindBy(xpath = "//select[contains(@name,'CustomerId')]")
	WebElement customer;
	
	@FindBy(xpath = "//select[contains(@name,'CustomerId')]/option[396]")
	WebElement clarion;
	
	@FindBy(xpath = "//select[contains(@onchange,'contactPersonsChangeEvent();')]")
	WebElement requestername;
	
	@FindBy(xpath = "//select[contains(@onchange,'contactPersonsChangeEvent();')]/option[11]")
	WebElement Yasser;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationnumber;
	
	@FindBy(xpath = "//select[contains(@name,'ddlSourceLanguages')]")
	WebElement sourceclick;
	
	@FindBy(xpath = "//select[contains(@name,'ddlSourceLanguages')]/option[2]")
	WebElement english;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71Yes')]")
	WebElement claimyes;
		
	@FindBy(xpath = "//input[contains(@name,'txtEPGrantRequestedDeliveryDate')]")
	WebElement deliverydate;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
	@FindBy(xpath = "//span[contains(.,'EP GRANTED CLAIMS TRANSLATION / EP VALIDATION')]")
	WebElement EPDashboard;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement Targetjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Albania (AL)')]")
	WebElement Albania;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Austria (AT)')]")
	WebElement asutria;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement targetok;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//button[contains(@onclick,'step2CalculatorValidationHandler();')]")
	WebElement frameyes;
	
	@FindBy(xpath = "//span[contains(.,'Review Quote')]")
	WebElement review;
	
	@FindBy(xpath = "//input[contains(@value,'Export Quote')]")
	WebElement export;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Save Quote')]")
	WebElement save;
			
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement Next1;
		
	public boolean QuoteEPSelection() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		actions.moveToElement(EP).perform();
		EP.click();
		customer.click();
		Thread.sleep(2000);
		customer.sendKeys(Constants.clariontestcustomer);
		Thread.sleep(2000);
		requestername.click();
		Thread.sleep(2000);
		requestername.sendKeys(Constants.requesteryasser);
		return true;
	}
	
	public boolean verifyEPselectionSuccessful() throws InterruptedException
	{
		QuoteEPSelection();
		boolean userLoggedIn = SeleniumFunc.IsElementPresent(EPDashboard);
		Reporter.log("User Logged-In : "+userLoggedIn);
		if(userLoggedIn==true)
		{
			Reporter.log("Success !! User Selected EP in Quote");
			return true;
		}
		else
		{
			Reporter.log("Failure !! User has not selected EP in quote");
			return false;
		}
	}
	public boolean QuoteEPappnumber() throws InterruptedException
	{
		applicationnumber.click();
		applicationnumber.sendKeys(Constants.appnumber);	
		sourceclick.click();
		Thread.sleep(2000);
		english.click();
		return true;
	}
	
	public boolean verifyEPapplicaitonnumber() throws InterruptedException
	{
		QuoteEPappnumber();
		boolean userLoggedIn = SeleniumFunc.IsElementPresent(EPDashboard);
		Reporter.log("User Logged-In : "+userLoggedIn);
		if(userLoggedIn==true)
		{
			Reporter.log("Success !! User Selected EP in Quote");
			return true;
		}
		else
		{
			Reporter.log("Failure !! User has not selected EP in quote");
			return false;
		}
	}
	
	public boolean Quoteepclaim()
	{
		claimyes.click();
		deliverydate.click();
		deliverydate.sendKeys(Constants.EPValidationDeadline);
		return true;
	}
	
	public boolean verifyEPclaimselection() throws InterruptedException
	{
		Quoteepclaim();
		boolean userLoggedIn = SeleniumFunc.IsElementPresent(EPDashboard);
		Reporter.log("User Logged-In : "+userLoggedIn);
		if(userLoggedIn==true)
		{
			Reporter.log("Success !! User Selected claims in Ep under quote");
			return true;
		}
		else
		{
			Reporter.log("Failure !! User has not selected claims  EP in quote");
			return false;
		}
	}
	public boolean QuoteEPFileandTranslate() throws InterruptedException
	{
		fileandtranslate.click();
		Thread.sleep(10000);
		return true;
	}
	
	public boolean verifyEPfileandtranslationselection() throws InterruptedException
	{
		QuoteEPFileandTranslate();
		boolean userLoggedIn = SeleniumFunc.IsElementPresent(EPDashboard);
		Reporter.log("User Logged-In : "+userLoggedIn);
		if(userLoggedIn==true)
		{
			Reporter.log("Success !! User Selected File and translation in Ep under quote");
			return true;
		}
		else
		{
			Reporter.log("Failure !! User has not selected file and translation EP in quote");
			return false;
		}
	}
	
	public boolean Jurisdiction() throws InterruptedException
	{
		Thread.sleep(60000);
		System.out.println("tracing");
		Thread.sleep(3000);
		Targetjurisdiction.click();
		Thread.sleep(3000);
		Albania.click();
		Thread.sleep(2000);
		asutria.click();
		Thread.sleep(2000);
		targetok.click();
		Next1.click();
		Thread.sleep(2000);
		frameyes.click();
		return true;
	}
	
	public boolean verifytargetjurisdictionselection() throws InterruptedException
	{
		Jurisdiction();
		boolean userLoggedIn = SeleniumFunc.IsElementPresent(EPDashboard);
		Reporter.log("User Logged-In : "+userLoggedIn);
		if(userLoggedIn==true)
		{
			Reporter.log("Success !! User Selected target countries");
			return true;
		}
		else
		{
			Reporter.log("Failure !! User not Selected target countries");
			return false;
		}
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
	
	public boolean quotesubmisison()
	{
		if(review.isDisplayed())
		{
			System.out.println("User is now in review page!!!!");
		}
		else
		{
			System.out.println("Use is not in review");
		}
		
		return true;
		
	}
	
	public boolean export() throws InterruptedException
	{
		Thread.sleep(6000);
		export.click();
		return true;
	}
	
	public  boolean savequote()
	{
		save.click();
		return true;
	}
}
