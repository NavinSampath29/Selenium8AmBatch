package pom.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest extends BaseTest
{
	@FindBy(xpath ="//input[contains(@data-test , 'username')]")
	public WebElement username ;
	
	@FindBy(xpath = "//input[contains(@name , 'password')]")
	public WebElement password ;
	
	@FindBy(xpath = "//input[contains(@id , 'login-button')]")
	public WebElement login ;
	
	@FindBy(xpath = "//div[contains(@class , 'app_logo')]")
	public WebElement checking;
	
	// POM important area is driver using init elements from page factory class
	
	
	public LoginTest()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void passcredentials()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}
	
	public void check()
	{
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

}
