package TestNG;

import org.testng.annotations.Test;

public class grpExOne {
	
	@Test
	public void CarLoan(){
		System.out.println("Car Loan Test Cases");
	}
	
	@Test(groups={"home"})
	public void HomeLoan(){
		System.out.println("Home Loan Test Cases");
	}
	
	@Test
	public void EduLoan(){
		System.out.println("Education Loan Test Cases");
	}

}
