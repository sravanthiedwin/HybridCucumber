package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wrapper {
	
	WebDriver driver;
	public void openbrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	public void clickbyxpath(String locactor) {
		driver.findElement(By.xpath(locactor)).click();
		
	}
	public void enterbyid(String locator1,String value) {
		driver.findElement(By.id(locator1)).sendKeys(value);
	}
		
public void Excelcode(String url) throws IOException, InterruptedException {
	FileInputStream file=new FileInputStream("C:\\Users\\edwin\\Downloads\\LinkedinExcelsheet1.xlsx");
	XSSFWorkbook Workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=Workbook.getSheet("Sheet1");
	int count=sheet.getLastRowNum();//To provide no of rows
	System.out.println(count);
	for(int i=1;i<=count;i++) {
		XSSFRow row=sheet.getRow(i);
		XSSFCell cell=row.getCell(0);
		String un=cell.getStringCellValue();
		XSSFCell cell1=row.getCell(1);
		String pwd=cell1.getStringCellValue();
		openbrowser(url);
		clickbyxpath("/html/body/nav/a[3]");
		Thread.sleep(3000);
		enterbyid("username",un);
		enterbyid("password",pwd);
		
	}}
public void takescreenshot(String path) throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source,new File(path));
}

public void closeapp() throws InterruptedException {
	Thread.sleep(3000);
	
	driver.close();
}
	
}
