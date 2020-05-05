package com.orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangerecuritement {
	WebDriver driver;
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recuritementbutton;
	@FindBy(id="candidateSearch_jobTitle")
	WebElement Jobtitle;
	@FindBy(id="candidateSearch_jobVacancy")
	WebElement vacancy;
	@FindBy(id="candidateSearch_hiringManager")
	WebElement Hirirngmanager;
	@FindBy(id="candidateSearch_status")
	WebElement status;
	@FindBy(id="candidateSearch_candidateName")
	WebElement candidateName;
	@FindBy(id="candidateSearch_fromDate")
	WebElement fromdate;
	@FindBy(id="candidateSearch_toDate")
	WebElement todate;
	@FindBy(id="candidateSearch_keywords")
	WebElement keywords;
	@FindBy(id="candidateSearch_modeOfApplication")
	WebElement methodofapplictaion;
	@FindBy(id="btnSrch")
	WebElement search;
	public orangerecuritement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickrecuritment() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(recuritementbutton));
		
		recuritementbutton.click();
	}
	public void selectjob(String text) {
		Select Job=new Select(Jobtitle);
		Job.selectByVisibleText(text);
	}
	public void selectvacancy(String v) {
		Select vacancys=new Select(vacancy);
		vacancys.selectByVisibleText(v);
		
	}
	public void selecthiringmanager(String h) {
		Select manager=new Select(Hirirngmanager);
		manager.selectByVisibleText(h);
		
	}
	public void selectstatus(String s) {
		Select stat=new Select(status);
		stat.selectByVisibleText(s);
		
	}
	public void typename(String n) {
		candidateName.sendKeys(n);
	}
	public void selectreturndate(String fromd) {
		 fromdate.clear();
		 fromdate.sendKeys(fromd);
		
	}
	public void selecttodate(String tod) {
		 todate.clear();
		 todate.sendKeys(tod);
		
	}
	public void typekeyword(String n) {
		keywords.sendKeys(n);
	}
	public void selectmethodofapplication(String m) {
		Select method=new Select(methodofapplictaion);
		method.selectByVisibleText(m);
		
		
	}
	public void clicksearch() {
		search.click();
	}

}
