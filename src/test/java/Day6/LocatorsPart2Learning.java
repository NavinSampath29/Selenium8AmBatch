package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPart2Learning {

	public static void main(String[] args) {
		
		// link text >SELENIUM<
		
		// partial link text 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		// We are going to code for weblement 
		
				WebElement username = driver.findElement(By.id("user-name"));
				
				WebElement password = driver.findElement(By.name("password"));
				
				WebElement login = driver.findElement(By.id("login-button"));
				
				// Passing values 
				
				username.sendKeys("standard_user");
				password.sendKeys("secret_sauce");
				login.click();
				
				// LinkText
				
				// WebElement twitelink = driver.findElement(By.linkText("Twitter"));
				 // twitelink.click();
				
				// Partial link text 
				
				WebElement twitelink = driver.findElement(By.partialLinkText("Twi"));
				twitelink.click();
				
				driver.close();
		
		

	}

}
