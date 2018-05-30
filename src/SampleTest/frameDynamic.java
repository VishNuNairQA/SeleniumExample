package SampleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frameDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		int frameCheckboxID = getFrameID(driver, By.xpath("//span[@id='recaptcha-anchor']"));
		driver.switchTo().frame(frameCheckboxID);
		
		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
		driver.switchTo().defaultContent();
	
		
		
	}
	
	
	public static int getFrameID(WebDriver driver, By by){
		
		int i;
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of frames: " +totalFrames.size());
		
		for(i=0; i<totalFrames.size(); i++){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			
			int frameElement = driver.findElements(by).size();
			
			if(frameElement>0){
				System.out.println("Element present in " +i+ " frame");
				break;
			}
			else{
				continue;
			}

		}
		
		driver.switchTo().defaultContent();
		return i;
		
	}

}
