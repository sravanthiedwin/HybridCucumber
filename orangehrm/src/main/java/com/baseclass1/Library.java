package com.baseclass1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Library {
	protected WebDriver driver;
	public static Properties prop;
	public void launchApplication() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\edwin\\eclipse-workspace1\\orangehrm\\src\\test\\resources\\configurationproperty\\config.property");
		prop=new Properties();
		prop.load(file);
		String browser=prop.getProperty("browser");
		try {
			if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\edwin\\Downloads\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			}else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
				 driver=new ChromeDriver();
				  
			}else if(browser.equalsIgnoreCase(("IE"))){
				System.setProperty("webdriver.ie.driver","C:\\Users\\edwin\\Downloads\\selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
				 driver=new InternetExplorerDriver();
			}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}catch(WebDriverException e) {
		System.out.println("browser could not be launched");
	}
		
	}
		
		public void screenshot(String path) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File(path));
		}
		public void getTitle() {
			
			System.out.println(driver.getTitle());
			
		}
		public void dropdown( String locator) {
			Select s=new Select(driver.findElement(By.xpath(locator)));
		}

		public void quit() {
			driver.close();
			
		}

}


