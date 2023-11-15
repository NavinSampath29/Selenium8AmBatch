package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless=new");
		
		// TO launch the browser 
		WebDriver driver = new ChromeDriver(co);
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		WebElement username = driver.findElement(By.cssSelector("input[placeholder = 'Username']"));
		
		WebElement password = driver.findElement(By.cssSelector("input[id='password']"));
		
		WebElement login = driver.findElement(By.cssSelector("input[data-test='login-button']"));
	
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	
		System.out.println("Logged in Succesfully");
	}

}
