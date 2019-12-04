package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;

import org.apache.http.client.fluent.Request;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class JavaHelpers 
{

	 public static void main(String[] args) 
	 {
		 
	 }
	

	/*
	Note : Excel File must be of Word 97-2003 format as jxl support that only
	 To read excel file  
	 @param xlFilePath - excel file path
	 @param sheetName - sheetname of excel
	 @param tableName - tableName within excel file
	 **/
	
	public String[][] GetTableArray(String xlFilePath, String sheetName, String tableName) throws Exception
	{
		String[][] tabArray = null;

		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		int startRow, startCol, endRow, endCol, ci, cj;
		Cell tableStart = sheet.findCell(tableName);
		startRow = tableStart.getRow();
		startCol = tableStart.getColumn();

		Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1,
				100, 64000, false);

		endRow = tableEnd.getRow();
		endCol = tableEnd.getColumn();
		/*System.out.println("startRow=" + startRow+2 + ", endRow=" + endRow + ", "
				+ "startCol=" + startCol+2 + ", endCol=" + endCol);*/

		tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
		ci = 0;

		for (int i = startRow + 1; i < endRow; i++, ci++) 
		{
			cj = 0;
			for (int j = startCol + 1; j < endCol; j++, cj++)
			{
				tabArray[ci][cj] = sheet.getCell(j, i).getContents();
			}
		}

		return (tabArray);
		
	}
	
	
	/*
	 * Generate random numbers
	*/
	public int GenerateRandomNumber()
	{
	    Random t = new Random();
	    return t.nextInt(1000000000);
	}
	
	
	public void MinimizeBrowserWindow() throws AWTException, InterruptedException
	{
		 //Alt + Space to open the window menu
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(200);
        // miNimize
       
        robot.keyRelease(KeyEvent.VK_N);
	}
	
	
	//To get Response code
	public int GetResponseCode(String url) 
	{
        try 
        {
            return Request.Get(url).execute().returnResponse().getStatusLine()
                    .getStatusCode();
        }
        catch (Exception e) 
        {
            //throw new RuntimeException(e);
            e.getMessage();
            System.out.println(e.getMessage());
            return 404;
        }
	}
	
	

	
	
}
