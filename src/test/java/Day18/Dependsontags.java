package Day18;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependsontags {
	
	@Test
	public void launchbrowser()
	{
		
		RuntimeException e =new RuntimeException();
		System.out.println("Browser has been launched");
		throw e;
	}
	
	@Test(dependsOnMethods ="launchbrowser")
	public void puturl()
	{
		System.out.println("URL Placed");
	}
	
	@Test(dependsOnMethods ="puturl")
	public void credentials()
	{
		System.out.println("Enterng username password click login button");
	}
	
	
	@Test(dependsOnMethods ="credentials")
	public void check()
	{
		System.out.println("Checking or Validating whether we are in home page");
	}
	
	@Test(dependsOnMethods = "check")
	public void teardown()
	{
		System.out.println("Close browser");
	}

}
