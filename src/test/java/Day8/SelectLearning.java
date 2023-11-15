package Day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLearning {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder = 'Username']"));
		
		WebElement password = driver.findElement(By.cssSelector("input[id='password']"));
		
		WebElement login = driver.findElement(By.cssSelector("input[data-test='login-button']"));
	
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		WebElement options = driver.findElement(By.cssSelector("select[data-test='product_sort_container']"));

		// Select class from selenium 
		
		Select s = new Select(options);
		
		// to get all options there is a method called getoptions();
		
		List<WebElement> p =  s.getOptions();
		
	int i = 	p.size();
	
	System.out.println(i);
		
		//  Checking whether all options saved 
		
		for(WebElement q : p )
		{
			String d = q.getText();
			System.out.println(d);
		}
		
		// Select by index
		
		// Select by value 
		
		// Select by visible text 
		
		
		// s.selectByIndex(2);
		
		// s.selectByValue("za");
		
		s.selectByVisibleText("Price (high to low)");
		
	}

}
