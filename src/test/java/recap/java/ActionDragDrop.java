package recap.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class ActionDragDrop {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gomat\\\\eclipse-workspace\\\\recaping\\\\src\\\\test\\\\resources\\\\chromedriver.exe");


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
			
			
			if(q.equals(source))
			{
				for(WebElement r :count )
				{
					String q1 = r.getText();
					if(q1.equals(des))
					{
						a.dragAndDrop(e,r).build().perform();
						break;
					}
				
				}
				
			}
			System.out.println(q);
			
			
		}
		String source1 = "Rome";
		String dest1 = "Italy";
				for(WebElement e1 : capitals)
				{
					if(e1.getText().equals(source1)) 
					{
						for(WebElement q2 : count)
						{
							if(q2.getText().equals(dest1))
									{
								a.dragAndDrop(e1,q2).build().perform();
								break;
									}
						}
					}
				}
				
				
	}

}


