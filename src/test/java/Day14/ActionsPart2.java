package Day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPart2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");


		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		// Actions class 
		
		Actions a = new Actions(driver);
		
		List<WebElement> capitals =	driver.findElements(By.xpath("//div[contains(@id , 'dropContent')]/div"));
	
		List<WebElement> count = driver.findElements(By.xpath("//div[contains(@id , 'countries')]/div"));
	
	
		String source = "Oslo" ;
		
		String des = "Norway" ;
		
		for(WebElement e : capitals)
		{
			String q = e.getText();
			
			
			if(e.getText().equals(source))
			{
				for(WebElement r :count )
				{
					String q1 = r.getText();
					if(r.getText().equals(des))
					{
						a.dragAndDrop(e,r).build().perform();
						break;
					}
				}
			}
			
			
		}
		
	}

}
