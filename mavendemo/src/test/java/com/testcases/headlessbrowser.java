package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/*DownLoaded jar and dependency jar from: 
https://github.com/SeleniumHQ/htmlunit-driver/releases
It will not open the browser,so it is fastest and its platform Independent.
*/public class headlessbrowser {

	public static void main(String[] args) {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println("The Title of the page is:"+driver.getTitle());
        driver.close();
	}

}
