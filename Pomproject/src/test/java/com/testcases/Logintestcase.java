package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Facebooklogin;

public class Logintestcase extends Library {
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://facebook.com");
		
	}
	@Test
	public void login() {
		Facebooklogin lpage=new Facebooklogin(driver);
		lpage.loginToApp_username("sravanthi");
		lpage.loginToApp_password("abcz1");
		lpage.loginToApp_loginbutton();
		
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src/test/resources/screenshots/facebook.png");
		quit();
		
	}

}
