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
