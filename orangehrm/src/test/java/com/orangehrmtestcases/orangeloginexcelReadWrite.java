package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.excelutility.ExcelReadWrite;

import com.orangehrmpages.orangelogin;

public class orangeloginexcelReadWrite extends Library{
	@BeforeMethod
	public void statup() throws IOException {
		launchApplication();
		
	}


@Test(dataProvider="orangehrm")
	public void OrangeHRMLogin(String u,String p)  {
		orangelogin ohrm = new orangelogin(driver);
		ohrm.login(u, p);
		
	}
	@DataProvider(name="orangehrm")
	public Object[][] passData() throws IOException{
		ExcelReadWrite  read = new ExcelReadWrite();
		Object[][] data = read.ReadData("C:\\Users\\edwin\\eclipse-workspace1\\orangehrm\\src\\test\\resources\\Test Data\\readwriteorangeExcel.xlsx", "Sheet1");
		return data;}
	
	@AfterMethod
	public void teardown() {
		quit();
	}

}
