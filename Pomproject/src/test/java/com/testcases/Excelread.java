package com.testcases;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelread {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	@Test
	public void readdata() throws IOException {
		FileInputStream finput=new FileInputStream("C:\\Users\\edwin\\Downloads\\orangeloginexcel.xlsx");
		
			
		workbook=new XSSFWorkbook(finput);
		sheet=workbook.getSheet("sheet1");
		row=sheet.getRow(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println("rowcount:"+rowcount);
		int columncount=row.getLastCellNum();
		System.out.println("column count is:"+columncount);
		for(int i=0;i<=rowcount;i++) {
			for(int j=0;j<columncount;j++ ) {
				 String data=sheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.println("the data is "+data);
				 
				
			}
		}
	}
}


	
	
	
  
	
	