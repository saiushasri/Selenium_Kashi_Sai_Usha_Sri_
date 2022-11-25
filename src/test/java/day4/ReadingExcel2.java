package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel2 {
	@Test
	public Object testData() {
		Object arr[][] = null;
		try {
			FileInputStream fis = new FileInputStream(new File("./SapientTestData/TestData.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			for (int i = 0; i < wb.getSheet("LoginData").getPhysicalNumberOfRows(); i++) {
				for (int j = 0; j < wb.getSheet("LoginData").getRow(i).getPhysicalNumberOfCells(); j++) {
					String username = wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
					arr[i][j] = username;
					System.out.print(username);
				}
				System.out.println();
			}
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}

}
