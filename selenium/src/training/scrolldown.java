package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.discover.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//this is to scroll down
		 js.executeScript("window.scrollBy(0,4000)");
		 Thread.sleep(9000);
		 //this is to scroll up
		 js.executeScript("window.scrollBy(0,-4000)");
	}

}
