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

public class QuotePCTTranslationonly 
{

	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuotePCTTranslationonly(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
				Constants.WebDriverWaitDuration), this);
	}
	
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New1;
	
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=2'][contains(.,'Select')]")
	WebElement PCT;
	
	@FindBy(xpath = "//span[contains(.,'PCT National Phase Entry')]")
	WebElement pctpage;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement next1;
	
	@FindBy(xpath = "//div[@class='alert alert-danger'][contains(.,'* Please fill in the following: PCT Application/Publication Number, Target Jurisdictions')]")
	WebElement validation1;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationumber;
	
	@FindBy(xpath = "//input[@value='translation']")
	WebElement translationonly;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement jurisdiction;
	
	@FindBy(xpath = "//h5[@class='modal-title'][contains(.,'Target Jurisdictions')]")
	WebElement targetbox;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'ARIPO (AP)')]")
	WebElement aripo;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement jurisdictionok;
	
	@FindBy(xpath = "//li[contains(.,'xARIPO (AP)')]")
	WebElement aripodisplayed;
	
	@FindBy(xpath = "//input[contains(@name,'txtRequestedDeliveryDate')]")
	WebElement deliverydate;
	
	@FindBy(xpath = "//span[contains(.,'Jurisdiction Additional Information (If Applicable) / File Upload / Special Instructions')]")
	WebElement filepage;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//span[contains(.,'Review Quote')]")
	WebElement reviewpage;
	
	@FindBy(xpath = "//button[contains(@id,'btnSubmit')]")
	WebElement quotesubmission;
	
	@FindBy(xpath = "//h2[@class='orange mb-4'][contains(.,'Success!')]")
	WebElement success;
	
	@FindBy(xpath = "//p[contains(@class,'orange')]")
	WebElement requestnumber;
	
	@FindBy(xpath = "//a[contains(.,'View Your Projects')]")
	WebElement project;
	
	public boolean pcttranslation1()throws InterruptedException
	{
		System.out.println("Again user is starting from begining");
		Thread.sleep(3000);
		project.click();
		Thread.sleep(3000);
		Thread.sleep(5000);
		New1.click();
		Thread.sleep(2000);
		quote.click();
		Thread.sleep(2000);
		PCT.click();
		Thread.sleep(2000);
		if(pctpage.isDisplayed())
		{
			System.out.println("====================================================================");
			System.out.println("Step 4 : user is in PCT page now");
		}
		next1.click();
		Thread.sleep(2000);
		 if(validation1.isDisplayed())
		 {
			 System.out.println("====================================================================");
			 System.out.println("step 5: click on next button and validation message shown");
		 }
		 else
		 {
			 System.out.println("validation message not shown please check!!!!!");
		 }
		
		 applicationumber.click();
		 applicationumber.sendKeys(Constants.appnumber);
		 return true;
	}
	
	public boolean pcttranslationopted()
	{
		 translationonly.click();
		 if(translationonly.isSelected())
		 {
			 System.out.println("User has opted for translation only");
		 }
		 else
		 {
			 System.out.println("User has not opted for translation");
		 }
		 return true;
	}	 
		 public boolean jurisdiction() throws InterruptedException
		 {
		 jurisdiction.click();
		 Thread.sleep(3000);
		 if(targetbox.isDisplayed())
		 {
			 System.out.println("user needs to select the target country");
		 }
		 else
		 {
			 System.out.println("User is not in target jurisdiction");
		 }
		  aripo.click();
		 Thread.sleep(3000);
		 jurisdictionok.click();
		 Thread.sleep(6000);
		 if(aripodisplayed.isDisplayed())
		 {
			 System.out.println("user has selected aripo country");
		 }
		 else
		 {
			 System.out.println("User has not selected aripo ");
		 }
		 deliverydate.click();
		 deliverydate.sendKeys(Constants.epvalidationdeadlinecalender);
		 Thread.sleep(2000);
		 next1.click();
		 
		return true;
		
	}
		 public boolean fileuplaoding() throws InterruptedException
		 {
			 Reporter.log("jhvfjhevf",true);
			 Thread.sleep(5000);
			 if(filepage.isDisplayed())
			 {
				 System.out.println("User is now in file upload page");
			 }
			 else
			 {
				 System.out.println("User is not in file upload page");
			 }
			 fileupload.click();
			 return true;
		 }
		
		 public boolean fileuplaodingquote() throws AWTException, InterruptedException
		{
		FileUpload f = new FileUpload(driver);
		f.fileuploading();
		Thread.sleep(3000);
		filenext.click();
		return true;
		}
		
		 public boolean submission() throws InterruptedException
		 {
			 if (reviewpage.isDisplayed())
			 {
				 System.out.println("User is now in review page");
			 }
			 else
			 {
				 System.out.println("User is not in review page");
			 }
			 Thread.sleep(3000);
			 quotesubmission.click();
			 Thread.sleep(6000);
			 if(success.isDisplayed())
			 {
				 System.out.println("Quote has been submitted as request");
			 }
			 else
			 {
				 System.out.println("Quote has not been submitted");
			 }
			 requestnumber.getText();
			 System.out.println("requets number is "+ requestnumber);
			 
		 return true;
			 
		 }
}
