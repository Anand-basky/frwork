package org.framlog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingBase {
	public static WebDriver driver;

	public static void getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}
	}

	public static void launch(String Url) {
		driver.get(Url);

	}

	public static WebElement locators(String attributeName, String attributeValue) {

		if (attributeName.equalsIgnoreCase("id")) {
			WebElement findElement = driver.findElement(By.id(attributeValue));
			return findElement;
		} else if (attributeName.equalsIgnoreCase("name")) {
			WebElement findElement = driver.findElement(By.name(attributeValue));
			return findElement;
		} else if (attributeName.equalsIgnoreCase("xpath")) {
			WebElement findElement = driver.findElement(By.xpath(attributeValue));
			return findElement;
		} else {
			List<WebElement> findElements = driver.findElements(By.tagName(attributeValue));
			return (WebElement) findElements;
		}

	}

	public static void textsend(WebElement findElement, String keysToSend) {
		findElement.sendKeys(keysToSend);
	}

	public static void buttonClick(WebElement findElement) {
		findElement.click();
	}

	public static void screenShot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desn = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures" + name + ".jpeg");
		FileUtils.copyFile(source, desn);
	}

	public static void selectBy(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectBy(WebElement element, String select, String value) {
		Select s = new Select(element);
		if (select.equalsIgnoreCase("value")) {
			s.selectByVisibleText(value);

		} else if (select.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		}
	}

	// to get data from file
	public static String Getfile( int rowNum, int cellNum,String sheetName) throws IOException {
		String res = null;
		File file = new File("C:\\\\Users\\\\Admin\\\\Documents\\\\ExcelSheet\\\\xl.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				res = f.format(dateCellValue);
			} else {
				double d = cell.getNumericCellValue();
				//BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				//res = valueOf.toString();
				long check = Math.round(d);
				if(check==d) {
					res = String.valueOf(check);
				}
				else {
					res = String.valueOf(d);
					
				}
			}
		default:
			break;
		}
		return res;
	}
	public static void writeData(String sheetName, int rowNum, int cellNum, String value) throws IOException {
		File file = new File("C:\\Users\\Admin\\Documents\\ExcelSheet\\xl.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet createSheet = workbook.createSheet(sheetName);
		Row createRow = createSheet.createRow(rowNum);
		Cell createCell = createRow.createCell(cellNum);
		createCell.setCellValue(value);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	// update oldDate to newDate
	public static void updateDate(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File("C:\\Users\\\\Admin\\Documents\\ExcelSheet\\xl.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	
}
