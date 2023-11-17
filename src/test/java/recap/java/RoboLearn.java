package recap.java;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboLearn {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		
		BufferedImage bre = null ;
		
		File desti = null ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gomat\\eclipse-workspace\\recaping\\src\\test\\resources\\chromedriver.exe");


		// TO launch the browser 
		WebDriver driver = new ChromeDriver();
				
		// To pass the URL 
			
		driver.get("https://www.saucedemo.com/");
				
		// To Maximize 
				
		driver.manage().window().maximize();
		
		//RoboScreenMethod rm = new RoboScreenMethod();

		// Robot class 
		
		Robot r = new Robot();
		
		// Dimension - ScreenSize 
		
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		
		//Rectanagle class
		
		Rectangle rr = new Rectangle(ss);
		
		// BUFFERED IMAGE 
		
		BufferedImage br = r.createScreenCapture(rr);
		
		// File class is used to save the destination 
		
		File dest = new File("C:\\Users\\gomat\\eclipse-workspace\\recaping\\target\\RoboTC01.png");
		
		// ImageIO class write static method
		
		ImageIO.write(br,"png",dest);
		WebElement username  = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	Thread.sleep(3000);
		
		//Robot r1 = new Robot();
		
		
		//Dimension ss1 = Toolkit.getDefaultToolkit().getScreenSize();
       //Rectangle rr1 = new Rectangle(ss);
		
		// BUFFERED IMAGE 
		
		//BufferedImage br1 = r.createScreenCapture(rr1);
		
		// File class is used to save the destination 
		
	//	File dest1 = new File("C:\\Users\\gomat\\eclipse-workspace\\recaping\\target\\RoboTC02.png");
		
		// ImageIO class write static method
		
		//ImageIO.write(br1, "png", dest1);
		RoboScreenMethod rm = new RoboScreenMethod();
		rm.robocapture(bre,desti,"pg1");
		
		
		
	}
	}


