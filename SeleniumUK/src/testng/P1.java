package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P1 {
	
	@Test
	public void apple() {
		Reporter.log("from apple");
	}
	
	@Test
	public void banana()
	{
		Reporter.log("from banana");
	}
}

