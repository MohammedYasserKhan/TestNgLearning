package pageFactory.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import utility.Constants;
import utility.FileUpload;
import utility.SeleniumFunctions;

public class QuoteOtherIP 
{
	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuoteOtherIP(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
				Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/OtherIPWizard?requestType=1&serviceType=2'][contains(.,'Select')]")
	WebElement OtherIp;
	
	@FindBy(xpath = "//span[contains(.,'Other IP / Legal Document Translation')]")
	WebElement Otheriptext;
	
	@FindBy(xpath = "//input[contains(@name,'txtTypeOfDocuments')]")
	WebElement Typeofdocument;
	
	@FindBy(xpath = "//select[@class='form-control'][contains(@id,'Languages')]")
	WebElement Sourcelangugae;
	
	@FindBy(xpath = "//select[@class='form-control'][contains(@id,'Languages')]/option[2]")
	WebElement arabic;
	
	@FindBy(xpath = "//ul[contains(@class,'chosen-choices')]")
	WebElement Targetlanagaugae;
	
	@FindBy(xpath = "//input[contains(@class,'form-control boot-datepicker futureDatepicker')]")
	WebElement deliverydate;
	
	@FindBy(xpath = "//button[contains(@onclick,'step1_next();')]")
	WebElement next;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[@onclick='step3_next();']")
	//@FindBy(xpath = "//button[contains(@onclick,'step1_next();')]")
	WebElement filenext;
	
	
	public boolean Otherip()
	{
		New.click();
		Quote.click();        
		OtherIp.click();
		if(Otheriptext.isDisplayed())
		{
			System.out.println("================================================================");
			System.out.println("Step 3 : users is now in Other Ip  page ");
		}
		else
		{
			System.out.println(" User is not in Other IP");
		}
	return true;
	}
	
	public boolean OtherIpContinue() throws InterruptedException, AWTException
     {
		Typeofdocument.sendKeys(Constants.TypeofDocument);
		Thread.sleep(3000);
		Sourcelangugae.click();
		Thread.sleep(2000);
		arabic.click();
		Thread.sleep(2000);
		Targetlanagaugae.click();
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
		//chinese.click();
				deliverydate.click();
				deliverydate.sendKeys(Constants.requestdeliverydate);
				next.click();
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
	//next.click();
	return true;
	}
	
	public boolean reviewpage()
	{
		
		next.click();
		return true;
		
	}
	
}
