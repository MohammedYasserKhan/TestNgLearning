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

public class QuotePCT_Patent_ManualEntry 
{
	public WebDriver driver;
	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public QuotePCT_Patent_ManualEntry(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
		Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath = "//a[contains(.,'View Your Projects')]")
	WebElement project;
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=2'][contains(.,'PCT National Phase Entry')]")
	WebElement PCT;
	
	@FindBy(xpath = "//input[contains(@name,'txtApplicationNumber')]")
	WebElement pctappnumbner;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement next;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Yes')])[2]")
	WebElement yes1;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'No')])[2]")
	WebElement no;

	@FindBy(xpath = "//input[contains(@name,'apdNoOfPriority')]")
	WebElement numberofpriority;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfClaims')]")
	WebElement numberofclaims;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfIndependentClaim')]")
	WebElement numberofindependentclaim;
	
	@FindBy(xpath = "//input[contains(@name,'apdDescriptionWordCount')]")
	WebElement descriptionwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdTotalWordCount')]")
	WebElement totalwordcount; 
	
	@FindBy(xpath = "//input[contains(@name,'apdClaimWordCount')]")
	WebElement	claimwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdAbstractWordCount')]")
	WebElement abstractwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfTotalPages')]")
	WebElement totalpages;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfFigurePages')]")
	WebElement numberoffigurepages;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfFigures')]")
	WebElement numberoffigures;
	
	@FindBy(xpath = "//input[contains(@name,'apdFigureWordCount')]")
	WebElement figurewordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdEarliestPriorityDate')]")
	WebElement earlyprioritydate;
	
	@FindBy(xpath = "//input[contains(@name,'apd30MonthDeadline')]")
	WebElement monthdeadline;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Select jurisdictions')]")
	WebElement Targetjurisdiction;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'ARIPO (AP)')]")
	WebElement Aripo;
	
	@FindBy(xpath = "//label[@class='custom-control-label'][contains(.,'Australia (AU)')]")
	WebElement Australia;
	
	@FindBy(xpath = "//button[contains(@onclick,'targetCountriesSelectionClick();')]")
	WebElement Targetok;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//input[contains(@value,'Export Quote')]")
	WebElement export;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Approve Quote')]")
	WebElement approvequote;
		
	public boolean PCTFileandtranslating_1() throws InterruptedException
	{
		//project.click();
		//Thread.sleep(5000);
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(New).perform();
		//Thread.sleep(3000);
		actions.moveToElement(Quote).perform();
		//Thread.sleep(3000);
		actions.moveToElement(PCT).perform();
		PCT.click();
		//Thread.sleep(3000);
		return true;
	}
	
	public boolean patent() throws InterruptedException
	{
		next.click();
		Thread.sleep(2000);
		pctappnumbner.click();
		pctappnumbner.sendKeys(Constants.ManualPCTNumber);
		return true;
	}
	
	public boolean fileandtranslate() throws InterruptedException
	{
		fileandtranslate.click();
		Thread.sleep(2000);
		yes1.click();
		Thread.sleep(2000);
		pctappnumbner.click();
		Thread.sleep(2000);
		pctappnumbner.sendKeys(Constants.ManualPCTNumber);
		Thread.sleep(2000);
		fileandtranslate.click();
		Thread.sleep(2000);
		no.click();
		return true;
	}
	
	public boolean patent_details()
	{
		numberofpriority.sendKeys(Constants.Numberofpriorityapplication);
		numberofclaims.sendKeys(Constants.NumberofClaims);
		numberofindependentclaim.sendKeys(Constants.NumberofIndependentClaims);
		descriptionwordcount.sendKeys(Constants.DescriptionWordCount);
		totalwordcount.sendKeys(Constants.TotalWordCount);
		claimwordcount.sendKeys(Constants.ClaimsWordCount);
		abstractwordcount.sendKeys(Constants.AbstractWordCount);
		totalpages.sendKeys(Constants.NumberofTotalPages);
		numberoffigurepages.sendKeys(Constants.NumberofFigurePages);
		numberoffigures.sendKeys(Constants.NumberofFigures);
		figurewordcount.sendKeys(Constants.FigureWordCount);
		earlyprioritydate.sendKeys(Constants.EarliestPriorityDate);
		monthdeadline.sendKeys(Constants.EarliestPriorityDate);
		
		return true;
	}
	
	public boolean targetjurisdiction() throws InterruptedException
	{
		//Thread.sleep(30000);
		Targetjurisdiction.click();
		Thread.sleep(3000);
		Aripo.click();
		Australia.click();
		Thread.sleep(2000);
		Targetok.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		//frameYes.click();
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
	
	public boolean reviewpage() throws InterruptedException
	{
		Thread.sleep(3000);
		export.click();
		return true;
	}
	
	public boolean approvequpote()
	{
		approvequote.click();
		return true;
	}
	
	
}