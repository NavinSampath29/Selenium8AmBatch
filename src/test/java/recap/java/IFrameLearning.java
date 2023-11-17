package recap.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class IFrameLearning {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gomat\\eclipse-workspace\\recaping\\src\\test\\resources\\chromedriver.exe");


		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://nxtgenaiacademy.com/iframe/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		driver.switchTo().frame("formpage");
		
		WebElement fname = driver.findElement(By.xpath("//input[contains(@id, 'vfb-5')]"));
		
		fname.sendKeys("Navin");
		
		// It will automatically switch to parent frame 
		
		driver.switchTo().defaultContent();

	}

}

