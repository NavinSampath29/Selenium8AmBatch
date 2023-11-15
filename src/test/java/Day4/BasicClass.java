package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");
		
		// Chrome options class is used to put some configuration 
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		// TO launch the browser 
		WebDriver driver = new ChromeDriver(c);
		
		// To pass the URL 
		driver.get("https://www.facebook.com/");
		driver.get("https://www.saucedemo.com/");
		
		// To Maximize 
		
		driver.manage().window().maximize();
		
		// To Minimize 
		
		driver.manage().window().minimize();
		
		// To Maximize 
		
		driver.manage().window().maximize();

		// To Close the current page 
		
		// driver.close();
		
		// To Close the whole browser 
		
	// 	driver.quit();
		
		// Navigate Commands 
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
