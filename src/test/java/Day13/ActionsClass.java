package Day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		// Actions class 
		
		Actions a = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		// Right click method name is context click 
		
		a.contextClick(rightclick).build().perform();
		
		List<WebElement> opt= driver.findElements(By.xpath("//ul[contains(@class , 'context-menu-list context-menu-root')]/li"));
		
		
		for(WebElement e : opt)
		{
			String li = e.getText();
			
			if(li.equals("Copy"))
			{
				e.click();
				break;
			}
			
		}
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
