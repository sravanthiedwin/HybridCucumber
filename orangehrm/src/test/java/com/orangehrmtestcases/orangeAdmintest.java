package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.orangehrmpages.orangeAdmin;
import com.orangehrmpages.orangelogin;

public class orangeAdmintest extends Library {
	@BeforeMethod
	public void openbrowser() throws IOException {
		launchApplication();
		orangelogin launch =new orangelogin(driver);
		launch.login("Admin","admin123");
	}
	//@Test(priority=1)
	public void Admin() {
		orangeAdmin adminp=new orangeAdmin(driver);
		adminp.clickAdmin();
		adminp.typeusername("edwin");
		adminp.selectuserrole("Admin");
		adminp.typeemployeename("sravanthi");
		adminp.selectstatus("Enabled");
		adminp.clicksearchbutton();
	}
	@Test(priority=2)
	public void Add() {
		orangeAdmin admin=new orangeAdmin(driver);
		admin.clickAdmin();
		admin.addbutton();
		admin.selectuserrole("ESS");
		admin.typeusernamepwd("Daiwik","eric","abcd1","xyz");
		admin.selectstatus1("Enabled");
		
	}
	@Test(priority=3)
	public void adminqualification() {
		orangeAdmin admin=new orangeAdmin(driver);
		admin.cAdmin();
		
	}
	
	@AfterMethod()
	public void teardown() throws IOException {
		screenshot("src/test/resources/Screenshots/orangeadmin.png");
		quit();
		
	}

}
