package com.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkedinTest {
	WebDriver driver = null;
	
	@BeforeMethod
	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		Thread.sleep(5000);
	}
	@Test
	public void testcase() throws InterruptedException, IOException {
		
		
   driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
   Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sravanthi");
driver.findElement(By.xpath("//*[@id='password']")).sendKeys("amar");
Thread.sleep(2000);
TakesScreenshot ts =(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source,new File("D:\\sreenshot\\linkedin.png"));

driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
System.out.println(driver.getTitle());
		
	}
	  @AfterMethod()
	public void closebrowser() {
		driver.close();
		
	}

}
