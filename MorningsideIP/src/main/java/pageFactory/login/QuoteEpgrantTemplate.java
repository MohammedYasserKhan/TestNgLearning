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

public class QuoteEpgrantTemplate 
{
	
	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuoteEpgrantTemplate(WebDriver driver)
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
	
//	@FindBy(xpath = "//span[contains(.,'EP GRANTED CLAIMS TRANSLATION / EP VALIDATION')]")
//	WebElement EPpage;

	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement Next1;
	
	@FindBy(xpath = "//div[@class='alert alert-danger'][contains(.,'* Please fill in the following: Application or Publication Number')]")
	WebElement validation;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationnumber;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement sourceclick;
	
	@FindBy(xpath = "//select[@class='form-control']/option[2]")
	WebElement english;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71Yes')]")
	WebElement claimyes;
	
	@FindBy(xpath = "//input[contains(@name,'txtEPGrantRequestedDeliveryDate')]")
	WebElement Deliverydate;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
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
	
	@FindBy(xpath = "//input[contains(@value,'Save As Template')]")
	WebElement savetemplate;
	
	@FindBy(xpath = "//input[contains(@id,'TemplateName')]")
	WebElement templatename;
	
	@FindBy(xpath = "//button[contains(@onclick,'saveTemplateDialogClick();')]")
	WebElement templateok;
	
	public boolean QuoteEpfileandtranslate() throws InterruptedException
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
	
	public boolean QuoteEpfileandtranslatecontinue1()
	{
		Next1.click();
		if(validation.isDisplayed())
		{
			System.out.println("Validation found");
		}
		else
		{
			System.out.println("Validaiton not found");
		}
		return true;
		
	}
	
	public boolean QuoteEpfileandtranslatecontinue2() throws InterruptedException
	{
		Thread.sleep(2000);
		applicationnumber.click();
		applicationnumber.sendKeys(Constants.appnumber);
		sourceclick.click();
		Thread.sleep(2000);
		english.click();
		return true;
	}
	
	public boolean claims() throws InterruptedException
	{
		Thread.sleep(5000);
		claimyes.click();
		Deliverydate.click();
		Deliverydate.sendKeys(Constants.EarliestPriorityDate);
		fileandtranslate.click();
		Thread.sleep(60000);
		return true;
	}
	
	public boolean Jurisdiction() throws InterruptedException
	{
		Thread.sleep(5000);
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
	
	
	public boolean template() throws InterruptedException
	{
		Thread.sleep(3000);
		savetemplate.click();
		Thread.sleep(2000);
		templatename.click();
		templatename.sendKeys(Constants.Templatename2);
		Thread.sleep(2000);
		templateok.click();
		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		System.out.println("template created");
		
		return true;
	}
}
