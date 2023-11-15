package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver ;
	
	public static void intlizebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

	}
	
	public static void puturl()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	public static void teardown()
	{
		driver.quit();
	}
	
	
	
	

}
