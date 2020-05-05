package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class forebs {
	WebDriver driver;
	
	@BeforeMethod()
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.forbes.com/");
	}
		
		@Test(priority=1)
		
		public void firstpage() throws IOException {
			//To get Title of the page 
		String title=driver.getTitle();
		Assert.assertEquals(title, "Forbes");
		System.out.println("The title of the page:"+driver.getTitle());
		//To get on breaking element is Displayed on the page
		WebElement brakelink= driver.findElement(By.xpath("//*[@id=\"row-0\"]/div[1]/div[1]/h3/a"));
		System.out.println("The first element is displayes:"+brakelink.isDisplayed());
		WebElement useditionbutton= driver.findElement(By.xpath("//*[@id=\"row-0\"]/div[1]/div[2]/button"));
		System.out.println("The second element is displayes:"+useditionbutton.isDisplayed());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("D:\\sreenshot\\forbes.png"));
		
		}
		@Test(priority=2) 
		public void bill() throws IOException, InterruptedException {
			WebElement Billionaires=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[1]/a"));
			Billionaires.click();
			 String bill=driver.getTitle();
			System.out.println("The title of the billionares page is:"+driver.getTitle());
			Assert.assertEquals(bill, "Worlds Billionaires");
			Thread.sleep(3000);
			WebElement ad=driver.findElement(By.className("show-label"));
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("D:\\sreenshot\\bill.png"));
			

					
											
				}
		@Test(priority=3)
		public void advisor() throws IOException {
			WebElement adv=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[9]/a"));
						adv.click();
						String advi=driver.getTitle();
						System.out.println("The title of the billionares page is:"+driver.getTitle());
						WebElement adviDiscoluser=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]"));
						System.out.println("The advertise disclosure is dispalyed:"+adviDiscoluser.isDisplayed());
						Assert.assertEquals(advi, "Forbes Advisor");
						TakesScreenshot ts=(TakesScreenshot)driver;
						File source=ts.getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(source,new File("D:\\sreenshot\\advisor1.png"));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("window.scrollBy(0,500)");
						WebElement advisornow=driver.findElement(By.xpath("/html/body/div[1]/div[4]/h2/span"));
						String advcolor=advisornow.getCssValue("color");// to provide color 
						System.out.println("The color of advisor is:"+advcolor);//#395bb6;
						
						String hexcolor = Color.fromString(advcolor).asHex(); //converted Into HexFormat
						System.out.println("The Hexformat of the advcolor is:"+hexcolor);// Output of Hex code will be
						Assert.assertEquals(hexcolor, "#395bb6");
						
						String fsize=advisornow.getCssValue("font-size");// to provide fontsize 
						System.out.println("The font size of advisor is:"+fsize);
						System.out.println("The advisor link is dispalyed:"+advisornow.isDisplayed());
						
						
		}
		@Test(priority=4)
		public void search() throws InterruptedException, IOException {
			WebElement s=driver.findElement(By.xpath("//button[@class='icon--search']"));
			s.click();
			System.out.println("The title of the search is :"+driver.getTitle());
			WebElement searchtext=driver.findElement(By.className("search-modal__input"));
			searchtext.sendKeys("Apple");
			Thread.sleep(3000);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("D:\\sreenshot\\searchbox.png"));
			WebElement searchbutton=driver.findElement(By.className("search-modal__submit"));
			searchbutton.click();
			Thread.sleep(2000);
			WebElement appletext=driver.findElement(By.className("search-results__entity-name"));
			String apple =appletext.getText();
			System.out.println("The text in the page is:"+apple);
			Assert.assertEquals(apple, "Apple");
			
			
		
		}
		
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
