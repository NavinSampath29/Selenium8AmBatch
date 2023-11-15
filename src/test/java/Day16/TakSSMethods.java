package Day16;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakSSMethods {
	
	public void takess(File source,File Destination,String filename) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");

		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot ss =(TakesScreenshot)driver;
		source = ss.getScreenshotAs(OutputType.FILE);
		
		Destination = new File("C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\target\\"+filename+".png");

		FileHandler.copy(source, Destination);
	}

}
