package Day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingLearning {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		WebElement link = driver.findElement(By.linkText("LinkedIn"));
		
		WebElement twitelink = driver.findElement(By.partialLinkText("Twi"));
		twitelink.click();
		
		
		
		Thread.sleep(3000);
		
		// Windows Handling 
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
		Set<String> setofwindows = driver.getWindowHandles();
		
		// Why set ??
		
		//  Set will not allow duplicates
		
		// List 
			
		// Why list ?? - To get the index values
		
		// In set no index values is followed 
		
		List<String> allwindows = new ArrayList<String>(setofwindows);
		
		String twt = allwindows.get(1);
		
		System.out.println(twt);
		
		// To switch
		
		driver.switchTo().window(twt);
		
		driver.close();
		
		
		driver.switchTo().window(parentwindow);
		link.click();
		

	}

}
