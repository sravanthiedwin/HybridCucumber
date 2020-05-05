package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebooklogin {
	WebDriver driver;
	By username=By.id("email");
	By password=By.id("pass");
	By loginbutton=By.xpath("//*[@id=\"loginbutton\"]");
	
	public Facebooklogin(WebDriver driver) {
		this.driver=driver;
		
	}
	public void loginToApp_username(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void loginToApp_loginbutton() {
		driver.findElement(loginbutton).click();
	}
}
