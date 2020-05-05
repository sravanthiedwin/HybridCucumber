package com.orangehrmtestcases;
/*1.how to get Test data from excel sheet
 * a.create a function to get row count
 * b.create Function to get column count
 * c.create a function to get string cell data and
 * d. create a fn to get numeric cell data
2.How to create excel dataprovider function
3.how to use Testng @Dataprovider
4.how to refer test data from data provider*/

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.excelutility.excelutil;
import com.orangehrmpages.orangelogin;

public class orangedataproviderlogin extends Library {
	@BeforeMethod
	public void statup() throws IOException {
		launchApplication();
		
	}
	@Test(dataProvider="logindata")
	public void login(String u,String p) throws IOException {
		orangelogin ol=new orangelogin(driver);
		excelutil util=new excelutil();
		
		ol.login(util.excel_username(2),util.excel_password(2));
	}
	@DataProvider(name="logindata")
public Object[] [] passdata(String u,String p) {
		Object[][] data=new Object[2][2];
		return data;
		
	}
		
	}

