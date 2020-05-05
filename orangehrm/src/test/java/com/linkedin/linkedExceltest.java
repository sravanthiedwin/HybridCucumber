package com.linkedin;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass1.Library;

import com.excelutility.excelutil;


public class linkedExceltest extends Library {
	@BeforeMethod
	public void launchbrowser() throws IOException {
		launchApplication();
		
		
	}
	@Test
	public void logintest() throws IOException {
		linkedin ln=new linkedin(driver);
		excelutil util=new excelutil();
		ln.loginmethod(util.excel_username(2),util.excel_password(2));
	
	}
	@AfterMethod
	public void teardown() {
		quit();
		
	}
}
