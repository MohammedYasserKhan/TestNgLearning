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

public class OrderEpgrant 

{
	
	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public OrderEpgrant(WebDriver driver)
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
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationnumber;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement sourcelangugae;
	
	@FindBy(xpath = "//select[@class='form-control']/option[2]")
	WebElement sourceenglish;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71Yes')]")
	WebElement yescalims;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71No')]")
	WebElement nocalims;
	
	@FindBy(xpath = "//input[contains(@name,'txtEPGrantRequestedDeliveryDate')]")
	WebElement translationdeliverydate1;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement epvalidationoptin1;
	
	@FindBy(xpath = "//a[@data-toggle='collapse'][contains(.,'Patent Details')]")
	WebElement patent;
	
	@FindBy(xpath = "//input[@name='txtAdditionalDate']")
	WebElement epvalidationdeadlinecalender;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement selectjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Austria (AT)')]")
	WebElement austria;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement jurisdictionok;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement page1ok;
	
	
	@FindBy(xpath = "//span[contains(.,'Jurisdiction Additional Information (If Applicable) / File Upload / Special Instructions')]")
	WebElement fileuploadpage1;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement clicktoupload;
	
	@FindBy(xpath = "//input[contains(@onclick,'chkReferenceClick(this);')]")
	WebElement refernce;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement fileok;
	
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement submitorder;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Submit Order')]")
	WebElement ordersubmission;
	
	
	
	public boolean order1() throws InterruptedException
	{
		
		System.out.println("testorder");
		Thread.sleep(3000);
		//System.out.println("driver=" + driver); 
		
		New1.click();
		System.out.println("Clicked on new");
		
		order.click();
		System.out.println("clicked on order");
		Thread.sleep(2000);
		Epgrant.click();
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
	
	public boolean passvalue()
	{
		applicationnumber.sendKeys(Constants.appnumber);
		return true;
	}
	
	public boolean page1cont() throws InterruptedException
	{
		sourcelangugae.click();
		sourceenglish.click();
		yescalims.click();
		translationdeliverydate1.click();
		translationdeliverydate1.sendKeys(Constants.translationdeliverydate);
		Thread.sleep(3000);
		epvalidationoptin1.click();
		Thread.sleep(20000);
		//driver.switchTo().alert().accept();
		//patent.click();
		//epvalidationdeadlinecalender.click();
		//epvalidationdeadlinecalender.sendKeys(Constants.epvalidationdeadlinecalender);
		selectjurisdiction.click();
		Thread.sleep(2000);
		austria.click();
		jurisdictionok.click();
		page1ok.click();
		Thread.sleep(5000);
		boolean fileupload = SeleniumFunc.IsElementPresent(fileuploadpage1);
		Reporter.log("User is in Neworder page" + fileupload);
		if(fileupload== true)
		{
			Reporter.log("User is in file upload page");
			return true;
		}
		else
		{
			Reporter.log("user is still in page1");
			return false;
		}
	}
	
	
	public boolean page2()
	{
		Reporter.log("jhvfjhevf",true);
		clicktoupload.click();
		return true;
		
	}
	
	public boolean fileuplaodingorder() throws AWTException, InterruptedException
	{
	FileUpload f = new FileUpload(driver);
	f.fileuploading();
	return true;
	}
	
	
	public void ordercontinue() throws InterruptedException
	{
		
		//fileok.click();
		submitorder.click();
		Thread.sleep(2000);
		ordersubmission.click();
	}
	
		
}
