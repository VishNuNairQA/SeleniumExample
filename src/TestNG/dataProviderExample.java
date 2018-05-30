package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample {
	
	//Suppose we want to validate login for 20 sets of username and password, 
	//So writing a login procedure with all that 20 set of username and password is tiresome task,
	//A better way should be justified wherein we can validate everything with just one simple method
	//Hence, we use @DataProvider in such cases
	
	
	@Test(dataProvider = "loginData")
	public void login(String usr, String pwd){
		System.out.println("Hello World");
		System.out.println(usr);
		System.out.println(pwd);
	}

	
	@DataProvider
	public Object[][] loginData(){
		
		//Here Object[i][j], i stands for number of iteration and j stands for no of parameters that we are passing
		
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "firstUsername";
		obj[0][1] = "firstPassword";
		
		obj[1][0] = "secondUsername";
		obj[1][1] = "secondPassword";
		
		obj[2][0] = "thirdUsername";
		obj[2][1] = "thirdPassword";
		
		
		return obj;
		
	}
}
