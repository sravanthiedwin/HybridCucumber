package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass1.Library;
import com.excelutility.excelutil;
import com.orangehrmpages.orangelogin;

public class orangeloginexceltest1 {
	public class orangeExcellogintestcase extends Library{
		
		@BeforeMethod
		public void startup() throws IOException  {
			launchApplication();
		}
		@Test(dataProvider="orangehrm")
		public void OrangeHRMLogin(String username,String pword) throws IOException 
	 	{
			orangelogin ol=new orangelogin(driver);
			ol.login(username, pword);
		}
		
		@DataProvider(name="orangehrm")
		  public  Object[][] passData() throws IOException{
			
	
			excelutil util =  new excelutil();
			
			  int rowcount = util.getRowCount("C:\\Users\\edwin\\eclipse-workspace1\\orangehrm\\src\\test\\resources\\Test Data\\orangeloginexcel.xlsx","sheet1");
			  int CellCnt = util.getcellcount("C:\\Users\\edwin\\eclipse-workspace1\\orangehrm\\src\\test\\resources\\Test Data\\orangeloginexcel.xlsx","sheet1",1);
			  
			  Object[][] data = new Object[rowcount][CellCnt];
			  for(int i=1;i<=rowcount;i++) 
				{				  
				  for(int j=0;j<CellCnt;j++) {
					  data[i-1][j] =util.getCelldata("C:\\Users\\edwin\\eclipse-workspace1\\orangehrm\\src\\test\\resources\\Test Data\\orangeloginexcel.xlsx","sheet1", i, j);
					  
				 }
				}
		 
			  return data;
			  }
		@AfterMethod
		public void close() {
			quit();
		}
	}


}
