package com.testcases;
//download Apache poi download 
//https://ftp.wayne.edu/apache/poi/release/bin/poi-bin-4.1.2-20200217.zip 

//FileInputStream is used to read data and it is class 
//XSSFWorkbook,XSSFSheet,XSSFRow ,XSSFCell are classes which contains methods to interact with the excel data.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Excelfacebooklogin {
	@Test
	public void login() throws InterruptedException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\edwin\\Downloads\\facebookExcelsheet.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=Workbook.getSheet("Sheet1");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		for(int i=1;i<=count;i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String un=cell.getStringCellValue();//to get string value from cell 
			//boolean un=cell.getBooleanCellValue();//to get boolean cell value
			//int un=cell.getNumericCellValue();//to get numeric cell value
			XSSFCell cell1=row.getCell(1);
			String pwd=cell1.getStringCellValue();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys(un);
			driver.findElement(By.name("pass")).sendKeys(pwd);
			Thread.sleep(3000);
			driver.close();
			
		}
		
	}

}
