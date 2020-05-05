package com.testcases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class countLinksinpage {
	@Test
	public void count() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Testing");
		WebElement clickbutton=driver.findElement(By.name("btnK"));
		clickbutton.click();
		
		Thread.sleep(3000);
		List<WebElement>links =driver.findElements(By.tagName("a"));
		System.out.println("The count of links :"+links.size());
		
		/*for(WebElement a:links) {
			
			System.out.println(a.getAttribute("href"));//to provide the links list
		}
		*/
		
	}

}
