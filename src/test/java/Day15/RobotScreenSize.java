package Day15;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotScreenSize {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		
		BufferedImage bre = null ;
		
		File desti = null ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\src\\test\\resources\\chromedriver.exe");


		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		RoboScreenMethod rm = new RoboScreenMethod();

		// Robot class 
		
		Robot r = new Robot();
		
		// Dimension - ScreenSize 
		
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		
		//Rectanagle class
		
		Rectangle rr = new Rectangle(ss);
		
		// BUFFERED IMAGE 
		
		BufferedImage br = r.createScreenCapture(rr);
		
		// File class is used to save the destination 
		
		File dest = new File("C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\target\\RoboTC01.png");
		
		// ImageIO class write static method
		
		ImageIO.write(br, "png", dest);
		
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@data-test , 'username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@name , 'password')]"));
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		//Rectanagle class
		
		/*
		 * Rectangle rr1 = new Rectangle(ss);
		 * 
		 * // BUFFERED IMAGE
		 * 
		 * BufferedImage br1 = r.createScreenCapture(rr1);
		 * 
		 * // File class is used to save the destination
		 * 
		 * File dest1 = new File(
		 * "C:\\Users\\Dell\\eclipse-workspace\\AutomationEveningBatch\\target\\RoboTC02.png"
		 * );
		 * 
		 * // ImageIO class write static method
		 * 
		 * ImageIO.write(br1, "png", dest1);
		 */
		
		rm.robocapture(bre, desti, "home" );
		
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
		
		
		
		
		
		rm.robocapture(bre, desti, "twiter");
		
	}

}
