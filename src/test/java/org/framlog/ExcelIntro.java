package org.framlog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\welcome\\eclipse-workspace\\FrameSam1\\src\\Excel\\sample.xlsx");
		FileInputStream stream = new FileInputStream(f);
		
		Workbook book =new XSSFWorkbook(stream);
		Sheet Sheet = book.getSheet("Sheet1");
		Row row = Sheet.getRow(2);
		Cell cell = row.getCell(0);
		//String stringCellValue = cell.getStringCellValue();
		System.out.println(cell);
		
	}

}
