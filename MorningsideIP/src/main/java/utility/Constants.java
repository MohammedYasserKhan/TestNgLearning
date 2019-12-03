package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Constants 
{
	public static final String PropertyFile="src/test/resources/Constants.properties";
		
	/*
	Test Data location
	*/
	public static final String 	TestDataFileLocation= GetPropertyValue("TestDataFileLocation");
	
	
	/*
	Selenium Specific parameters
	*/
	public static final int WebDriverWaitDuration= Integer.parseInt(GetPropertyValue("WebDriverWaitDuration"));
	public static final int ThreadWaitInmiliseconds= Integer.parseInt(GetPropertyValue("ThreadWaitInmiliseconds"));
	
	/*
	Selenium Grid parameters
	*/
	public static final String 	nodeURLW7= GetPropertyValue("nodeURLW7");
	 
	
	/*
	Browserstack parameters
	*/
	public static final String 	BS_USERNAME= GetPropertyValue("BS_USERNAME");
	public static final String 	BS_AUTOMATE_KEY= GetPropertyValue("BS_AUTOMATE_KEY");
	
	
	/*
	SauceLabs parameters
	*/
	public static final String 	SL_USERNAME= GetPropertyValue("SL_USERNAME");
	public static final String 	SL_AUTOMATE_KEY= GetPropertyValue("SL_AUTOMATE_KEY");
	
	
	/*
	Project Specific parameters
	*/
	
		public static final String ApplicationURL = GetPropertyValue("ApplicationURL");
		public static final String Username = GetPropertyValue("Username");
		public static final String Password = GetPropertyValue("Password");
		public static final String appnumber = GetPropertyValue("appnumberep") ;
		public static final String translationdeliverydate =  GetPropertyValue("translationdeliverydate");
		public static final String epvalidationdeadlinecalender = GetPropertyValue("epvalidationdeadlinevcalender");
		public static final String requestdeliverydate = GetPropertyValue("requestdeliverydate");
		public static final String POreferencenumber = GetPropertyValue("POreferencenumber");
		public static final String Numberofpriorityapplication = GetPropertyValue("Numberofpriorityapplication");
		public static final String NumberofClaims = GetPropertyValue("NumberofClaims");
		public static final String NumberofIndependentClaims = GetPropertyValue("NumberofIndependentClaims");
		public static final String DescriptionWordCount = GetPropertyValue("DescriptionWordCount");
		public static final String TotalWordCount = GetPropertyValue("TotalWordCount");
		public static final String ClaimsWordCount = GetPropertyValue("ClaimsWordCount");
		public static final String AbstractWordCount = GetPropertyValue("AbstractWordCount");
		public static final String NumberofTotalPages = GetPropertyValue("NumberofTotalPages");
		public static final String NumberofFigurePages = GetPropertyValue("NumberofFigurePages");
		public static final String NumberofFigures = GetPropertyValue("NumberofFigures");
		public static final String EarliestPriorityDate = GetPropertyValue("EarliestPriorityDate");
		public static final String FigureWordCount = GetPropertyValue("FigureWordCount");
		public static final String TypeofDocument = GetPropertyValue("TypeofDocument");
		public static final String Templatename = GetPropertyValue("Templatename");
		public static final String Templatename2 = GetPropertyValue("Templatename2");
		public static final String PCTAppnumber = GetPropertyValue("PCTAppnumber");
		public static final String ManualEpNUmber = GetPropertyValue("ManualEpNUmber");
		public static final String NumberofClaimsPages = GetPropertyValue("NumberofClaimsPages");
		public static final String EPValidationDeadline = GetPropertyValue("EPValidationDeadline");		
		public static final String ManualPCTNumber = GetPropertyValue("ManualPCTNumber");
		public static final String musername = GetPropertyValue("musername");
		public static final String mpassword = GetPropertyValue("mpassword");
		public static final String clariontestcustomer = GetPropertyValue("clariontestcustomer");
		public static final String requesteryasser = GetPropertyValue("requesteryasser");
		
	/*
	Reading a propertyfile and getting value of any property defined
	@Param PropertyName - Name of property for which you want to get value
	*/	
		
	public static Properties prop;
	static String PropertyValue;	
	
	public static String GetPropertyValue(String PropertyName)
	{
		prop = AccessPropertiesFile();

			try{
				PropertyValue= prop.getProperty(PropertyName);	
				}

			catch(Exception e){
				}	
			return PropertyValue;
	}
	
	public static Properties AccessPropertiesFile()
	{
		prop = new Properties();

		// try retrieve data from file
		try 
		{

			prop.load(new FileInputStream(PropertyFile));
		}
		// catch exception in case properties file does not exist
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		return prop;
	}
	
	public static String GetSysPropertyValue(String property)
	{
		String PropertyNew=System.getProperty(property);
		
		if(PropertyNew == null || PropertyNew.isEmpty()) 
		{	
			PropertyNew=GetPropertyValue(property);
		}
		return PropertyNew;
		
	}

}
