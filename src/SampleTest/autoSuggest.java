package SampleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class autoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("http:\\redbus.in");
		
		String source = "Pune";
		String sourceHint = source.substring(0, 3);
		
		String dest = "Bharuch";
		String destHint = dest.substring(0, 3);
		
		
		//Source
		
		driver.findElement(By.xpath("//input[@id='src']")).click();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(sourceHint);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
		
		//System.out.println("Current To: " +driver.findElement(By.xpath("//input[@id='src']")).getText());
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String src = "return document.getElementById(\"src\").value";
		
		String srcText = (String) jse.executeScript(src);
		
		System.out.println("Current From: " +srcText);
		
		while(!srcText.equalsIgnoreCase(source)){
			
			driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
			
			srcText = (String) jse.executeScript(src);
			
			System.out.println("Current From: " +srcText);
			
		}
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);
		
		
		
		//Destination
		
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys(destHint);
		Thread.sleep(3000);
		driver.findElement(By.id("dest")).sendKeys(Keys.DOWN);
		
		String dst = "return document.getElementById(\"dest\").value";
		
		String destText = (String) jse.executeScript(dst);
		
		System.out.println("Current To: " +destText);
		
		while(!destText.equalsIgnoreCase(dest)){
			
			driver.findElement(By.id("dest")).sendKeys(Keys.DOWN);
			
			destText = (String) jse.executeScript(dst);
			
			System.out.println("Current To: " +destText);
			
		}
		
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);		
		
	}

}
