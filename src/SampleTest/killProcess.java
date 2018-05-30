package SampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

public class killProcess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Kill Process
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WindowsUtils.killByName("excel.exe");
		
		
		//Take Screenshot
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\sample.png"));
		
		//Delete Cookies
		
		driver.manage().deleteAllCookies();

	}

}
