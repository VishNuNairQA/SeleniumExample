package SampleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cricbuzzTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("start-maximized");
		opt.addArguments("disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		//driver.manage().window().maximize();
		
		int run = 0;
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20114/srh-vs-kkr-54th-match-indian-premier-league-2018");
		
		List<WebElement> runElement = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-right text-bold']"));
		System.out.println("Total No of Batsmen who batted that day: " +runElement.size());
		
		for(int i=0; i<runElement.size(); i++){
			String runString = runElement.get(i).getText();
			
			int runInt = Integer.parseInt(runString);
			
			run = run + runInt;
			
			System.out.println(runInt);
		}
		
		System.out.println("Total Run scored (without Extras) : " +run);
		
		
		String extraString = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//div[text()='Extras']/following-sibling::div[1]")).getText();
		
		int extraInt = Integer.parseInt(extraString);
		
		int totalRun = extraInt + run;
		
		System.out.println("Total Run scored (with Extras) : " +totalRun);
		
		
		String totalString = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//div[text()='Total']/following-sibling::div[1]")).getText();
		
		int totalInt = Integer.parseInt(totalString);
		
		System.out.println("Total Runs (as in WebPage) : " +totalInt);
		
		
		if(totalRun == totalInt){
			System.out.println("Data Successful!");
		}else{
			System.out.println("Computational Error!");
		}
		
		
	}

}
