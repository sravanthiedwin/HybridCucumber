package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.orangehrmlogin;
import com.seleniumutils.sellutils;

public class orangetest extends Library {

	 sellutils util;
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	@Test
	public void loginpage() {
		orangehrmlogin hrm= new orangehrmlogin(driver);
		hrm.login("Admin", "admin123");
		
	}
	@AfterClass
	public void close() throws IOException {
		util=new sellutils(driver); 
		util.getTitle();
		util.to_take_screenshot("src/test/resources/screenshots/orangehrm1.png");
		util.quit();
		


		
	}
	
}
	


