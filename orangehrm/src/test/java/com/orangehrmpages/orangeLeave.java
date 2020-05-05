package com.orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class orangeLeave {
	WebDriver driver;
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;
	@FindBy(id="calFromDate")
	WebElement fromdate;
	@FindBy(id="calToDate")
	WebElement todate;
	@FindBy(id="leaveList_chkSearchFilter_2")
	WebElement scheduled;
	@FindBy(id="leaveList_chkSearchFilter_3")
	WebElement taken;
	@FindBy(id="leaveList_txtEmployee_empName")
	WebElement ename;
	@FindBy(id="leaveList_cmbSubunit")
	WebElement subunit;
	@FindBy(id="btnSearch")
	WebElement search;
	public orangeLeave(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickleaveFromToDate(String fromd,String tod) {
		
		leave.click();
		fromdate.clear();
		fromdate.sendKeys(fromd);
		todate.clear();
		todate.sendKeys(tod);
		
	}
	public void typeemployeename(String text) {
		ename.sendKeys(text);
	}
	public void checkboxScheduled() {
		if(scheduled.isSelected()) {
			System.out.println("The checkbox scheduled is selected:"+scheduled.isSelected());
			
		}else if(!scheduled.isSelected()){
			scheduled.click();
			
		}
	}
	public void checkboxTaken() {
		if(taken.isSelected()) {
			System.out.println("The checkbox taken is selected:"+taken.isSelected());
			
		}else if(!taken.isSelected()){
			taken.click();
		}
	}
	public void selectsubunit(String t) {
		Select s=new  Select(subunit);
		s.selectByVisibleText(t);
	}
	public void searchbutton() {
		search.click();
	}
	

}
