package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class basicProgramOne {
	
	@Test
	public void programOneMethodA(){
		System.out.println("Program One : Method A");
	}
	
	@Test
	public void programOneMethodB(){
		System.out.println("Program One : Method B");
	}
	
	@BeforeSuite
	public void beforeSuiteExe(){
		System.out.println("This method will be executed first before execution of all the other test cases irrespective of the XML block, because there can only be one suite in the XML file");
	}

}
