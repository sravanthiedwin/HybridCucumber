package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class callwrapper {
	@Test
	public void linkedincallwrapper() throws IOException, InterruptedException {
		wrapper wm=new wrapper();
		
		wm.Excelcode("https://linkedin.com");
		wm.takescreenshot("D:\\sreenshot\\Excel.png");
		wm.closeapp();
		
				
								
		
	}

}
