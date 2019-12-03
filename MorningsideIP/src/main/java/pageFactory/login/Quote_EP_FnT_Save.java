package pageFactory.login;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import utility.Constants;
import utility.FileUpload;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class Quote_EP_FnT_Save 
{
	public WebDriver driver;
	JavaHelpers jh = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	
	public  Quote_EP_FnT_Save()
	{
		this.driver = MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,Constants.WebDriverWaitDuration), this);
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
	
	@FindBy(xpath="//input[@value='Export Quote']")
	WebElement Export;
	
	@FindBy(xpath="//button[@id='btnSave']")
	WebElement Save;
	
	@FindBy(xpath="//p[@class='orange mb-4']")
	WebElement quotenumber;
	
	@FindBy(xpath="//p[@class='orange']")
	WebElement requestnumber;
	
	public boolean EPQuoteSelection()
	{
		Actions action = new Actions(driver); 
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(New));
		action.moveToElement(New).perform();
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.elementToBeClickable(Quotes));
		action.moveToElement(Quotes).perform();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(EPQuoteselection));
		action.moveToElement(EPQuoteselection).perform();
		EPQuoteselection.click();
		return true;
	}
	
	public boolean verifyEPQuoteSelection()
	{
		EPQuoteSelection();
		boolean EPquote= SeleniumFunc.IsElementPresent(EpPage);
		Reporter.log("User is now in EP Quote page"+EPquote);
		if(EPquote==true)
		{
			Reporter.log("User is now in EP Quote page");
			return true;
		}
		else
		{
			Reporter.log("User is not in EP pagae");
			return false;
		}
	}
	
	public boolean Validationmessage()
	{
		WebDriverWait wait3 = new WebDriverWait(driver, 5);
		wait3.until(ExpectedConditions.elementToBeClickable(step2nextbutton));
		step2nextbutton.click();
		return true;
	}
	
	public boolean verifyValidationmessage()
	{
		Validationmessage();
		boolean validationmessage= SeleniumFunc.IsElementPresent(validationmesage);
		Reporter.log("Validation message found"+validationmessage);
		if(validationmessage==true)
		{
			Reporter.log("Validation message displayed");
			return true;
		}
		else
		{
			Reporter.log("No validation message");
			return false;
		}
		
	}
	
	public boolean ProvidingApplicationNumber() throws InterruptedException
	{
		Thread.sleep(1000);
		ApplicationNumber.click();
		ApplicationNumber.sendKeys(Constants.appnumber);
		return true;
	}
	
	public boolean SourceLanguageSelection()
	{
		English.click();
		return true;
	}
	
	public boolean ClaimsSelection()
	{
		YesClaims.click();
		WebDriverWait wait4 = new WebDriverWait(driver, 50);
		wait4.until(ExpectedConditions.elementToBeClickable(ClaimsDeliveryDate));
		ClaimsDeliveryDate.click();
		ClaimsDeliveryDate.sendKeys(Constants.EPValidationDeadline);
		return true;
	}
	
	
	public boolean VerifyClaims()
	{
		ClaimsSelection();
		boolean claims = SeleniumFunc.IsElementPresent(French);
		Reporter.log("Claims selected"+claims);
		if(claims==true)
		{
			Reporter.log("Claims Selected");
			return true;
		}
		else
		{
			Reporter.log("Claims not selected");
			return false;
		}
	}
	
	public boolean FileandTranslate()
	{
		WebDriverWait wait5 = new WebDriverWait(driver, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(FileandTranslate));
		FileandTranslate.click();
		return true;
	}
	
	public boolean VerifyFileandTranslate()
	{
		FileandTranslate();
		boolean verifyfnt=SeleniumFunc.IsElementPresent(Title);
		Reporter.log("PatentLoaded"+verifyfnt);
		if(verifyfnt==true)
		{
			Reporter.log("patent loaded");
			return true;
		}
		else
		{
			Reporter.log("Patent did not loaded");
			return false;
		}
	}
	
	public boolean TargetCountries() throws InterruptedException
	{
		Thread.sleep(10000);
		if(Title.isDisplayed())
		{
			System.out.println("Patent loaded successfully now selecting countries");
			WebDriverWait wait6 = new WebDriverWait(driver, 90);
			wait6.until(ExpectedConditions.elementToBeClickable(TargetCountry));
			System.out.println("Selecting target countries");
			TargetCountry.click();
			WebDriverWait wait7 = new WebDriverWait(driver, 90);
			wait7.until(ExpectedConditions.elementToBeClickable(Austria));
			Austria.click();
			Germany.click();
			Italy.click();
			TargetOk.click();
			step2nextbutton.click();
			WebDriverWait wait8 = new WebDriverWait(driver, 90);
			wait8.until(ExpectedConditions.elementToBeClickable(Yes));
			Yes.click();
		}
		return true;
	}
	
	public boolean FileUploading() throws AWTException, InterruptedException
	{
		Thread.sleep(10000);
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", Uploadfile);
		Uploadfile.click();
		FileUpload f =  new FileUpload(driver);
		f.fileuploading();
		WebDriverWait wait9 = new WebDriverWait(driver, 50);
		wait9.until(ExpectedConditions.elementToBeClickable(Filenext));
		Filenext.click();
		return true;
	}
	
	public boolean verifyFileUploading() throws AWTException, InterruptedException
	{
		
		FileUploading();
		boolean verifyfile=SeleniumFunc.IsElementPresent(filecheckbox);
		Reporter.log("File is been uploaded"+verifyfile);
		if(verifyfile==true)
		{
			Reporter.log("File is been uploaded");
			return true;
		}
		else
		{
			Reporter.log("File is not uploaded");
			return false;
		}
	}
	
	public boolean ReviewPage() throws InterruptedException
	{
		//WebDriverWait wait10 = new WebDriverWait(driver, 100);
		//wait10.until(ExpectedConditions.elementToBeClickable(Export));
		Thread.sleep(10000);
		Export.click();
		Thread.sleep(10000);
		WebDriverWait wait11 = new WebDriverWait(driver, 60);
		wait11.until(ExpectedConditions.elementToBeClickable(Save));
		Save.click();
		Thread.sleep(10000);
		requestnumber.getText();
		System.out.println("The requested number is"+requestnumber.getText());
		Thread.sleep(2000);
		quotenumber.getText();
		System.out.println("The quote number is "+quotenumber.getText());
		Thread.sleep(2000);
		driver.close();
		return true;
		
	}
}
	