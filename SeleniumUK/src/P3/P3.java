package P3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P3 {
	
	WebDriver driver;

	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		String expectedTitle = "Booooooooogle";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			Reporter.log("Test is passed", true);
		}
		
		else
		{
			Reporter.log("Test is failed", true);
			Assert.fail();
		}
		
		
	}
	

}
