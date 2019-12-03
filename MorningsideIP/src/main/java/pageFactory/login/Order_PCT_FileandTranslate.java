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
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class Order_PCT_FileandTranslate 
{
	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public Order_PCT_FileandTranslate(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
	
//	@FindBy(xpath = "//a[contains(.,'View Your Projects')]")
//	WebElement project;
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Orders')]")
	WebElement quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=2&serviceType=1&productType=2'][contains(.,'PCT National Phase Entry')]")
	WebElement PCTOrder;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement next;
	
	@FindBy(xpath = "//div[@class='alert alert-danger'][contains(.,'* Please fill in the following: PCT Application/Publication Number, Target Jurisdictions')]")
	WebElement validation;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement orderpctapplicationnumber;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
	@FindBy(xpath = "(//h5[@class='modal-title'][contains(.,'Patent Details')])[1]")
	WebElement loadingdata;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show'][contains(.,'Data loaded successfully.×')]")
     WebElement dataload;

	@FindBy(xpath = "//button[contains(@onclick,'chooseTargetCountries();')]")
	WebElement targetjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'ARIPO (AP)')]")
	WebElement aripo;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Australia (AU)')]")
	WebElement Australia;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement targetok;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Submit Order')]")
	WebElement pctordersubmission;
	
	public boolean OrderPCTSelection() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(quote).perform();
		Thread.sleep(3000);
		actions.moveToElement(PCTOrder).perform();
		Thread.sleep(3000);
		PCTOrder.click();
		Thread.sleep(2000);
		next.click();
		if(validation.isDisplayed())
		{
			System.out.println("validation tested");
		}
		else
		{
			System.out.println("validation is not tested");
		}
		return true;
	}
	
	public boolean applicationnumberpct() throws InterruptedException 
	{
		Thread.sleep(2000);
		orderpctapplicationnumber.click();
		orderpctapplicationnumber.sendKeys(Constants.PCTAppnumber);
		return true;
	}
	
	public boolean orderpct_fileandtranslate() throws InterruptedException
	{
		fileandtranslate.click();
		Thread.sleep(2000);
		
		if(loadingdata.isDisplayed())
		{
			//Thread.sleep(3000);
			System.out.println("patent details are loaded up");
		}
//			else if(dataload.isDisplayed())
//				{
//					System.out.println("data is loaded up"); 
//				}
		else
		{
			System.out.println("patent details are not loaded up");
		}
		return true;
	}
	
	public boolean targetjurisdiction() throws InterruptedException
	{
		Thread.sleep(10000);
		targetjurisdiction.click();
		Thread.sleep(2000);
		aripo.click();
		Australia.click();
		targetok.click();
		next.click();
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
	
	public boolean ordersubmission()
	{
		pctordersubmission.click();
		return true;
	}
}
	