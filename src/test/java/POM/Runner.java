package POM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runner  {
	
	LoginTest lt ;
	
	@BeforeTest
	public void bt()
	{
		BaseTest.intlizebrowser();
		BaseTest.puturl();
	}
	
	@Test
	public void tc01()
	{
		lt = new LoginTest();
		lt.passcredentials();
		lt.check();
	}
	
	@AfterTest
	public void at()
	{
		BaseTest.teardown();
	}
	
	
	

}
