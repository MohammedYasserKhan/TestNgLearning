package pageFactory.login;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import utility.Constants;
import utility.FileUpload;
import utility.SeleniumFunctions;


public class QuotePCT 
{
	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuotePCT(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
				Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New1;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=2'][contains(.,'Select')]")
	WebElement PCTquote;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement next1;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement PCTappnumber;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement Fileandtranslate;
	
	
	//@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	//@FindBy(xpath = "//i[contains(@class,'far fa-flag')]")
	//@FindBy(xpath = "//button[contains(@onclick,'chooseTargetCountries();')]")
	@FindBy(xpath = "//button[contains(.,'Select jurisdictions')]")
	WebElement targetjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'ARIPO (AP)')]")
	WebElement Aripo;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement targetok;
	
	@FindBy(xpath = "//p[contains(.,'Please note you did not fill out the following fields  [Figure Word Count].If you move forward to the next step, we will assign a value of “0” for these fields which will impact the translation cost on the Instant Quote screen.If you approve the quote, our Client Solutions team will correct the charges.Would you still like to move to the next step ?')]")
	WebElement frame1;
	
	@FindBy(xpath = "//button[contains(@onclick,'step2CalculatorValidationHandler();')]")
	WebElement frameyes;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//input[contains(@value,'Export Quote')]")
	WebElement exportquote;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Approve Quote')]")
	WebElement approvequote;
	public boolean quote1()throws InterruptedException
	{
		New1.click();
		Thread.sleep(3000);
		System.out.println("Click on new button");
		Thread.sleep(2000);
		
		Quote.click();
		System.out.println("Clicked on quote");
		Thread.sleep(3000);
		
		PCTquote.click();
		System.out.println("Clicked on PCT");
		Thread.sleep(3000);
		
		next1.click();
		return true;
	}
	public boolean appnumber() throws InterruptedException
	{
		System.out.println("appnumber");
		Thread.sleep(3000);
		PCTappnumber.click();
		System.out.println("click app number");
		PCTappnumber.sendKeys(Constants.appnumber);
	 return true ;
	}
	
	public boolean page1continue() throws InterruptedException
	{
		System.out.println("fline and translate");
		Fileandtranslate.click();
		Thread.sleep(12000);
		System.out.println("target");
		next1.click();
		Thread.sleep(6000);
		targetjurisdiction.click();
		System.out.println("clcik target");
		Thread.sleep(3000);
		Aripo.click();
		targetok.click();
		next1.click();
		Thread.sleep(3000);
		//driver.switchTo().frame(frame1);
		//driver.switchTo().alert().accept();
		Thread.sleep(2000);
		frameyes.click();
				return false;
	}
		
	public boolean page2() throws InterruptedException
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
	return true;
	}
	
	public boolean quotecontinue() throws InterruptedException
	{
		Thread.sleep(6000);
		filenext.click();
		return true;
	}
	
	public boolean reviewpage() throws InterruptedException
	{
		Thread.sleep(6000);
		exportquote.click();
		Thread.sleep(6000);
		approvequote.click();
		return true;
		
	}
	}

	

