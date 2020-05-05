package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil {
	FileInputStream fil;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	public  String excel_username(int a) throws IOException 
	{
		  
		  FileInputStream fil = new FileInputStream(("C:\\Users\\edwin\\eclipse-workspace1\\orangehrm\\src\\test\\resources\\Test Data\\linkedin.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		    
			  XSSFRow row =sheet.getRow(a);//it will take the data from row no "a" 
			  XSSFCell cell=row.getCell(0);
			  String un=cell.getStringCellValue();
			  
            
		return un;
	}
	
	//To read and return the password
	public  String excel_password(int b) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(("C:\\Users\\edwin\\eclipse-workspace1\\orangehrm\\src\\test\\resources\\Test Data\\linkedin.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		    
		  XSSFRow row =sheet.getRow(b);
		  XSSFCell cell=row.getCell(0);
		  String pwd=cell.getStringCellValue();
		  
        
	return pwd;
		  
	}
	public int getRowCount(String Xlpath,String Sheet) throws IOException {
		File fs=new File(Xlpath);
		fil=new FileInputStream(fs);
		workbook=new XSSFWorkbook(fil);
		sheet=workbook.getSheet(Sheet);
		
		int rowcount=sheet.getLastRowNum();
		return rowcount;
		
		
	}
	public int getcellcount(String Xlpath,String Sheet,int rowcount) throws IOException {
		File fs=new File(Xlpath);
		fil=new FileInputStream(fs);
		workbook=new XSSFWorkbook(fil);
		sheet=workbook.getSheet(Sheet);
		row=sheet.getRow(rowcount);
		int cellcount=row.getLastCellNum();
		return cellcount;
	
	}	
	
	public String getCelldata(String Xlpath,String Sheet,int rownum,int colnum) throws IOException {
		fil=new FileInputStream(Xlpath);
		workbook=new XSSFWorkbook(fil);
		sheet=workbook.getSheet(Sheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData=formatter.formatCellValue(cell);
            return cellData;

	
	}catch(Exception e) {
		data="";
		}
		workbook.close();
		fil.close();
		return data;
		}
	}

		 