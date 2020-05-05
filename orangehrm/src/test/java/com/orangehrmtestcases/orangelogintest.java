package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.excelutility.excelutil;
import com.orangehrmpages.orangelogin;

public class orangelogintest extends Library {
	
	@BeforeClass
	public void openbrowser() throws IOException {
		launchApplication();
		
	}
@Test
public void logintest() throws IOException {
	orangelogin login1=new orangelogin(driver);
	excelutil util=new excelutil();
	
	login1.login(util.excel_username(1),util.excel_password(1));
}
@AfterClass
public void close() throws IOException {
	
	screenshot("src/test/resources/Screenshots/orangelogin.png");
	
	quit();
}
}
