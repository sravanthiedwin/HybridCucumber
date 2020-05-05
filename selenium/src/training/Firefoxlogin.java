package training;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\edwin\\Downloads\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("The Title of the page is:"+driver.getTitle());
        driver.close();
	}

}
