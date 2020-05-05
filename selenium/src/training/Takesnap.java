package training;
//for Takescreenshot we need to add common.io jars 
//goto google type Fileutils jar
//click on the first link which shows 
//Commons IO – Download Apache Commons IO
//download the common.io.2.6.bin jar and add that jars to the program

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takesnap {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edwin\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("The Title of the page is:"+driver.getTitle());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("D:\\sreenshot\\google.png"));
        driver.close();
	}

}
