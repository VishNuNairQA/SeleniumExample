package DataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class quoraLogin extends readWriteExcel{
	
	@Test
	public void openQuora(){
		
		initiateBrowser("chrome");
		driver.get("https://www.quora.com/");
	}
	
	@Test(dependsOnMethods = "openQuora")
	public void aquoraLogin() throws IOException, Exception{
		
		String username = readData("login", 1, 0);
		String password = readData("login", 1, 1);
		
		
		driver.findElement(By.xpath("//div[text()='Login']/following::input[@name='email']")).click();
		driver.findElement(By.xpath("//div[text()='Login']/following::input[@name='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//div[text()='Login']/following::input[@name='password']")).click();
		driver.findElement(By.xpath("//div[text()='Login']/following::input[@name='password']")).sendKeys(password);
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Login']"))));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("Home")){
			
			System.out.println("Passed");
			setData("login", 1, 2, "Passed");
			
		}else{
			
			System.out.println("Failed");
			setData("login", 1, 2, "Failed");
		
		}
	}

}
