package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Walmartpage;

public class walmarttest extends Library {
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://walmart.com");
		
	}
	@Test
	public void walmartfront() {
		Walmartpage wp=new Walmartpage(driver);
		wp.accoun();
		wp.createaccount();
		wp.name("edwin");
		wp.lname("amar");
		wp.e("sravanthie@gmail.com");
		wp.pwd("abc123456");
		
	}
	public void  close() throws IOException {
		screenshot("src/test/resources/screenshots/walmart.png");
		quit();
		
	}
	

}
