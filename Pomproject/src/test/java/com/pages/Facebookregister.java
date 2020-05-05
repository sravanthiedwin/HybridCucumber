package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookregister {
	WebDriver driver;
	By firstname=By.name("firstname");
	By lastname=By.name("lastname");
	By mobileno=By.id("u_0_r");
	By newpassword=By.id("u_0_w");
	By month=By.id("month");
	By day=By.id("day");
	By year=By.id("year");
	By male=By.id("u_0_6");
	By female=By.id("u_0_7");
	public Facebookregister(WebDriver driver) {
		this.driver=driver;
	}
	public void fname(String name) {
		driver.findElement(firstname).sendKeys(name);
	}
	public void lname(String surname) {
		driver.findElement(lastname).sendKeys(surname);
	}
	public void mno(String mobile) {
		driver.findElement(mobileno).sendKeys(mobile);
	}
	public void newpwd(String pass) {
		driver.findElement(newpassword).sendKeys(pass);
	}
	
	
	
	public void birthday(String mont,int da,String yea) {
		
	
	Select m=new Select(driver.findElement(month));
	m.selectByVisibleText(mont);
	
	//SelectByIndex
	Select d=new Select(driver.findElement(day));
	d.selectByIndex(da);
	
	//SelectByValue
	Select y=new Select(driver.findElement(year));
	y.selectByValue(yea);
	
	
	}
	public void genderselection(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			driver.findElement(male).click();
			
		}else if(gender.equalsIgnoreCase("Female")) {
			driver.findElement(female).click();
		}
		
	}

}
