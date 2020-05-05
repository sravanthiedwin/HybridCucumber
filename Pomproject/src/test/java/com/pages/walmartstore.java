package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class walmartstore {
	WebDriver driver;
	By store=By.xpath("//*[@id=\"header-location-toggle\"]/span/span/span[2]");
	By local=By.xpath("//*[@id=\"vh-location-menu-root\"]/div[2]/div[2]/a[1]/div/span/div");
	By makes=By.xpath("//*[@id=\"content\"]/div[2]/section[1]/div/div[2]/div/div/div[1]/div/div[4]/div[1]/button");
	By weeklyad=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[3]/a");
	public walmartstore(WebDriver driver) {
		this.driver=driver;
		
	}
	public void stores() {
		driver.findElement(store).click();
	}
	public void lstore() {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(local)).click().build().perform();
		
	}
	public void mstore() {
		driver.findElement(makes).click();
	}
	public void weekly() throws InterruptedException {
		driver.findElement(weeklyad).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(9000);
		
		
	}
	
		
	

}
