package com.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelreadfromspecificrowandColumn {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	@Test
	public void specificrowdata() throws IOException {
		FileInputStream finput=new FileInputStream("c:\\users\\edwin\\Downloads\\orangeloginexcel.xlsx");
	workbook=new XSSFWorkbook(finput);
	sheet=workbook.getSheet("sheet1");
	row=sheet.getRow(0);
	int rowcount=sheet.getLastRowNum();
	System.out.println("The no of rows:"+rowcount);
	int columncount=row.getLastCellNum();
	System.out.println("column count is:"+columncount);
	
	  String data=sheet.getRow(1).getCell(1).getStringCellValue();
	  System.out.println("The datais :"+data);
	  
			
	
	}

}
