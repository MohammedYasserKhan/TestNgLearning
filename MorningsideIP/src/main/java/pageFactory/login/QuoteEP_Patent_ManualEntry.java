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

public class QuoteEP_Patent_ManualEntry 
{
	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuoteEP_Patent_ManualEntry(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
	//@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Projects')]")
	//@FindBy(xpath = "//a[contains(.,'View Your Projects')]")
	//WebElement project;
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Home')]")
	WebElement home;
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=1'][contains(.,'EP Grant / Validation')]")
	WebElement EP;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement applicationnumber;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement Sourcelanguage;
	
	@FindBy(xpath = "//select[@class='form-control']/option[2]")
	//@FindBy(xpath = "//select[@class='form-control']/option[1]")
	WebElement english;
	
	@FindBy(xpath = "//input[contains(@value,'grantNotice71Yes')]")
	WebElement claimyes;
	
	@FindBy(xpath = "//input[contains(@name,'txtEPGrantRequestedDeliveryDate')]")
	WebElement Deliverydate;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Yes')])[2]")
	WebElement yes1;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'No')])[2]")
	WebElement no;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfClaims')]")
	WebElement numberofclaims;
	
	@FindBy(xpath = "//input[contains(@name,'apdClaimWordCount')]")
	WebElement claimswordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfClaimPages')]")
	WebElement numberofclaimpages;
	
	@FindBy(xpath = "//input[contains(@name,'apdTotalWordCount')]")
	WebElement totalwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdDescriptionWordCount')]")
	WebElement descriptionwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfTotalPages')]")
	WebElement numberoftotalpages;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfFigurePages')]")
	WebElement numberoffigurepages;
	
	@FindBy(xpath = "//input[contains(@name,'apdFigureWordCount')]")
	WebElement figurewordcount;
	
	@FindBy(xpath = "//input[@name='txtAdditionalDate']")
	WebElement epvalidationdeadline;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement Targetjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Albania (AL)')]")
	WebElement Albania;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Austria (AT)')]")
	WebElement asutria;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement targetok;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement Next1;
	
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
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Approve Quote')]")
	WebElement Approvequote;
	
	public boolean Epselection() throws InterruptedException
	{
		//project.click();
		Thread.sleep(30000);
		home.click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		Thread.sleep(3000);
		actions.moveToElement(EP).perform();
		EP.click();
		return true;
	}

	public boolean applicationnumber() throws InterruptedException
	{
		applicationnumber.click();
		Thread.sleep(2000);
		applicationnumber.sendKeys(Constants.ManualEpNUmber);
		Thread.sleep(2000);
		Sourcelanguage.click();
		Thread.sleep(3000);
		english.click();
		return true;
	}
	
	public boolean claimsEP() throws InterruptedException
	{
		Thread.sleep(5000);
		claimyes.click();
		Deliverydate.click();
		Thread.sleep(2000);
		Deliverydate.sendKeys(Constants.EarliestPriorityDate);
		fileandtranslate.click();
		Thread.sleep(2000);
		yes1.click();
		Thread.sleep(2000);
		applicationnumber.click();
		Thread.sleep(2000);
		applicationnumber.sendKeys(Constants.ManualEpNUmber);
		Thread.sleep(2000);
		fileandtranslate.click();
		Thread.sleep(2000);
		no.click();
		return true;
	}
	
	public boolean patentdetails() throws InterruptedException
	{
		numberofclaims.click();
		Thread.sleep(2000);
		numberofclaims.sendKeys(Constants.NumberofClaims);
		claimswordcount.click();
		Thread.sleep(2000);
		claimswordcount.sendKeys(Constants.ClaimsWordCount);
		Thread.sleep(2000);
		numberofclaimpages.click();
		Thread.sleep(2000);
		numberofclaimpages.sendKeys(Constants.NumberofClaimsPages);
		Thread.sleep(2000);
		totalwordcount.click();
		Thread.sleep(2000);
		totalwordcount.sendKeys(Constants.TotalWordCount);
		Thread.sleep(2000);
		descriptionwordcount.click();
		Thread.sleep(2000);
		descriptionwordcount.sendKeys(Constants.DescriptionWordCount);
		Thread.sleep(2000);
		numberoftotalpages.click();
		Thread.sleep(2000);
		numberoftotalpages.sendKeys(Constants.NumberofTotalPages);
		Thread.sleep(2000);
		numberoffigurepages.click();
		Thread.sleep(2000);
		numberoffigurepages.sendKeys(Constants.NumberofFigurePages);
		Thread.sleep(2000);
		figurewordcount.click();
		Thread.sleep(2000);
		figurewordcount.sendKeys(Constants.FigureWordCount);
		Thread.sleep(2000);
		epvalidationdeadline.click();
		Thread.sleep(2000);
		epvalidationdeadline.sendKeys(Constants.EPValidationDeadline);
		Thread.sleep(2000);
		return true;
	}
	
	public boolean Jurisdiction() throws InterruptedException
	{
		Thread.sleep(30000);
		System.out.println("tracing");
		Targetjurisdiction.click();
		Thread.sleep(3000);
		Albania.click();
		Thread.sleep(2000);
		asutria.click();
		Thread.sleep(2000);
		targetok.click();
		Thread.sleep(2000);
		Next1.click();
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
	Thread.sleep(10000);
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
	
	
	public boolean approve() throws InterruptedException
	{
		Thread.sleep(3000);
		Approvequote.click();
		
		return true;
	}
}
