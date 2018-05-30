package TestNG;

import org.testng.annotations.Test;

public class helperMethods {
	
	//If there's a testcase that is dependent on some other testcase,
	//then use dependsOnMethods
	
	//If there are 100 testcases, and there is one failed testcase which you don't want to run
	//so in that case, enabled = false
	//If enabled = true, then that testcase will run

	@Test
	public void signUp(){
		System.out.println("Sign Up");
	}
	
	@Test(dependsOnMethods = {"signUp"})
	public void home(){
		System.out.println("Home");
	}
	
	@Test(dependsOnMethods = {"home"})
	public void signOut(){
		System.out.println("Sign Out");
	}
	
	@Test(enabled = false)
	public void failedTestCase(){
		System.out.println("If there's a testcase which is getting failed and you want to disable that, use enabled");
	}
	
}
