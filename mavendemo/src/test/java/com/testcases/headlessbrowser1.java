package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessbrowser1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println("The Title of the page is:"+driver.getTitle());
      

	}

}
