package TestNG;

import org.testng.annotations.Test;

public class grpExThree {
	
	@Test
	public void CarSignOut(){
		System.out.println("Car Loan Sign Out Cases");
	}
	
	@Test(groups={"home"})
	public void HomeSignOut(){
		System.out.println("Home Loan Sign Out Cases");
	}
	
	@Test
	public void EduSignOut(){
		System.out.println("Education Loan Sign Out Cases");
	}
}
