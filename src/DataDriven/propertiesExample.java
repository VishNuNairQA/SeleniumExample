package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class propertiesExample {
	
	
	@Test
	public void openWebsite() throws IOException{
		
		//Reading from properties file
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\vishn\\workspace\\Selenium\\dataDriven.properties");
		
		prop.load(fis);
		
		WebDriver driver = null;
		
		String browserName = prop.getProperty("browser");
		
		switch(browserName){
			case "chrome": ChromeOptions opt = new ChromeOptions();
			opt.addArguments("start-maximized");
			opt.addArguments("disable-notifications");
		
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver(opt);
			break;
			
			case "firefox": System.setProperty("webdriver.gecko.driver", "D:\\Selenium Library\\Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			
			case "ie": System.setProperty("webdriver.ie.driver", "D:\\Selenium Library\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
			default : System.out.println("No such browser driver");
			break;
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("src")).sendKeys(prop.getProperty("src"));
		
		driver.findElement(By.id("dest")).sendKeys(prop.getProperty("dst"));
	}

}
