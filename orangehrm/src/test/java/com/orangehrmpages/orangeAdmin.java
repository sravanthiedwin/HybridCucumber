package com.orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangeAdmin {
	WebDriver driver;
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	@FindBy (id="searchSystemUser_userName")
	WebElement username;
	@FindBy(xpath="//*[@id=\"searchSystemUser_userType\"]")
	WebElement userrole;
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement employee;
	@FindBy(xpath="//*[@id=\"searchSystemUser_status\"]")
	WebElement status;
	@FindBy(id="searchBtn")
	WebElement search;
	@FindBy(id="btnAdd")
	WebElement add;
	@FindBy(id="systemUser_userType")
	WebElement usertype;
	@FindBy(id="systemUser_employeeName_empName")
	WebElement ename;
	@FindBy(id="systemUser_userName")
	WebElement uname;
	@FindBy(id="systemUser_status")
	WebElement systemstatus;
	@FindBy(id="systemUser_password")
	WebElement pwd;
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmpwd;
	@FindBy(id="btnSave")
	WebElement save;
	@FindBy(id="menu_admin_Qualifications")
	WebElement qualification;
	@FindBy(id="menu_admin_viewEducation")
	WebElement education;
	public void cAdmin() {
		admin.click();
		Actions action=new Actions(driver);
		action.moveToElement(qualification).click().build().perform();
		System.out.println("The qualification is clicked");
		action.moveToElement(education).click().build().perform();
		System.out.println("Education is clicked");
	}
	


public orangeAdmin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void clickAdmin() {
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(admin));
	admin.click();
}
public void typeusername(String n) {
	username.sendKeys(n);
}
public void selectuserrole(String role) {
	
	Select urole=new Select(userrole);
	urole.selectByVisibleText(role);
}
public void typeemployeename(String en) {
	employee.sendKeys(en);
}
public void selectstatus(String text) {
	Select s=new Select(status);
	s.selectByVisibleText(text);
	
}
public void clicksearchbutton() {
	search.click();
}
public void addbutton() {
	add.click();
}
public void userrole(String u) {
	Select role=new Select (usertype);
	role.selectByVisibleText(u);
}
public void selectstatus1(String status) {
	Select s =new Select(systemstatus);
	s.selectByVisibleText(status);
}

public void typeusernamepwd(String en,String un,String p,String cp) {
	ename.sendKeys(en);
	uname.sendKeys(un);
	pwd.sendKeys(p);
	confirmpwd.sendKeys(cp);
	save.click();
	
}

}