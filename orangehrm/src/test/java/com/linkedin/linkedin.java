package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkedin {
	WebDriver driver;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement pwd;
	
	public  linkedin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void loginmethod(String name,String pass) {
		username.sendKeys(name);
		pwd.sendKeys(pass);
		
	}
	

}
