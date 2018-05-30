package SampleTest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class makeMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stubcmd
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.makemytrip.com/");
		
		String from = "Pune";
		String fromHint = from.substring(0, 3);
		
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys(fromHint);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String fromTxt = "return document.getElementById(\"hp-widget__sfrom\").value";
		
		String currentFromTxt = (String) jse.executeScript(fromTxt);
		
		System.out.println("Current From: " +currentFromTxt);
		
		while(!currentFromTxt.contains("Pune, India")){
			driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys(Keys.DOWN);
			currentFromTxt = (String) jse.executeScript(fromTxt);
			System.out.println("Current From: " +currentFromTxt);
		}
		
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys(Keys.ENTER);
		
		//To
		
		String to = "Ernakulam";
		String toHint = to.substring(0, 3);
		
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys(toHint);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys(Keys.DOWN);
		
		String toTxt = "return document.getElementById(\"hp-widget__sTo\").value";
		
		String currentToTxt = (String) jse.executeScript(toTxt);
		
		System.out.println("Current To: " +currentToTxt);
		
		while(!currentToTxt.contains("Ernakulam, India")){
			driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys(Keys.DOWN);
			currentToTxt = (String) jse.executeScript(toTxt);
			System.out.println("Current To: " +currentToTxt);
		}
		
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys(Keys.ENTER);
		
		
		//Calendar
		
		Thread.sleep(3000);
		
		String journeyDate = "11";
		
		String currentMonth = driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month'])[1]")).getText();
		System.out.println("Current Month: " +currentMonth);
		
		while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month'])[1]")).getText().equalsIgnoreCase("August")){
			currentMonth = driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month'])[1]")).getText();
			System.out.println("Current Month: " +currentMonth);
			driver.findElement(By.xpath("(//a[@title='Next']/span[text()='Next'])[1]")).click();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table/tbody//td/a"));
		System.out.println("Total Days: " +days.size());
		
		for(int i=0; i<days.size(); i++){
			String date = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table/tbody//td/a")).get(i).getText();
			
			if(date.equals(journeyDate)){
				driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table/tbody//td/a")).get(i).click();
				break;
			}
		}
		
		//Search
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		Thread.sleep(5000);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\trip.png"));
		
	}

}
