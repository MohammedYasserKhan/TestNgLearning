package utility;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class SeleniumFunctions 
{

	WebDriver driver; 
	
	public SeleniumFunctions(WebDriver driver) 
	{
			this.driver=driver;
	}
	
	 
	
	/*
	For clicking on element on page
	*/
	public void ClickOnElement(String locator, String locatorvalue)
	{
		WebDriverWaitMethod(locator,locatorvalue);
		
		if(locator.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatorvalue)).click();
		}
		
		if(locator.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(locatorvalue)).click();
		}
		
		if(locator.equalsIgnoreCase("css"))
		{
			driver.findElement(By.cssSelector(locatorvalue)).click();
		}
		
		if(locator.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(locatorvalue)).click();
		}
			
		if(locator.equalsIgnoreCase("linkText"))
		{
			driver.findElement(By.linkText(locatorvalue)).click();
		}
	}
	
	
	/*
	For waiting for element to be visible on page
	*/
	public void WebDriverWaitMethod(String locator, String locatorvalue)
	{
		WebDriverWait wait = new WebDriverWait(driver, Constants.WebDriverWaitDuration);
		
		try
		{
			if(locator.equalsIgnoreCase("id"))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
			}
			
			if(locator.equalsIgnoreCase("name"))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
			}
			
			if(locator.equalsIgnoreCase("css"))
			{
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorvalue)));
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locatorvalue)));
			}
			
			if(locator.equalsIgnoreCase("xpath"))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
			}
			
			if(locator.equalsIgnoreCase("linkText"))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorvalue)));
			}
			
		}
		catch (Exception e)
		{
			System.out.println("Element is NOT visible");
		}
	}
	
	
	/*
	To verify whether element is present on page or not
	*/
	public boolean IsElementPresent(String locator, String locatorvalue) 
	{
	    try 
	    { 	
	    	if(locator.equalsIgnoreCase("id"))
			{
	    		driver.findElement(By.id(locatorvalue));
	    		
			}
	    	

	    	if(locator.equalsIgnoreCase("css"))
			{
	    		driver.findElement(By.cssSelector(locatorvalue));
	    		
			}
	    	

	    	if(locator.equalsIgnoreCase("xpath"))
			{
	    		driver.findElement(By.xpath(locatorvalue));
	    		
			}
	    	

	    	if(locator.equalsIgnoreCase("name"))
			{
	    		driver.findElement(By.name(locatorvalue));
	    		
			}
	    	
	    	
	    	if(locator.equalsIgnoreCase("linkText"))
			{
	    		driver.findElement(By.linkText(locatorvalue));
	    		
			}
	    	
	    	return true;
	    	
	    }
	    catch (NoSuchElementException e) 
	    {
	      return false;
	    }
	}

	
	/*
	For getting element's text from page
	*/
	public String GetElementText(String locator, String locatorvalue)
	{
		//WebDriverWaitMethod(locator,locatorvalue);
		
		String temptext=null;
		if(locator.equalsIgnoreCase("id"))
		{
			temptext= driver.findElement(By.id(locatorvalue)).getText();
		}
		
		if(locator.equalsIgnoreCase("name"))
		{
			temptext= driver.findElement(By.name(locatorvalue)).getText();
		}
		
		if(locator.equalsIgnoreCase("css"))
		{
			temptext= driver.findElement(By.cssSelector(locatorvalue)).getText();
		}
		
		
		if(locator.equalsIgnoreCase("xpath"))
		{
			temptext= driver.findElement(By.xpath(locatorvalue)).getText();
		}
		
		
		if(locator.equalsIgnoreCase("linkText"))
		{
			temptext= driver.findElement(By.linkText(locatorvalue)).getText();
		}
		
		return temptext;
	}
	
	
	/*
	For entering value in text box on page
	*/
	public void EnterValueInTextbox(String locator, String locatorvalue, String data)
	{
		WebDriverWaitMethod(locator,locatorvalue);
		
		if(locator.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatorvalue)).sendKeys(data);
		}
		
		if(locator.equalsIgnoreCase("name"))
		{
		
			driver.findElement(By.name(locatorvalue)).sendKeys(data);
		}
		
		if(locator.equalsIgnoreCase("css"))
		{
			
			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(data);
		}
		
		if(locator.equalsIgnoreCase("xpath"))
		{
			
			driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
		}
		
		
	}
	
	
	/*
	For deleting value from text box on page
	*/
	public void DeleteValueFromTextbox(String locator, String locatorvalue)
	{
		WebDriverWaitMethod(locator,locatorvalue);
		
		if(locator.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatorvalue)).clear();
		}
		
		if(locator.equalsIgnoreCase("name"))
		{
		
			driver.findElement(By.name(locatorvalue)).clear();
		}
		
		if(locator.equalsIgnoreCase("css"))
		{
			
			driver.findElement(By.cssSelector(locatorvalue)).clear();
		}
		
		if(locator.equalsIgnoreCase("xpath"))
		{
			
			driver.findElement(By.xpath(locatorvalue)).clear();
		}
		
		
	}
	
	
	/*
	For getting attribute value for element on page
	*/
	public String GetAttributeValue(String locator, String locatorvalue, String attributename)
	{
		WebDriverWaitMethod(locator,locatorvalue);
		
		
		String temptext=null;
		if(locator.equalsIgnoreCase("id"))
		{
			WebElement e = driver.findElement(By.id(locatorvalue));
			temptext = e.getAttribute(attributename);
		}
		
		if(locator.equalsIgnoreCase("name"))
		{
			WebElement e = driver.findElement(By.name(locatorvalue));
			temptext = e.getAttribute(attributename);
		}
		
		if(locator.equalsIgnoreCase("css"))
		{
			WebElement e = driver.findElement(By.cssSelector(locatorvalue));
			temptext = e.getAttribute(attributename);
		}
		
		
		if(locator.equalsIgnoreCase("xpath"))
		{
			WebElement e = driver.findElement(By.xpath(locatorvalue));
			temptext = e.getAttribute(attributename);
		}
		
		return temptext;
	}
	
	
	/*
	For clicking on specified item from dropdown list
	*/
	public void ToClickOnSpecifiedItemFromDropdown(String divid, String ItemToClick)
	{
		String tempcss= "div#" + divid+ " li";
		int count = driver.findElements(By.cssSelector(tempcss)).size();
		
		
		for (int i = 2; i < count; i++)
		{
			
			String locatorvalue = "div#" + divid+ " li:nth-of-type(" + i+ ")";
			String temp= driver.findElement(By.cssSelector(locatorvalue)).getText();
			if(temp.equals(ItemToClick))
				{
					//System.out.println("Got required element");
					driver.findElement(By.cssSelector(locatorvalue)).click();
					break;
				}
				
		}
	}

	
	/*
	To navigate given Url
	*/
	public void ToGoToUrl(String Url) throws InterruptedException
	{
		Thread.sleep(10000);
		driver.get(Url);
	}
	
	
	/*
	To select value from drop down list using Visible text
	 */
	public void SelectValueFromDropdownList(String locatortype, String locatorvalue, String visibletext)
	{
		if(locatortype.equalsIgnoreCase("id"))
		{
			new Select(driver.findElement(By.id(locatorvalue))).selectByVisibleText(visibletext);
		}
		
		else if(locatortype.equalsIgnoreCase("css"))
		{
			new Select(driver.findElement(By.cssSelector(locatorvalue))).selectByVisibleText(visibletext);
		}
		
		else if(locatortype.equalsIgnoreCase("xpath"))
		{
			new Select(driver.findElement(By.xpath(locatorvalue))).selectByVisibleText(visibletext);
		}
		
	}
	
	
	/*
	To select value from drop down list using Index
	 */
	public void SelectValueFromDropdownListUsingIndex(String locatortype, String locatorvalue,int index)
	{
		if(locatortype.equalsIgnoreCase("id"))
		{
			new Select(driver.findElement(By.id(locatorvalue))).selectByIndex(index);
		}
		
	}
	
	
	/*
	To get selected value from drop down list
	 */
	public String GetSelectedValueFromDropdownList(String locatortype, String locatorvalue)
	{
		String selectedtext = null;
		if(locatortype.equalsIgnoreCase("id"))
		{
			WebElement element = new Select(driver.findElement(By.id(locatorvalue))).getFirstSelectedOption();
			selectedtext = element.getText();
			
		}
		if(locatortype.equalsIgnoreCase("css"))
		{
			WebElement element = new Select(driver.findElement(By.cssSelector(locatorvalue))).getFirstSelectedOption();
			selectedtext = element.getText();
			
		}
		
		if(locatortype.equalsIgnoreCase("name"))
		{
			WebElement element = new Select(driver.findElement(By.name(locatorvalue))).getFirstSelectedOption();
			selectedtext = element.getText();
			
		}
		
		return selectedtext;
		
		
	}
	
	
	/*
	Accept JS alert and get it's text
	*/
	public String AcceptAlertAndGetText()
	{
		Alert alert = driver.switchTo().alert();
        String AlertText = alert.getText();
        alert.accept();
        
        return AlertText;
	}
	
	
	/*
	Dismiss JS alert and get it's text
	*/
	public String DismisAlertAndGetText()
	{
		Alert alert = driver.switchTo().alert();
        String AlertText = alert.getText();
        alert.dismiss();
        
        return AlertText;
	}
	
	
	/*
	To get current page url
	*/
	public String ToGetCurrentPageUrl()
	{
		return driver.getCurrentUrl();
		
	}
	//getText()
	public String ToGetCurretText(String Locater)
	{
		return  driver.findElement(By.cssSelector(Locater)).getText();
		
	}
	
	//Get Element Count
	public int GetElementCount(String locator, String locatorvalue)
	{
		WebDriverWaitMethod(locator,locatorvalue);
		List<WebElement> optionCount=null;
		
		if(locator.equalsIgnoreCase("id"))
		{
			optionCount = driver.findElements(By.id(locatorvalue));
			
		
		}
		
		if(locator.equalsIgnoreCase("css"))
		{
			optionCount = driver.findElements(By.cssSelector(locatorvalue));
			
		
		}
		return optionCount.size();
	}
	

	/*To mouse hover on element*/
	public void ToMouseHover(String locator, String locatorvalue ) throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector(locatorvalue));
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		
		
		String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                "arguments[0].dispatchEvent(evObj);";

		WebElement element1 = driver.findElement(By.cssSelector(locatorvalue));
		((JavascriptExecutor)driver).executeScript(javaScript, element1);
		
		Thread.sleep(5000);
		
		/*if(locator.equalsIgnoreCase("id"))
		{
			element = driver.findElement(By.id(locatorvalue));
		}
		
		if(locator.equalsIgnoreCase("name"))
		{
			element = driver.findElement(By.name(locatorvalue));
		}
		
		if(locator.equalsIgnoreCase("css"))
		{
			element =driver.findElement(By.cssSelector(locatorvalue));
		}
		
		if(locator.equalsIgnoreCase("xpath"))
		{
			element =driver.findElement(By.xpath(locatorvalue));
		}
		*/
		
		
	}
	
	public void VerifyDropDownOptions(String locator, String locatorvalue, String[] dropdownvalues)
	{
		WebElement dropdown = null;
		int count = 0;

		 
		if(locator.equals("css"))
		{
			dropdown = driver.findElement(By.cssSelector(locatorvalue));
		}
		
		if(locator.equals("id"))
		{
			dropdown = driver.findElement(By.id(locatorvalue));
		}
		
		if(locator.equals("name"))
		{
			dropdown = driver.findElement(By.name(locatorvalue));
		}
		
		Select select = new Select(dropdown);

		List<WebElement> options = select.getOptions();
		for (WebElement we : options) {
		    for (int i = 0; i < dropdownvalues.length; i++) {
		         if (we.getText().equals(dropdownvalues[i])) {
		             count++;
		              System.out.println(dropdownvalues[i]);
		          }
		      }
		}
		if (count == dropdownvalues.length) 
		 {
		   	System.out.println("Success !! Correct Dropdown values present");
			Reporter.log("Success !! Correct Dropdown values present"); 
		} 
		else 
		{
		   	System.out.println("Failure !! Not displaying Correct values for dropdown");
			Reporter.log("Failure !! Not displaying Correct values for dropdown"); 
					
			Assert.fail();
		}
	}	
	
	
	/*
	 To verify whether element is Jump  on Page  or not
	*/
	
	public void jumpToPage(String locator ){	
	    List<WebElement> PageNo = driver.findElements(By.cssSelector(locator));
	    if (PageNo.size() == 0){
	        List<WebElement> nextPage = driver.findElements(By.xpath(locator));
	        if(nextPage.size() >= 1){
	            nextPage.get(0).click();
	        }
	    }
	    else
	    	PageNo.get(0).click();
	    
	}
	
	
	
	/*
	 To verify whether element is present on page or not
	*/
	public boolean IsElementPresent(WebElement element) 
	{
		boolean b= false;
	    try 
	    { 	
	    	if (element.isDisplayed())
	    		{
	    		b=true;
	    		}
	    	
	    	
	    }
	    catch (NoSuchElementException e) 
	    {
	      b=false;
	    }
	    
	    return b;
	}
	
}