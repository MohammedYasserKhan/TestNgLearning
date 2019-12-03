package pageFactory.login;

import java.awt.AWTException;

import javax.lang.model.element.Element;

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

public class Quote_EP_CliamsnTranslation 
{
	public WebDriver driver;
	JavaHelpers jh = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	
	public Quote_EP_CliamsnTranslation()
	{
		this.driver = MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,Constants.WebDriverWaitDuration), this);
	}
	
	//(//a[@class='nav-link'])[3]
	@FindBy(xpath = "(//a[@class='nav-link'])[3]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=1'][contains(.,'Select')]")
	WebElement epquoteselecion;
	
	@FindBy(xpath = "//span[contains(.,'EP GRANTED CLAIMS TRANSLATION / EP VALIDATION')]")
	WebElement eppage;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement nextbutton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger'][contains(.,'* Please fill in the following: Application or Publication Number, Druckexemplar / B1 Publication Source Language')]")
	WebElement validationmessage;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement appnumber;
	
	@FindBy(xpath = "//select[contains(@class,'form-control is-invalid')]")
	WebElement sourcelangugae;
	
	@FindBy(xpath = "//select[contains(@class,'form-control is-invalid')]/option[2]")
	WebElement sourceenglish;
		
	@FindBy(xpath = "//input[@value='grantNotice71Yes']")
	WebElement yescalims;
	
	@FindBy(xpath = "//label[contains(.,'*I need the granted claims translated into the following other official languages:')]")
	WebElement claimmessage;
	
	@FindBy(xpath = "//input[contains(@name,'txtEPGrantRequestedDeliveryDate')]")
	WebElement CalimsTranslationDate;
	
	@FindBy(xpath = "//input[@value='translation']")
	WebElement EPTranslation;
	
	@FindBy(xpath = "(//h5[@class='modal-title'][contains(.,'Patent Details')])[1]")
	WebElement patentloading;
	
	@FindBy(xpath = "//label[contains(.,'Title')]")
	WebElement Title;
	
	@FindBy(xpath = "//input[contains(@name,'apdFigureWordCount')]")
	WebElement figureword;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement TargetJurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Austria (AT)')]")
	WebElement Austria;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Albania (AL)')]")
	WebElement Albania;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Germany (DE)')]")
	WebElement Germany;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Italy (IT)')]")
	WebElement Italy;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'San Marino (SM)')]")
	WebElement SanMarino;
	
	@FindBy(xpath = "//li[contains(.,'xAustria (AT)')]")
	WebElement Austriaselected;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement jurisdictionok;
	
	@FindBy(xpath = "//button[contains(@onclick,'step2CalculatorValidationHandler();')]")
	WebElement patentyes;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//span[contains(.,'Review Quote')]")
	WebElement reviewquote;
	
	@FindBy(xpath = "//input[contains(@value,'Export Quote')]")
	WebElement export;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Approve Quote')]")
	WebElement Approvequote;
	
	@FindBy(xpath = "//input[contains(@name,'txtRequestedDeliveryDate')]")
	WebElement deliverydate;
	public boolean EPSelection()
	{
		Actions action = new Actions(driver);
		New.click();
		Quote.click();
		epquoteselecion.click();
		return true;
	}
	
	public boolean verifyeppageselection()
	{
		EPSelection();
		boolean Epproductselection = SeleniumFunc.IsElementPresent(eppage);
		Reporter.log("User selected EP under Quote"+Epproductselection);
		if(Epproductselection==true)
		{
			Reporter.log("User has selected the EP Under Quote");
			return true;
		}
		else
		{
			Reporter.log("User did not select EP under quote");
			return false;
		}
		
	}
	
	public boolean validationtest()
	{
		nextbutton.click();
		return true;
	}
	public boolean verifyvalidationtest()
	{
		validationtest();
		boolean validationtesting = SeleniumFunc.IsElementPresent(validationmessage);
		Reporter.log("Validation message found"+ validationtesting);
		if( validationtesting == true)
		{
			Reporter.log("Validation message Found");
			return true;
		}
		else
		{
			Reporter.log("Validaiton not found");
			return false;
		}
	}
	
	public boolean ApplicationNumber()
	{	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(appnumber));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", appnumber);
		appnumber.sendKeys(Constants.appnumber);
		return true;
	}
	
	public boolean appnumberverify()
	{
		ApplicationNumber();
		boolean appnumbertest = SeleniumFunc.equals(appnumber);
		Reporter.log("appnumber provided"+appnumbertest);
		if(appnumbertest==true)
		{
			Reporter.log("app number present");
			return true;
		}
		else
		{
			Reporter.log("app number not present");
			return false;
		}
	}
	
	public boolean SourceLanguageSelection()
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(sourcelangugae));
		sourcelangugae.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		wait2.until(ExpectedConditions.elementToBeClickable(sourceenglish));
		sourceenglish.click();
		return true;
	}
	
	
	public boolean VerifyLanguageSelection() throws InterruptedException
	{
		SourceLanguageSelection();
		boolean LanguageSelectionTest = SeleniumFunc.IsElementPresent(sourceenglish);
		Reporter.log("Source language selcted"+LanguageSelectionTest);
		if(LanguageSelectionTest==true)
		{
			Reporter.log("Source language is English");
			return true;
		}
		else
		{
			Reporter.log("Source language is not english");
			return false;
		}
	}
	
	public boolean ClaimSelection()
	{
		yescalims.click();
		CalimsTranslationDate.click();
		CalimsTranslationDate.sendKeys(Constants.EPValidationDeadline);
		return true;
	}
	
	public boolean VerifyClaimsDate()
	{
		ClaimSelection();
		boolean claimdate = SeleniumFunc.IsElementPresent(CalimsTranslationDate);
		Reporter.log("Claims Date is Present"+claimdate);
		if(claimdate==true)
		{
			Reporter.log("Claim translation date is present");
			return true;
		}
		else
		{
			Reporter.log("Claims translation date is not present");
			return false;
		}
	}
	
	public boolean EPTranslation()
	{
		EPTranslation.click();
		driver.switchTo().activeElement().equals(patentloading);
		System.out.println("Patent Info is loading");
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(Title));
		WebDriverWait wait4 = new WebDriverWait(driver, 20);
		figureword.sendKeys(Constants.DescriptionWordCount);
		
		return true;
	}
	
	public boolean VerifyPatentLoading()
	{
		EPTranslation();
		boolean patentinfo = SeleniumFunc.IsElementPresent(Title);
		Reporter.log("patentloaded"+patentinfo);
		if(patentinfo==true)
		{
			Reporter.log("Patent info loaded successfully");
			return true;
		}
		else
		{
			Reporter.log("patent info is not loaded");
			return false;
		}

	}
	
	public boolean CountrySelection() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(TargetJurisdiction));
		TargetJurisdiction.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(Austria));
		Austria.click();
		WebDriverWait wait5 = new WebDriverWait(driver, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(Albania));
		Albania.click();
		WebDriverWait wait6 = new WebDriverWait(driver, 20);
		wait6.until(ExpectedConditions.elementToBeClickable(Germany));
		Germany.click();
		WebDriverWait wait7 = new WebDriverWait(driver, 20);
		wait7.until(ExpectedConditions.elementToBeClickable(Italy));
		Italy.click();
		WebDriverWait wait8 = new WebDriverWait(driver, 20);
		wait8.until(ExpectedConditions.elementToBeClickable(SanMarino));
		SanMarino.click();
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.elementToBeClickable(jurisdictionok));
		jurisdictionok.click();
		WebDriverWait wait4 = new WebDriverWait(driver, 20);
		wait4.until(ExpectedConditions.elementToBeClickable(deliverydate));
		deliverydate.click();
		//Thread.sleep(2000);
		deliverydate.sendKeys(Constants.epvalidationdeadlinecalender);
		nextbutton.click();
		return true;
	}
	
	public boolean VerifyCountrySelection() throws InterruptedException
	{
		CountrySelection();
		System.out.println("test ok");
		boolean selectedcountry = SeleniumFunc.IsElementPresent(Austriaselected);
		Reporter.log("Country  selected"+selectedcountry);
		if(selectedcountry==true)
		{
			Reporter.log("Austria Selected");
			return true;
		}
		else
		{
			Reporter.log("Austria not selected");
			return false;
		}
	}
	
	public boolean Fileupload() throws InterruptedException, AWTException
	{
		WebDriverWait wait3 = new WebDriverWait(driver, 50);
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", fileupload);
		FileUpload f = new FileUpload(driver);
		f.fileuploading();
		Thread.sleep(5000);
		filenext.click();
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
	public boolean verifyFileuploadpage() throws InterruptedException, AWTException
	{
		Fileupload();
		boolean file  = SeleniumFunc.IsElementPresent(fileupload);
		Reporter.log("User is now in file upload page"+file);
		if(file==true)
		{
			Reporter.log("User is now in file upload page");
			return true;
		}
		else
		{
		Reporter.log("User is not in file upload page");	
		return false;
		}
	}
	
	public boolean export() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(export));
		export.click();
		return true;
	}
	
	
	public boolean approve() throws InterruptedException
	{
		Thread.sleep(3000);
		Approvequote.click();
		
		return true;
	}
	
}
