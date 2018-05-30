package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loanSignUp {

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
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("I will be executed first before executing any other test cases from the test block");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("I will be executed last after executing other test cases from the test block");
	}
}
