package test01;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {
	
	public static void main(String[] args) throws Exception {
		
		// Specify the location of excel file
		File src = new File(
				"/home/ap/Downloads/storagetelegram/Training Materials/Short Notes.xlsx");
		
		// Load File
		FileInputStream fis = new FileInputStream(src);
		
		// Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load Worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		// print the load sheet name
		System.out.println(sh.getSheetName());
		
		// Print Selenium from Excel sheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		// Print Java from Excel sheet
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		
		// Print total number of row - 1st way
		System.out.println("Total Rows :- " + sh.getPhysicalNumberOfRows());
		
		// Print total number of row - 2nd way
		System.out.println("Total Rows :- " + (sh.getLastRowNum() + 1));
		
		// Print total number of columns - 1st way
		System.out.println("Total Columns :- " + sh.getRow(1).getPhysicalNumberOfCells());
		
		// Print total number of columns - 2nd way
		System.out.println("Total Columns :- " + sh.getRow(1).getLastCellNum());
		
		// Real Time Implementation
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		// Enter Username using excel file
		String s = sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(s);
	}

}
