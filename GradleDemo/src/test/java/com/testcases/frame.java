package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag=driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		System.out.println("The droppable element is clicked");
		driver.close();
		
		
		
		
		
		
		
	}

}
