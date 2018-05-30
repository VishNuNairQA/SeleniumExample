package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loanCases {
	
	@BeforeMethod()
	public void b4Method(){
		System.out.println("This method will be executed each time before the execution of the test cases");
	}
	
	@Test
	public void CarLoan(){
		System.out.println("Car Loan Test Cases");
	}
	
	@Test
	public void HomeLoan(){
		System.out.println("Home Loan Test Cases");
	}
	
	@Test
	public void EduLoan(){
		System.out.println("Education Loan Test Cases");
	}
	
	@Test
	public void CarLoanSignUp(){
		System.out.println("Car Loan Sign Up Test Cases");
	}
	
	@Test
	public void HomeLoanSignUp(){
		System.out.println("Home Loan Sign Up Test Cases");
	}
	
	@Test
	public void EduLoanSignUp(){
		System.out.println("Education Loan Sign UpTest Cases");
	}
	
	@AfterTest
	public void afterTestExe(){
		System.out.println("Method executed after execution of all the other test cases within that test block");
	}
	
}
