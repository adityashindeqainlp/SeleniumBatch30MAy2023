package ApcahePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Author -- Aditya Shinde Java + Selenium 12-Sep-2023 4:42:44 pm
 **/
public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File path = new File(".\\data\\Data1.xlsx");
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		
		XSSFSheet sheet = workbook.getSheetAt(1);
		
		FileOutputStream fos = new FileOutputStream(path);
		
		sheet.createRow(4).createCell(4).setCellValue("Mr. Bean");
		
		workbook.write(fos);
		
		System.out.println("Data Updated.....");
		
		
		
	}

}
