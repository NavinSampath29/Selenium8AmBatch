package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsLearning {

	public static void main(String[] args) {
		
		// Wait - 
		
		// Implicit wait -  
		
		// It will wait for given time and throw the expection 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
		
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement username = driver.findElement(By.xpath("//input[contains(@data-test , 'username')]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement password = driver.findElement(By.xpath("//input[contains(@name , 'password')]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		// Accesing wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement wrong = driver.findElement(By.xpath("//h3[contains(@data-test , 'error')]"));
		
				

	}

}
