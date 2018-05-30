package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersMMT {
	
	@Parameters({"URL"})
	@Test
	public void urlname(String url){
		System.out.println("Url for MMT: " +url);
	}

}
