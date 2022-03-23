package com.March_PR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Base_class {
	
	public static WebDriver driver;
	public static  WebDriver browser_Configuration (String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
			           System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.getco.driver", "");
			 driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void clickOnElement(WebElement element) {
		//sigin.click();
		element.click();
		
	}
	
	public static void inputValueElement(WebElement element, String data) {
		//sendkeys();
		element.sendKeys(data);
		
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void geturl(String url) {
     driver.get(url);
	}
	
	public static void implicitwait(int time, TimeUnit format) {
		
		driver.manage().timeouts().implicitlyWait(time, format);
	}
	
	public static void dropdown(String type , WebElement element, String value) {
		Select s = new Select(element);
		try {
			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			}
			else if (type.equalsIgnoreCase("element")) {
				s.selectByVisibleText(value);
			}
			
			else if (type.equalsIgnoreCase("byindex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
    public  static String value;
	public static String particular_cell_value(String pathname,int row_index,int cell_index) throws Throwable {
		File f = new File(pathname);
		FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);
        org.apache.poi.ss.usermodel.Sheet s = wb.getSheetAt(0);
        Row r = s.getRow(row_index);
        Cell c = r.getCell(cell_index);
        CellType ctype = c.getCellType();
        if (ctype.equals(CellType.STRING)) {
        	value = c.getStringCellValue();
      
      
		}
        else if (ctype.equals(CellType.NUMERIC)) {
        	double numericValue = c.getNumericCellValue();
			int valu = (int) numericValue;
			 value = Integer.toString(valu);
			
		}
        return value;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
