package recap.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandLearn {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\gomat\\eclipse-workspace\\Recapii\\src\\test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gomat\\eclipse-workspace\\recaping\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("problem_user");
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[contains(@id, 'login-button')]"));
		login.click();
WebElement carticon = driver.findElement(By.xpath("//a[contains(@class , 'shopping_cart_link')]"));
		
		// is displayed(method name)
		
		if(carticon.isDisplayed())
		{
			System.out.println("You are in home page");
		}
		else
		{
			System.out.println("Test is failed");
		}
		//windows handling
      WebElement link = driver.findElement(By.linkText("LinkedIn"));
      link.click();
		
		WebElement twitelink = driver.findElement(By.partialLinkText("Twi"));
		twitelink.click();
		
		WebElement fb = driver.findElement(By.linkText("Facebook"));
		fb.click();
		
		String parentwindow = driver.getWindowHandle();
       System.out.println(parentwindow);
       Set< String>  setofwindows = driver.getWindowHandles();
       List<String> allwindows = new ArrayList<String>(setofwindows);
       String twt = allwindows.get(2);//starts from 0
       System.out.println(twt);
       driver.switchTo().window(twt); //Switch to the window
       driver.close();
       //driver.switchTo().window(parentwindow);
      //link.click();
     String twt1 =allwindows.get(1);
      driver.switchTo().window(twt1);
      driver.close();
      String twt2 =allwindows.get(3);
      driver.switchTo().window(twt2);
      driver.close();
      driver.switchTo().window(parentwindow);
      twitelink.click();
      driver.switchTo().window(parentwindow);

     
     
		
		

	}
}

		
		