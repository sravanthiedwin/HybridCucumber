package com.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldownbyview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.discover.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//*[@id=\"main-content-rwd\"]/div[1]/section[1]/div[3]/div[3]/p[2]/a"));
		Object[] objArr = new Object[1];
		objArr[0] = element;
		js.executeScript("arguments[0].scrollIntoView();",objArr );// executeScript(,element );
	}

}
