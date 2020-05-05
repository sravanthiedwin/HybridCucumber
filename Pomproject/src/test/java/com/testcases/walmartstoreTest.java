package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.walmartstore;

public class walmartstoreTest extends Library {
	@BeforeClass
	public void stratUp() {
		launchApplication("chrome","https://walmart.com");
		
	}
	@Test
	public void stores() throws IOException, InterruptedException {
		walmartstore wstore=new walmartstore(driver);
		wstore.stores();
		wstore.lstore();
		screenshot("src/test/resources/screenshots/walmart.png");
		wstore.mstore();
		wstore.weekly();
	}
	@AfterClass
	public void close() throws IOException {
		
		quit();
		
	}
}
