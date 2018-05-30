package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class reusableMethods {
	
	public WebDriver driver;
	
	public void initiateBrowser(String browserName){
		
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
	}

}
