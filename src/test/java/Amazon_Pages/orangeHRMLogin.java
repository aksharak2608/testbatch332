package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHRMLogin {
	WebDriver driver;
	@FindBy(xpath="//input[@name='username']") WebElement username;
	
	@FindBy(xpath="//input[@name='password']") WebElement password;
	
	@FindBy(xpath="//button[@type='submit']") WebElement login;
	
	
	public void EnterUsername()
	{
		username.sendKeys("Admin");
	}
	public void EnterPassword()
	{
		password.sendKeys("admin123");
	}
	
	public void login()
	{
		login.click();
	}
	public orangeHRMLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
