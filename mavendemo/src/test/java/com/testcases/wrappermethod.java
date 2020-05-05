package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class wrappermethod {
	
	WebDriver driver;
	
	public void insertapp(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	public void enterbyid(String locator,String value) {
		
		driver.findElement(By.id(locator)).sendKeys(value);
	}
	public void clickbyxpath(String locator1) throws InterruptedException {
		
		driver.findElement(By.xpath(locator1)).click();
		Thread.sleep(2000);
	}
	public void dropdown(String locator2,String value) {
		
		Select dropdown=new Select(driver.findElement(By.xpath(locator2)));
				dropdown.selectByVisibleText(value);
	}
	public void takescreenshot(String path) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));
	}
	
	public void closeapp() throws InterruptedException {
		Thread.sleep(3000);
		   driver.close();

	}
		
	}


