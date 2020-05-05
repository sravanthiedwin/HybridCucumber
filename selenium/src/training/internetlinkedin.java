package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetlinkedin {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\edwin\\Downloads\\selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		
		//driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,3400)");
    driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/pub/dir/+/+?trk=homepage-basic_people-cta']")).click();
driver.findElement(By.xpath("//*[@name='firstName' and @placeholder='First Name']")).sendKeys("sravanthi");
driver.findElement(By.xpath("//*[@name='lastName' and @placeholder='Last Name']")).sendKeys("amar");
driver.findElement(By.xpath("//button[@class='base-search-bar__submit-btn' and @type='submit']")).click();
System.out.println(driver.getTitle());
	}

}
