package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {
public static void particular_Cell_Data() throws Throwable {
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\sample data.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheetAt(0);
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	CellType ctype = c.getCellType();
System.out.println("particular cell data");
	if (ctype.equals(CellType.STRING)) {
		String cellvalue = c.getStringCellValue();
		System.out.println(cellvalue);
	}
	else if (ctype.equals(CellType.NUMERIC)) {
		double cellvalue = c.getNumericCellValue();
		int value = (int) cellvalue;
		System.out.println(value);
	}
	
	wb.close();
	
}
//public static void main(String[] args) throws Throwable {
//	particular_Cell_Data();


public static void All_Data() throws IOException {
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\sample data.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheetAt(0);
	System.out.println("All data");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) 
	{
		Row r = s.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++)
		{
			Cell c = r.getCell(j);
			CellType ctype = c.getCellType();
			if (ctype.equals(CellType.STRING))
			{
			   String value = c.getStringCellValue();
			   System.out.println(value);
			}
			else if (ctype.equals(CellType.NUMERIC))
			{
			double numericvalue = c.getNumericCellValue();
			int valu = (int) numericvalue;
			String value = Integer.toString(valu);
			System.out.println(value);
			}
		}
	}
	wb.close();
}
/*public static void main(String[] args) throws Throwable {
	All_Data();
	particular_Cell_Data();
	Particular_row_data();
} */  
      

      public static void Particular_row_data() throws IOException {
    	  File f = new File("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\March_PR\\\\sample data.xlsx");
    	  FileInputStream fis = new FileInputStream(f);
    	  Workbook wb = new XSSFWorkbook(fis);
    	  Sheet s = wb.getSheetAt(0);
    	  Row r = s.getRow(0);
    	  int physicalNumberOfCells = r.getPhysicalNumberOfCells();
    	  System.out.println("particular row data");
    	for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell c = r.getCell(i);
			CellType ctype = c.getCellType();
			if (ctype.equals(CellType.STRING))
			{
			String value = c.getStringCellValue();	
			System.out.println(value);
			
				
			}
			else if (ctype.equals(CellType.NUMERIC))
			{
			double numericCellValue = c.getNumericCellValue();
			int v = (int) numericCellValue;
			String value = Integer.toString(v);
			
			System.out.println(value);
			}
			}
		
		}

      
      //public static void main(String[] args) throws Throwable {
    		//All_Data();
    		//particular_Cell_Data();
    		//Particular_row_data();
    	//  Particular_column_data();

      public static void Particular_column_data() throws Throwable {
    	  File f = new File("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\March_PR\\\\sample data.xlsx");
    	  FileInputStream fis = new FileInputStream(f);
    	  Workbook wb = new XSSFWorkbook(fis);
    	  Sheet s = wb.getSheetAt(0);
    	  System.out.println("particular column data");
    	  for (int i = 0; i <s.getPhysicalNumberOfRows() ; i++) {
		   Row r = s.getRow(i);
    	 Cell c = r.getCell(0);
    	 CellType ctype = c.getCellType();
    	  if (ctype.equals(CellType.STRING)) {
    		  String value = c.getStringCellValue();
    		  System.out.println(value);
    	  }
    	  else if (ctype.equals(CellType.NUMERIC))
    	  {
			double numericvalue = c.getNumericCellValue();
			int valu = (int) numericvalue;
			String value = Integer.toString(valu);
			System.out.println(value);
		}
			
		}
    	  wb.close();
			
		
    
      }
      
public static void main(String[] args) throws Throwable {
	Particular_column_data();
	particular_Cell_Data();
	All_Data();
	Particular_row_data();
}		
}
      

      
				
    	  
    	  
    	  
    	  
    	  
    	  
      

