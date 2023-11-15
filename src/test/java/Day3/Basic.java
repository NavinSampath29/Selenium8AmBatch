package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basic {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");
		
		//Interface 
		
		// We cannot create a object 
		
		// We are going to use interface also we are going to type casting 
		
		// We are going to perform type casting 
		
		// WebDriver is a interface coming from selenium 
		
		// ChromeDriver is a class which is coming from selenium 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new ChromeDriver();
		
		// To Launch URL 
		
		driver.get("https://www.facebook.com/");
		
		
		
		
	}

}
