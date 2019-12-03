package pageFactory.login;

import java.awt.AWTException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import utility.Constants;
import utility.FileUpload;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class Order_EP_FilenTranslate_Submission 
{
	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public Order_EP_FilenTranslate_Submission(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New1;
	
	@FindBy(xpath = "//a[contains(.,'Orders')]")
	WebElement order;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=2&serviceType=1&productType=1'][contains(.,'Select')]")
	WebElement Epgrant;
	
	@FindBy(xpath = "//span[contains(.,'EP GRANTED CLAIMS TRANSLATION / EP VALIDATION')]")
	WebElement epgrantheading;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement Nextbutton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger'][contains(.,'* Please fill in the following: Application or Publication Number, Druckexemplar / B1 Publication Source Language')]")
	WebElement validationmessage1;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement Applicationnumber;
	
	@FindBy(xpath = "//select[contains(@class,'form-control is-invalid')]")
	WebElement sourcelangugae;
	
	@FindBy(xpath = "//select[contains(@class,'form-control is-invalid')]/option[2]")
	WebElement sourceenglish;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71Yes')]")
	WebElement yescalims;
	
	@FindBy(xpath = "//input[contains(@name,'txtEPGrantRequestedDeliveryDate')]")
	WebElement translationdeliverydate1;	
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement FileandTranslate;
	
	@FindBy(xpath = "//label[contains(.,'Title')]")
	WebElement patenttitle;
	
	@FindBy(xpath = "(//h5[@class='modal-title'][contains(.,'Patent Details')])[1]")
	WebElement patentloading;
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-success alert-dismissible fade show')]")
	//@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show'][contains(.,'Data loaded successfully.×')]")
	WebElement patentloadedsuccesfully;
	
	@FindBy(xpath = "//button[contains(@onclick,'chooseTargetCountries();')]")
	WebElement selectjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Austria (AT)')]")
	WebElement austria;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Germany (DE)')]")
	WebElement germany;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Italy (IT)')]")
	WebElement Italy;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'San Marino (SM)')]")
	WebElement sanmarino;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement jurisdictionok;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement Step2okbutton;
		
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Submit Order')]")
	WebElement submitorder;
	
	public boolean OrderEPSelection() throws InterruptedException
	{
		
		Thread.sleep(3000);
		New1.click();
		System.out.println("================================================================");
		System.out.println("User Clicked on new");
		order.click();
		System.out.println("================================================================");
		System.out.println("User clicked on order");
		Thread.sleep(2000);
		Epgrant.click();
		System.out.println("================================================================");
		System.out.println("clicked on EPGrant");
		boolean Orderclick= SeleniumFunc.IsElementPresent(epgrantheading);
		Reporter.log("User is in Neworder page" + Orderclick);
		if(Orderclick== true)
		{
			Reporter.log("user in order page");
			return true;
		}
		else
		{
			Reporter.log("User is not in order view");
			return false;
		}
		
	}
	
	public boolean validationtest()
	{
		Nextbutton.click();
		if(validationmessage1.isDisplayed())
		{
			Reporter.log("validation message is shown");
			return true;
		}
		else
		{
			Reporter.log("Validation message is not shown");
			return false;
		}
	}
	
	public boolean Applicationnumber() throws InterruptedException
	{
		Thread.sleep(1000);
		Applicationnumber.click();
		Thread.sleep(1000);
		Applicationnumber.sendKeys(Constants.appnumber);
		return true;
	}
	
	public boolean sourcelanguage() throws InterruptedException
	{
		Thread.sleep(1000);
		sourcelangugae.click();
		Thread.sleep(1000);
		sourceenglish.click();
		return true;
	}
	
	public boolean EPCliams()
	{
		yescalims.click();
		translationdeliverydate1.click();
		translationdeliverydate1.sendKeys(Constants.translationdeliverydate);
		return true;
	}
	
	@SuppressWarnings("deprecation")
	public boolean EPFileandTranslate() throws InterruptedException
	{
		FileandTranslate.click();
		if(FileandTranslate.isSelected())
		{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);	
		
		};							
				
		//WebDriverWait wait5 = new WebDriverWait(driver, 10);
		//wait5.until(ExpectedConditions.visibilityOf(patenttitle));
		//Thread.sleep(3000);
		return true;
	}
	
	public boolean patentinfo()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(patenttitle.isDisplayed())
		{
			System.out.println("patent is being loaded");
		}
		else
		{
			System.out.println("Patent is not being loaded");
		}
		return true;
	}
	
	public boolean targetcountries() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(selectjurisdiction));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", selectjurisdiction);
		Thread.sleep(2000);
		austria.click();
		germany.click();
		Italy.click();
		sanmarino.click();
		jurisdictionok.click();
		Thread.sleep(10000);
		return true;
	}
	
	public boolean step2nextbutton() throws InterruptedException
	{

		WebDriverWait wait2 = new WebDriverWait(driver,3);
		//wait2.until(ExpectedConditions.elementToBeClickable(Nextbutton));
		Nextbutton.click();
		return true;
	}
	
	public boolean fileuploadbutton() throws InterruptedException, AWTException
	{
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", fileupload);
		FileUpload f = new FileUpload(driver);
		f.fileuploading();
		System.out.println("1223");
		return true;
	}
	
	public boolean movingtoreviewpage() throws InterruptedException
	{
		Thread.sleep(10000);
		//WebDriverWait wait4 = new WebDriverWait(driver, 20);
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", filenext);
		
		//filenext.click();
		return true;
	}
	
	public boolean ordersubmission() throws InterruptedException
	{
		Thread.sleep(5000);
		submitorder.click();
		return true;
	}
}

