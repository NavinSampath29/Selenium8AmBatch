package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumwithTestng {
	
	WebDriver driver ;
	
	@BeforeTest
	public void intlizebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void puturl()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void crdentials()
	{
		WebElement username = driver.findElement(By.xpath("//input[contains(@data-test , 'username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@name , 'password')]"));
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}
	
	@AfterMethod
	public void check()
	{
		WebElement checking = driver.findElement(By.xpath("//div[contains(@class , 'app_logo')]"));
		String logo = checking.getText();
		System.out.println(logo);
		if(logo.equals("Swag Labs"))
		{
			System.out.println("You are in home page");
		}
		else
		{
			System.out.println("Failed checking");
		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
