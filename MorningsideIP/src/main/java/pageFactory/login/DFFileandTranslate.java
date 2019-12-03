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

public class DFFileandTranslate 
{

	public WebDriver driver;
//	JavaHelpers JH = new JavaHelpers();
	SeleniumFunctions SeleniumFunc = new SeleniumFunctions(driver);
	
	public DFFileandTranslate(WebDriver driver)
	{
		this.driver= MyDriver.driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,
				Constants.WebDriverWaitDuration), this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'New')]")
	WebElement New;
	
	@FindBy(xpath = "//a[contains(.,'Quotes')]")
	WebElement Quote;
	
	@FindBy(xpath = "//a[@href='/Wizard/StepTwo?requestType=1&serviceType=1&productType=3'][contains(.,'Select')]")
	WebElement DF;
	
	@FindBy(xpath = "//span[contains(.,'General Info')]")
	WebElement DFGeneralinfo;
	
	@FindBy(xpath = "//input[contains(@name,'txtReferenceNumber')]")
	WebElement POnumber;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement Sourcelanguage;
	
	@FindBy(xpath = "//select[@class='form-control']/option[2]")
	WebElement Chinese;
	
	@FindBy(xpath = "//input[contains(@value,'validatetranslation')]")
	WebElement fileandtranslate;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfPriority')]")
	WebElement numberofpriorityapplications;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfClaims')]")
	WebElement numberofclaims;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfIndependentClaim')]")
	WebElement numberofindependentclaims;
	
	@FindBy(xpath = "//input[contains(@name,'apdDescriptionWordCount')]")
	WebElement descriptionwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdTotalWordCount')]")
	WebElement Totalwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdClaimWordCount')]")
	WebElement claimswordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdAbstractWordCount')]")
	WebElement Abstractwordcount;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfTotalPages')]")
	WebElement TotalnumberofPages;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfFigurePages')]")
	WebElement Numbmeroffigurespages;
	
	@FindBy(xpath = "//input[contains(@name,'apdNoOfFigures')]")
	WebElement Numberoffigures;
	
	@FindBy(xpath = "//input[contains(@class,'form-control boot-datepicker apdDatepicker')]")
	WebElement earlyprioritydate;
	
	@FindBy(xpath = "//input[contains(@name,'apdFigureWordCount')]")
	WebElement Figurewordcount;
	
	@FindBy(xpath = "//button[contains(.,'Select jurisdictions')]")
	WebElement targetjurisdiction;
	
	@FindBy(xpath = "//div[@class='custom-control custom-checkbox'][contains(.,'Argentina (AR)')]")
	WebElement Argentina;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[48]")
	WebElement targetok;
	
	@FindBy(xpath = "//li[contains(@style,'width: 119px;')]")
	WebElement argentdisplayed;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[18]")
	WebElement deliverydate;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep3();')]")
	WebElement next1;
	
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement fileupload;
	
	@FindBy(xpath = "//button[contains(@onclick,'NextToStep4();')]")
	WebElement filenext;
	
	@FindBy(xpath = "//input[contains(@value,'Export Quote')]")
	WebElement exportquote;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Approve Quote')]")
	WebElement approvequote;
	
	public boolean DFFile() throws InterruptedException
	{
		
		New.click();
		Quote.click();
		DF.click();
		if(DFGeneralinfo.isDisplayed())
		{
			System.out.println("================================================================");
			System.out.println("Step 3 : users is now in Direct Filing page ");
		}
		
		else
		{
			System.out.println("User is not in Direct Filing page");
			
		}
		return true;
	}
	public boolean POnumberpassing()
	{
		POnumber.click();
		POnumber.sendKeys(Constants.POreferencenumber);
		//System.out.println("PO number has been provided");
		return true;
	}
	public boolean sourcelanguage() throws InterruptedException
	{
		Sourcelanguage.click();
		Thread.sleep(2000);
		Chinese.click();
		//System.out.println("Source language has been selected");
		return true;
	}	
	
	public boolean fileandtranslate()
	{
		fileandtranslate.click();
		return true;
	}
	
	public boolean pateninfo()
	{
		numberofpriorityapplications.click();
		numberofpriorityapplications.sendKeys(Constants.Numberofpriorityapplication);
		numberofclaims.click();
		numberofclaims.sendKeys(Constants.NumberofClaims);
		numberofindependentclaims.click();
		numberofindependentclaims.sendKeys(Constants.NumberofIndependentClaims);
		descriptionwordcount.click();
		descriptionwordcount.sendKeys(Constants.DescriptionWordCount);
		Totalwordcount.click();
		Totalwordcount.sendKeys(Constants.TotalWordCount);
		claimswordcount.click();
		claimswordcount.sendKeys(Constants.ClaimsWordCount);
		Abstractwordcount.click();
		Abstractwordcount.sendKeys(Constants.AbstractWordCount);
		TotalnumberofPages.click();
		TotalnumberofPages.sendKeys(Constants.NumberofTotalPages);
		Numbmeroffigurespages.click();
		Numbmeroffigurespages.sendKeys(Constants.NumberofFigurePages);
		Numberoffigures.click();
		Numberoffigures.sendKeys(Constants.NumberofFigures);
		earlyprioritydate.click();
		earlyprioritydate.sendKeys(Constants.EarliestPriorityDate);
		Figurewordcount.clear();
		Figurewordcount.sendKeys(Constants.FigureWordCount);
		return true;
	}
	
	public boolean TargetJurisdiction() throws InterruptedException
	{
		targetjurisdiction.click();
		Thread.sleep(3000);
		Argentina.click();
		targetok.click();
		Thread.sleep(3000);
		deliverydate.click();
		deliverydate.sendKeys(Constants.EarliestPriorityDate);
		next1.click();
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
	
	
	

