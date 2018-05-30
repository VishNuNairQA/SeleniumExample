package TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.testNGListeners.class)

public class listenerExample {
	
	@Test
	public void sample(){
		System.out.println("Hello World!");
		Assert.assertTrue(false);
	}
	
	@Test
	public void dual(){
		System.out.println("Bye World!");
		Assert.assertTrue(true);
	}

}
