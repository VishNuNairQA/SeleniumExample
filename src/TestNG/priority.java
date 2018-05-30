package TestNG;

import org.testng.annotations.Test;

public class priority {
	
	//Test cases are always executed in alphabetical order in TestNG,
	//To group and order the test cases, priority are used
	//negative order priority takes highest precedence
	//zero takes second highest precedence
	//then comes alphabetical order
	//then comes number starting 1, 2, 3 and so on
	
	
	
	/*@Test(priority=3)
	public void cMethod(){
		System.out.println("Method C");
	}
	
	@Test(priority=2)
	public void dMethod(){
		System.out.println("Method D");
	}
	
	@Test(priority=1)
	public void aMethod(){
		System.out.println("Method A");
	}
	
	@Test(priority=0)
	public void bMethod(){
		System.out.println("Method B");
	}
	
	@Test
	public void sethod(){
		System.out.println("Method Z");
	}*/
	
	
	@Test(priority=1)
	public void aMethod(){
		System.out.println("Method A");
	}
	
	@Test
	public void zMethod(){
		System.out.println("Method Z");
	}
	
	//Here we have both, priority and non priority assigned, but as per the ordering,
	//Negative and Zero comes at first two position
	//then comes alphabets (no priority defined) test case, hence zMethod executes first
	//then atlast positive integers starting 1

}
