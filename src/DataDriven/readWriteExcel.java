package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readWriteExcel extends reusableMethods{
	
	public FileInputStream fis;
	
	public String readData(String sheetname, int rowno, int cellno) throws IOException{
		
		fis = new FileInputStream("D:\\Selenium Library\\cred.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		XSSFRow row = sheet.getRow(rowno);
		XSSFCell cell = row.getCell(cellno);
		String value =cell.getStringCellValue();
		
		System.out.println(value);
		return value;
	}
	
	public void setData(String sheetname, int rowno, int cellno, String cellValue) throws IOException{
		
		fis = new FileInputStream("D:\\Selenium Library\\cred.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		XSSFRow row = sheet.getRow(rowno);
		XSSFCell cell = row.createCell(cellno);
		cell.setCellType(CellType.STRING);
		
		cell.setCellValue(cellValue);
		
		FileOutputStream fout = new FileOutputStream("D:\\Selenium Library\\cred.xlsx");
		
		wb.write(fout);
		
		System.out.println("Data Write Successful!");
		
		fout.close();
		
	
	}

}
