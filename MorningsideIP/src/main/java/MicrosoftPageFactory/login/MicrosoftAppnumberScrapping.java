package MicrosoftPageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pageFactory.login.MyDriver;
import utility.Constants;
import utility.JavaHelpers;
import utility.SeleniumFunctions;

public class MicrosoftAppnumberScrapping 
{
	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public MicrosoftAppnumberScrapping(WebDriver driver)
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
	
	@FindBy(xpath = "//select[contains(@name,'CustomerId')]")
	WebElement customer;
	
	@FindBy(xpath = "//select[contains(@name,'CustomerId')]/option[396]")
	WebElement clarion;
	
	@FindBy(xpath = "//select[contains(@onchange,'contactPersonsChangeEvent();')]")
	WebElement requestername;
	
	@FindBy(xpath = "//select[contains(@onchange,'contactPersonsChangeEvent();')]/option[11]")
	WebElement Yasser;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationnumber;
	
	@FindBy(xpath = "//select[contains(@name,'ddlSourceLanguages')]")
	WebElement sourceclick;
	
	@FindBy(xpath = "//select[contains(@name,'ddlSourceLanguages')]/option[2]")
	WebElement english;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71Yes')]")
	WebElement claimyes;
		
	@FindBy(xpath = "//input[contains(@name,'txtEPGrantRequestedDeliveryDate')]")
	WebElement deliverydate;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
	@FindBy(xpath = "//input[@value='translation']")
	WebElement translationonly;
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Home')]")
	WebElement Home;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=2'][contains(.,'PCT National Phase Entry')]")
	WebElement pct;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement pctappnumbner;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement pctfileandtranslate;
	
	@FindBy(xpath = "//input[@value='translation']")
	WebElement pcttranslation;
	
	public boolean EPSelection() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		actions.moveToElement(EP).perform();
		EP.click();
		customer.click();
		Thread.sleep(2000);
		clarion.click();
		Thread.sleep(2000);
		requestername.click();
		Thread.sleep(2000);
		Yasser.click();
		return true;
	}
	
	public boolean EPappnumber() throws InterruptedException
	{
		applicationnumber.click();
		applicationnumber.sendKeys(Constants.appnumber);	
		sourceclick.click();
		Thread.sleep(2000);
		english.click();
		return true;
	}
	
	public boolean epclaim()
	{
		claimyes.click();
		deliverydate.click();
		deliverydate.sendKeys(Constants.EPValidationDeadline);
		return true;
	}
	
	public boolean EPFileandTranslate() throws InterruptedException
	{
		fileandtranslate.click();
		Thread.sleep(10000);
		return true;
	}
	
	public boolean EpTranslate() throws InterruptedException
	{
		Thread.sleep(10000);
		translationonly.click();
		Thread.sleep(5000);
		return true;
	}
	
	public boolean PCTselection() throws InterruptedException
	{
		Thread.sleep(5000);
		Home.click();
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		actions.moveToElement(pct).perform();
		pct.click();
		Thread.sleep(2000);
		customer.click();
		Thread.sleep(2000);
		clarion.click();
		Thread.sleep(2000);
		requestername.click();
		Thread.sleep(2000);
		Yasser.click();
		return true;
	}
	
	public boolean PCTappnumber()
	{
		pctappnumbner.click();
		pctappnumbner.sendKeys(Constants.PCTAppnumber);
		return true;
	}
	
	public boolean PCTfileandtranslate() throws InterruptedException
	{
		fileandtranslate.click();
		Thread.sleep(5000);
		return true;
	}
	
	public boolean pcttranslation() throws InterruptedException
	{
		Thread.sleep(10000);
		pcttranslation.click();
		return true;
	}
}