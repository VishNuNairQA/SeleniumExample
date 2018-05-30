package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersRedbus {
	
	@Parameters({"URL"})
	@Test
	public void urlname(String url){
		System.out.println("Url for Redbus: " +url);
	}

}
