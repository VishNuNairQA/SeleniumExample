package TestNG;

import org.testng.annotations.Test;

public class grpExTwo {
	
	@Test
	public void CarSignUp(){
		System.out.println("Car Loan Sign Up Cases");
	}
	
	@Test(groups={"home"})
	public void HomeSignUp(){
		System.out.println("Home Loan Sign Up Cases");
	}
	
	@Test
	public void EduSignUp(){
		System.out.println("Education Loan Sign Up Cases");
	}

}
