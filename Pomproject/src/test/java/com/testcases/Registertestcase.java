package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Facebookregister;

public class Registertestcase extends Library {
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://facebook.com");
		
	}
	@Test
	public void signup() {
		Facebookregister regpage=new Facebookregister(driver);
		regpage.fname("eric");
		regpage.lname("Daiwik");
		regpage.mno("12345");
		regpage.newpwd("candy");
		regpage.birthday("Jun", 10, "2020");
		regpage.genderselection("male");
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src/test/resources/screenshots/facebookreg.png");
		quit();
		
	}


}
