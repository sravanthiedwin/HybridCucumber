package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Walmartpage {
	WebDriver driver;
	By account=By.xpath("//*[@id=\"header-account-toggle\"]/span/span/span[2]");
	By createacc=By.xpath("//*[@id=\"signed-out\"]/a[4]/div/span/div");
	By firstn=By.name("firstName");
	By lastn=By.name("lastName");
	By email=By.xpath("//*[@id=\"email-su\"]");
	By pass=By.xpath("//*[@id=\"password-su\"]");
	
	
	
	public Walmartpage(WebDriver driver) {
		this.driver=driver;
	}
	public void accoun() {
		driver.findElement(account).click();
	}
	public void createaccount() {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(createacc)).click().build().perform();
		
	}
	public void name(String n) {
		driver.findElement(firstn).sendKeys(n);
	}
	
	public void lname(String l) {
		driver.findElement(lastn).sendKeys(l);
	}
	public void e(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	public void pwd(String p) {
		driver.findElement(pass).sendKeys(p);
	}
	
	

}
