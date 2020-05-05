package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.orangehrmpages.orangelogin;


public class orangetest extends Library {
	@BeforeMethod
	public void openbrowser() throws IOException {
		launchApplication();
		
	}
@Test(priority=1)
public void logintest()  {
	orangelogin login=new orangelogin(driver);
	
	
	login.login("Admin", "admin123");
	
	
	
	
}
@Test(priority=2)
public void checkinglinks() throws InterruptedException {
	orangelogin login=new orangelogin(driver);
	
	login.linkforgotpwddisplayed();
	
	
	
}
@AfterMethod
public void teardown() {
	quit();
}


}
