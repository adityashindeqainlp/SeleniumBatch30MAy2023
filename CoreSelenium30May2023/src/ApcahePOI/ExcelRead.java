package ApcahePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 * @Author -- Aditya Shinde Java + Selenium 12-Sep-2023 4:15:21 pm
 **/
public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File path = new File(".\\data\\Data1.xlsx");
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String value = sheet.getRow(3).getCell(4).getStringCellValue();
		
		System.out.println(value);
		
		
		
	}

}
