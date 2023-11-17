package recap.java;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotLearn {

	public static void main(String[] args)throws IOException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\gomat\\eclipse-workspace\\recaping\\src\\test\\resources\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
TakesScreenshot ss = (TakesScreenshot)driver;

WebElement username = driver.findElement(By.xpath("//input[contains(@data-test , 'username')]"));
WebElement password = driver.findElement(By.xpath("//input[contains(@name , 'password')]"));
WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
username.sendKeys("standard_user");
password.sendKeys("secret_sauce");
login.click();
//source
File source = ss.getScreenshotAs(OutputType.FILE);
//destination
File Destination = new File("C:\\Users\\gomat\\eclipse-workspace\\recaping\\target\\Takescreen.png");
FileHandler.copy(source, Destination);

	}

}
