package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.orangehrmpages.orangelogin;




public class dataproviderpomrangelogin extends Library{
@BeforeMethod
public void statup() throws IOException {
	launchApplication();
}
@Test(dataProvider="login")
public void login(String u,String p) {
	orangelogin lo=new orangelogin(driver);
	lo.login(u, p);
	
	
}
@DataProvider(name="login")
public Object[][] passdata() {
	Object[][] data=new Object[3][2];
	data[0][0]="candy";
	data[0][1]="abc1";
	data[1][0]="taffy";
	data[1][1]="zyx";
	data[2][0]="tiny";
	data[2][1]="abc3";
	return data;
	}
@AfterMethod
public void teardown() {
	quit();
}
}
