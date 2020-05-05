package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.orangehrmpages.orangeLeave;
import com.orangehrmpages.orangelogin;

public class orangeLeavetest extends Library{
	@BeforeMethod
	public void openbrowser() throws IOException {
		launchApplication();
		orangelogin login=new orangelogin(driver);
		login.login("Admin","admin123");
		
	}
@Test(priority=1)
public void logintest()  {
	orangeLeave lo=new orangeLeave(driver);
	lo.clickleaveFromToDate("2020-07-06","2020-08-08");
	
	lo.checkboxScheduled();
	lo.checkboxTaken();
	lo.typeemployeename("edwin");
	lo.selectsubunit("IT");
	//lo.searchbutton();
	
	

}
@AfterMethod
public void teardown() throws IOException {
	screenshot("src/test/resources/Screenshots/leave1.png");
	quit();
}
}