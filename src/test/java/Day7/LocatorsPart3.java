package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPart3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
	
		//  CSS Selector
		
		// Tagname[placeholder = 'Username']
		
		// input[placeholder = 'Username']
		
		// input[id='password']
		
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder = 'Username']"));
		
		WebElement password = driver.findElement(By.cssSelector("input[id='password']"));
		
		WebElement login = driver.findElement(By.cssSelector("input[data-test='login-button']"));
	
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}

}
