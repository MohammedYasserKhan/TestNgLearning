package pageFactory.login;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import functionality.LoginTest;
import utility.Constants;
import utility.FileUpload;
import utility.SeleniumFunctions;

public class QuoteEpGrantsubmission extends LoginTest
{
	
	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuoteEpGrantsubmission(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath="//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath="//a[@id='new-quote-link' and text()='Quotes']")
	WebElement Quotes;
	
	@FindBy(xpath="//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=1' and text()='EP Grant / Validation']")
	WebElement EPQuoteselection;
	
	@FindBy(xpath="//span[text()='EP GRANTED CLAIMS TRANSLATION / EP VALIDATION']")
	WebElement EpPage;
	
	@FindBy(xpath="//button[@onclick='NextToStep3();']")
	WebElement step2nextbutton;
	
	@FindBy(xpath="//div[@id='step2Error']")
	WebElement validationmesage;
	
	@FindBy(xpath="//input[@name='txtApplicationNumber']")
	WebElement ApplicationNumber;
	
	@FindBy(xpath="//option[@value='English (USA)']")
	WebElement English;
	
	@FindBy(xpath="//input[@class='form-check-input' and @value='grantNotice71Yes']")
	WebElement YesClaims;
	
	@FindBy(xpath="//input[@class='form-control boot-datepicker futureDatepicker' and @name='txtEPGrantRequestedDeliveryDate']")
	WebElement ClaimsDeliveryDate;
	
	@FindBy(xpath="//label[@id='spEPGrantLanguage1' and text()='French']")
	WebElement French;
	
	@FindBy(xpath="//input[@type='radio' and @value='validatetranslation']")
	WebElement FileandTranslate;
	
	@FindBy(xpath="//label[text()='Title']")
	WebElement Title;
	
	@FindBy(xpath="//button[@id='btnTargetCountries']")
	WebElement TargetCountry;
	
	@FindBy(xpath="//label[@class='custom-control-label' and text()='Member States']")
	WebElement MemberStates;
	
	@FindBy(xpath="//label[@class='custom-control-label' and text()='Austria (AT)']")
	WebElement Austria;
	
	@FindBy(xpath="//label[@class='custom-control-label' and text()='Cambodia (KH)']")
	WebElement Cambodia;
	
	@FindBy(xpath="//label[@class='custom-control-label' and text()='Germany (DE)']")
	WebElement Germany;
	
	@FindBy(xpath="//label[@class='custom-control-label' and text()='Italy (IT)']")
	WebElement Italy;
	
	@FindBy(xpath="//button[@onclick='targetCountriesSelectionClick();' and text()='OK']")
	WebElement TargetOk;
	
	@FindBy(xpath="//div/button[@class='btn btn-blue' and @onclick='step2CalculatorValidationHandler();']")
	WebElement Yes;
	
	@FindBy(xpath="//div[@class='custom-btn-file btn btn-orange' and @onclick='simulateFileUploadClick();']")
	WebElement Uploadfile;
	
	@FindBy(xpath="//button[@onclick='NextToStep4();' and text()='Next']")
	WebElement Filenext;
	
	@FindBy(xpath="//input[@class='form-check-input dummyRefClass' and @type='checkbox']")
	WebElement filecheckbox;
	
	@FindBy(xpath="//input[@type='button' and @value='Download Quote']")
	WebElement Export;
	
	@FindBy(xpath="//button[@id='btnApproveAndSubmit']")
	WebElement ApproveQuote;
		
	public boolean QuoteEpfileandtranslate_1() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quotes).perform();
		actions.moveToElement(EPQuoteselection).perform();
		EPQuoteselection.click();
		return true;
	}
	
	public boolean QuoteEpfileandtranslatecontinue_1()
	{
		step2nextbutton.click();
		if(validationmesage.isDisplayed())
		{
			System.out.println("Validation found");
		}
		else
		{
			System.out.println("Validaiton not found");
		}
		return true;
		
	}
	
	public boolean QuoteEpfileandtranslatecontinue_11() throws InterruptedException
	{
		Thread.sleep(2000);
		ApplicationNumber.click();
		ApplicationNumber.sendKeys(Constants.appnumber);
		//sourceclick.click();
		Thread.sleep(2000);
		English.click();
		return true;
	}
	
	public boolean claims_1() throws InterruptedException
	{
		Thread.sleep(5000);
		YesClaims.click();
		ClaimsDeliveryDate.click();
		Thread.sleep(2000);
		ClaimsDeliveryDate.sendKeys(Constants.EarliestPriorityDate);
		FileandTranslate.click();
		Thread.sleep(20000);
		return true;
	}
}
	
//	//public boolean Jurisdiction() throws InterruptedException
//	{
//		Thread.sleep(10000);
//		System.out.println("tracing");
//		Thread.sleep(30000);
////		Targetjurisdiction.click();
////		Thread.sleep(3000);
////		Albania.click();
////		Thread.sleep(2000);
////		asutria.click();
////		Thread.sleep(2000);
////		targetok.click();
////		Next1.click();
////		Thread.sleep(2000);
////		frameyes.click();
////		return true;
//	}
//	
//	public boolean Fileupload() throws InterruptedException
//	{
//		Reporter.log("jhvfjhevf",true);
//		Thread.sleep(5000);
//		fileupload.click();
//		return true;
//		
//	}
//	
//	public boolean fileuplaodingquote() throws AWTException, InterruptedException
//	{
//	FileUpload f = new FileUpload(driver);
//	f.fileuploading();
//	Thread.sleep(2000);
//	filenext.click();
//	return true;
//	}
//	
//	public boolean quotecontinue() throws InterruptedException
//	{
//		Thread.sleep(6000);
//		filenext.click();
//		return true;
//	}
//	
//	public boolean quotesubmisison()
//	{
//		if(review.isDisplayed())
//		{
//			System.out.println("User is now in review page!!!!");
//		}
//		else
//		{
//			System.out.println("Use is not in review");
//		}
//		
//		return true;
//		
//	}
//	
//	public boolean export() throws InterruptedException
//	{
//		Thread.sleep(6000);
//		export.click();
//		return true;
//	}
//	
//	
//	public boolean approve() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		Approvequote.click();
//		
//		return true;
//	}
//	
//}
//
