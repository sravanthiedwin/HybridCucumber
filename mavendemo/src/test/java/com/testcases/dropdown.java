package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//selectByVisibleText
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		
		//SelectByIndex
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(10);
		
		//SelectByValue
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("2020");
		
	}

}
