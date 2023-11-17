package recap.java;

import org.testng.annotations.Test;

public class DependsOnStage {
	@Test
	public void launchbrowser()
	{
		
		RuntimeException e =new RuntimeException(); //just incase of any error in the execution of 1 method
	
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
