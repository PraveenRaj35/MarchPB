package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\Admin\\Desktop\\User_Data.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	//wb.createSheet("User_Data").createRow(0).createCell(0).setCellValue("Marvel character");
	wb.createSheet("User_Data").createRow(0).createCell(0).setCellValue("Marvel");
	wb.getSheet("User_Data").getRow(0).createCell(1).setCellValue("Weapon");
	
    FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("sucess");
	
	
}	

}
