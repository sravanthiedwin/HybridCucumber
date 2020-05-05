package com.excelutility;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	 XSSFRow row;
   
	
	public Object[][] ReadData(String excelPath, String sheetName) throws IOException {
	     
	     File src=new File(excelPath);
	     FileInputStream finput = new FileInputStream(src);
	     workbook = new XSSFWorkbook(finput);
	     sheet= workbook.getSheet(sheetName);
	     int rowcount = sheet.getLastRowNum();//it gets the no of rows
	    // System.out.println("The number of rows in the sheet :"+rowcount);
	     row = sheet.getRow(rowcount);
		 int cellcount = row.getLastCellNum();//it gets no .of columns in the excelsheet
		 //System.out.println("The number of columns used in the sheet :"+cellcount);
		
		
		
		 Object[][] data = new Object[rowcount][cellcount] ;
	    	    
	     for(int i=1; i<=rowcount ; i++)
	     {
	    	 for( int j =0 ;j<cellcount ;j++)
	         { 
	    		 
	    		 cell = sheet.getRow(i).getCell(0);
	             //cell.setCellType(CellType.STRING);
	             data[i-1][j] = cell.getStringCellValue();
	                    
	         
	             cell = sheet.getRow(i).getCell(1);
	             cell.setCellType(CellType.STRING);
	             data[i-1][j] = cell.getStringCellValue();        
	                  
	          
	             // Write data in the excel.
	             FileOutputStream foutput=new FileOutputStream(src);	         
	             	// Specify the message needs to be written.
	             String message = "Data Imported Successfully";	         
	             // Create cell where data needs to be written.
	             sheet.getRow(i).createCell(2).setCellValue(message);
	          
	              workbook.write(foutput);
	              foutput.close();	               
	    	 }     
	     }
	    
	   return data;
	 } 
	}
	


