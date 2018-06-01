package SampleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DataDriven.browserMethods;

public class redBus extends browserMethods{
	
	@Test
	public void openRedbus(){
		
		openBrowser("chrome");
		driver.get("https://www.redbus.in");
	}
	
	@Test(dependsOnMethods = "openRedbus")
	public void manageBooking() throws InterruptedException{
		
		driver.findElement(By.xpath("//div[text()[normalize-space()='Manage Booking']]/following-sibling::div")).click();
		
		List<WebElement> manageBookingList = driver.findElements(By.xpath("//div[text()[normalize-space()='Manage Booking']]/following-sibling::div//li"));
		System.out.println(manageBookingList.size());
		
		for(int i=0; i<manageBookingList.size(); i++){
			
			String listName = driver.findElements(By.xpath("//div[text()[normalize-space()='Manage Booking']]/following-sibling::div//li")).get(i).getText();
			System.out.println(listName);
			
			if(listName.equalsIgnoreCase("Cancel/Refund")){
				driver.findElements(By.xpath("//div[text()[normalize-space()='Manage Booking']]/following-sibling::div//li")).get(i).click();
				break;
			}
		
		}
	
	
	}

}
