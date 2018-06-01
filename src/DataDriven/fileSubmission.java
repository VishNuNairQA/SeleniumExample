package DataDriven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class fileSubmission {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.guru99.com/become-an-instructor.html");
		
		int frameBrowse = getFrameID(driver, By.xpath("//div[text()[normalize-space()='Browse Files']]"));
		driver.switchTo().frame(frameBrowse);
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()[normalize-space()='Browse Files']]"))).doubleClick().build().perform();
		
		//driver.findElement(By.xpath("//div[text()[normalize-space()='Browse Files']]")).click();
		
		Runtime.getRuntime().exec("D:\\Selenium Library\\fileUpload.exe");
		
		driver.findElement(By.xpath("//button[text()[normalize-space()='Submit']]")).click();
	}
	
	
	public static int getFrameID(WebDriver driver, By by){
		
		int i;
		driver.switchTo().defaultContent();
		List<WebElement> element = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of frames: " +element.size());
		
		for(i=0; i<element.size(); i++){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			
			int elementPresent = driver.findElements(by).size();
			
			if(elementPresent > 0)
			{
				System.out.println("Element present in frame: " +i);
				break;
			}else
			{
				continue;
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
