package training;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9849858820");
		
		//keyboard actions
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("Edwin@123").perform();
		action.sendKeys(Keys.RETURN).perform();
		Thread.sleep(3000);
		
		//searching the t-shirt
		//driver.findElement(By.name("q")).sendKeys("tshirt");
		driver.findElement(By.name("q")).sendKeys("tshirt" +Keys.ENTER);
		//driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		//mouseMoving actions
		WebElement image=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img"));
		action.moveToElement(image).click().build().perform();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//Screenshot 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("D:\\sreenshot\\tshirt.png"));
       
	}
	}
		
		