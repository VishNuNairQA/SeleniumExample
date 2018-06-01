package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class browserMethods {
	
	public WebDriver driver;
	
	public void openBrowser(String browserName){
		
		switch(browserName){
			
		case "chrome": 
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("start-maximized");
			opt.addArguments("disable-notifications");
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver(opt);
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Library\\Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		case "ie":
			DesiredCapabilities dc= DesiredCapabilities.internetExplorer();
			dc.setCapability("allow-blocked-content", true);
			
			System.setProperty("webdriver.ie.driver", "D:\\Selenium Library\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(dc);
			break;

		default:
			System.out.println("Driver not found");
			break;
		
			
		}
		
	}

}
