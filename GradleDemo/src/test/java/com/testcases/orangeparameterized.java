package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class orangeparameterized {WebDriver driver;
@Test(dataProvider="Orangehrmlogin")
public void login(String username,String password) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
	Thread.sleep(3000);
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials",driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println("user able to login");}


@AfterMethod
public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
@DataProvider(name="Orangehrmlogin")
public Object[][] passData(){
	

Object[][] data=new Object[3][2];
data[0][0]="candy";
data[0][1]="abc1";
data[1][0]="taffy";
data[1][1]="zyx";
data[2][0]="tiny";
data[2][1]="abc3";
return data;

}
}

