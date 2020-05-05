package com.orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.excelutility.excelutil;

public class orangelogin {
WebDriver driver;
@FindBy(id="txtUsername")
WebElement username;
@FindBy(id="txtPassword")
WebElement pwd;
@FindBy(className="button")
WebElement Loginbutton;
@FindBy(linkText="Forgot your password?")
WebElement forgotpassword;
@FindBy(id="divLogo")
WebElement logo;

public orangelogin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void login(String u,String p) {
	
	
	username.sendKeys(u);
	pwd.sendKeys(p);
	Loginbutton.click();
	
}
public void linkforgotpwddisplayed() throws InterruptedException {
	forgotpassword.isDisplayed();
	Thread.sleep(3000);
	logo.isDisplayed();
	System.out.println("The orangehrm logo is dispalyed");
	
}



}
