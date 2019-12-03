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

public class QuotePCTFileandTranslateDiscard 
{
	
	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuotePCTFileandTranslateDiscard(WebDriver driver)
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
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement pctappnumbner;

	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
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
	
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Discard Quote')]")
	WebElement discard;
	
	public boolean PCTFileandtranslating() throws InterruptedException
	{
		
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		Thread.sleep(3000);
		actions.moveToElement(PCT).perform();
		PCT.click();
		Thread.sleep(3000);
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
		fileandtranslate.click();
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
		Thread.sleep(3000);
		export.click();
		return true;
	}

	public boolean Discard() throws InterruptedException
	{
		Thread.sleep(2000);
		discard.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		discard.click();
		driver.switchTo().alert().accept();
		return true;
	}
}
