package com.testcases;

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

public class ExcelLinked {
	@Test
	
		public void login() throws InterruptedException, IOException {
		//FileInputStream is a class reading data from excel
			FileInputStream file=new FileInputStream("C:\\Users\\edwin\\Downloads\\LinkedinExcelsheet1.xlsx");
			XSSFWorkbook Workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=Workbook.getSheet("Sheet1");//provide sheet name in the excelsheet("sheet1")
			//XSSFSheet sheet=Workbook.getSheet("0");//provide sheet index in the excelsheet("0")
			int count=sheet.getLastRowNum();//provide the count of rows in the excelsheet
			// count=sheet.getPhysicalNumberOfRows();//provide the count of rows
			System.out.println(count);
			for(int i=1;i<=count;i++) {
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(0);
				String un=cell.getStringCellValue();
				XSSFCell cell1=row.getCell(1);
				String pwd=cell1.getStringCellValue();
				System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver  driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("http://www.linkedin.com");
				 driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
				   Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='username']")).sendKeys(un);
				driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
				Thread.sleep(3000);
				driver.close();
				
			}
			
	}

}
