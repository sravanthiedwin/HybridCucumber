package com.orangehrmtestcases;



import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.orangehrmpages.orangelogin;
import com.orangehrmpages.orangerecuritement;

public class orangeRecuritementtest extends Library {
	@BeforeMethod
	public void openbrowser() throws IOException {
		launchApplication();
		orangelogin login1=new orangelogin(driver);
		login1.login("Admin", "admin123");
	}
@Test
public void recruite() {
	orangerecuritement r=new orangerecuritement(driver);
	r.clickrecuritment();;
	r.selectjob("CEO");
	r.selectvacancy("All");
	r.selecthiringmanager("All");
	r.selectstatus("Hired");
	r.typename("candy");
	r.selectreturndate("2016-09-10");
	r.selecttodate("2020-02-28");
	r.typekeyword("Taffy");
	r.selectmethodofapplication("Online");
	r.clicksearch();
}
@AfterMethod
public void teardown()  {
	quit();
	
}
}
