package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathworking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@data-test , 'username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@name , 'password')]"));
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_use");
		password.sendKeys("secret_sauc");
		login.click();
		
		WebElement wrong = driver.findElement(By.xpath("//h3[contains(@data-test , 'error')]"));
		
	String wrongtext =	wrong.getText();
	
	System.out.println(wrongtext);
	
	String givenwrongtext = "Epic sadface: Username and password do not match any user in this service";
	
	System.out.println(givenwrongtext);
	
	if(wrongtext.equals(givenwrongtext))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}

	}

}
