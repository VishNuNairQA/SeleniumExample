package SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class httpCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome Capabilites
		
		/*DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);*/
		
		FirefoxProfile fp = new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		
		FirefoxOptions opt = new FirefoxOptions();
		
		opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Library\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(opt);
		driver.manage().window().maximize();
		
		driver.get("https://expired.badssl.com/");
			

	}

}

