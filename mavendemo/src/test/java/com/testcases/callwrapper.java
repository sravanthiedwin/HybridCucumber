package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class callwrapper {
	@Test
	public void facebooklogin() throws IOException, InterruptedException {
		wrappermethod wm=new wrappermethod();
		wm.insertapp("https://www.facebook.com/");
		wm.enterbyid("email", "sravanthi");
		wm.enterbyid("pass", "abc");
		wm.clickbyxpath("//*[@id='u_0_b']");
		wm.takescreenshot("D:\\sreenshot\\facebook.png");
		wm.closeapp();
		
	}
	

}
