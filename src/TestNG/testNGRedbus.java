package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testNGRedbus {
	
	@Test
	public void redOpen(){
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.redbus.in/");
	}

}
