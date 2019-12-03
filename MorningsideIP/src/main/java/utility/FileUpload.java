package utility;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import pageFactory.login.OrderEpgrant;

public class FileUpload extends
OrderEpgrant
{

public FileUpload(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	private static String filePath = System.getProperty("user.dir") + "/Clarion/src/test/resources/Fileupload/WO2018229771-IB301-20181220-0250.pdf";
//	public static final String PropertyFile="src/test/resources/Constants.properties";
	
	public void fileuploading() throws AWTException, InterruptedException
	{
	 StringSelection ss = new StringSelection("D:\\Eclipse\\test\\base_framework\\MorningsideIP\\src\\test\\resources\\Fileupload\\WO2018229771-IB301-20181220-0250.pdf");
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	 Robot robot = new Robot();
     robot.delay(250);
     Thread.sleep(1000);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyRelease(KeyEvent.VK_V);
     Thread.sleep(1000);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.delay(150);
     robot.keyRelease(KeyEvent.VK_ENTER);
}

	

}