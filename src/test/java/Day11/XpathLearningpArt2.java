package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLearningpArt2 {

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
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		//  XPATH USING TEXT 
			
		//tag[text() = 'text for do structure']
		
		//div[text() = " Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"]
		
		/*
		 * WebElement texthome =
		 * driver.findElement(By.xpath("//div[text() = 'Swag Labs']"));
		 * 
		 * String hometxt = texthome.getText();
		 * 
		 * String txthme = "Swag Labs" ;
		 * 
		 * if(hometxt.equals(txthme)) { System.out.println("You are in home page"); }
		 * else { System.out.println("Text is failed "); }
		 */
		
		WebElement carticon = driver.findElement(By.xpath("//a[contains(@class , 'shopping_cart_link')]"));
		
		// is displayed
		
		if(carticon.isDisplayed())
		{
			System.out.println("You are in home page");
		}
		else
		{
			System.out.println("Test is failed");
		}
		

	}

}
