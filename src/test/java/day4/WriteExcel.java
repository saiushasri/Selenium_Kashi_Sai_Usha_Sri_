package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {

	@Test
	public void testData()
	{
	
		try 
		{		
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testdata/SapientTestData.xlsx")));
			
			wb.getSheet("LoginData").createRow(5).createCell(0).setCellValue("Selenium");
			wb.getSheet("LoginData").getRow(5).createCell(1).setCellValue("WebDriver");
			
			wb.write(new FileOutputStream(new File("./testdata/SapientTestData.xlsx")));
			
			wb.close();
			
		} catch (FileNotFoundException e) 
		{
			System.out.println("Please check data file path"+e.getMessage());
		} catch (IOException e) {
			System.out.println("Something Went Wrong IO "+e.getMessage());
		}
		
		
	}
	
	
}
