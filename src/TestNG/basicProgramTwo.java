package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class basicProgramTwo {

	
	@Test
	public void programTwoMethodA(){
		System.out.println("Program Two : Method A");
	}
	
	@Test
	public void programTwoMethodB(){
		System.out.println("Program Two : Method B");
	}
	
	@AfterSuite()
	public void afterSuiteExe(){
		System.out.println("Since the scope of BeforeSuite/AfterSuite is throughout the XML file, this will be executed at the last after execution of all the other test cases");
	}
}
