package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class callwrapperorange {
	@Test
	public void orangehrm() throws InterruptedException, IOException {
		wrappermethod wm=new wrappermethod();
	wm.insertapp("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	wm.enterbyid("txtUsername", "Admin");
	wm.enterbyid("txtPassword", "admin123");
	wm.clickbyxpath("//*[@id='btnLogin']");
	wm.clickbyxpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
	wm.enterbyid("searchSystemUser_userName", "sravnthi");
	wm.dropdown("//*[@id=\"searchSystemUser_userType\"]", "Admin");
	wm.enterbyid("searchSystemUser_employeeName_empName", "edwin");
	wm.dropdown("//*[@id=\"searchSystemUser_status\"]", "Enabled");
	wm.clickbyxpath("//*[@id=\"searchBtn\"]");
	wm.takescreenshot("D:\\sreenshot\\orangehrm.png");
	wm.closeapp();
	

}
}
