package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//Id
	
		driver.findElement(By.id("email")).sendKeys("sravanthi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("candy");
		
		// Relative X path
		
		
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		//Absolute Xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
		//Name
		
		driver.findElement(By.name("firstname")).sendKeys("sravanthi");
		
		//linkText
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//PartiallinkText
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//Xpath with and condition
		driver.findElement(By.xpath("//*[@type='text' and @name='lastname']")).sendKeys("abcd");
		
		//Xpath with or condition
		
		driver.findElement(By.xpath("//*[@id='u_0_v' or @name='reg_email__']")).sendKeys("987654");
		
		
	}

}

