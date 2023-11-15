package Day18;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgarch1 {
	
	
	// Opening the browser 
	
		// Launching the website url
		
		// Entering USERNAME// PASSWORD CLICK LOGIN BUTTON 
		
		// CHECK WHETHER U ARE INTO THE HOME PAGE 
		
		// LOGOUT 
	
	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("Browser has been launched");
	}
	
	@BeforeMethod
	public void puturl()
	{
		System.out.println("URL Placed");
	}
	
	@Test
	public void credentials()
	{
		System.out.println("Enterng username password click login button");
	}
	
	
	@AfterMethod
	public void check()
	{
		System.out.println("Checking or Validating whether we are in home page");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("Close browser");
	}
	// @BeforeTest  1 
	
	
	// @Before Method 2
	
	
	// @Test  - Main Method 3
	
	// @AfterMethod 4
	
	// @AfterTest 5
	
	
	

}
