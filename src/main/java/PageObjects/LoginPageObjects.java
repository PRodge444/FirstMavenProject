package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	WebDriver driver;
	
	By username= By.xpath("//input[@id='username']");
	
	By password= By.xpath("//input[@id='password']");
	
	By loginbutton= By.xpath("//input[@id='Login']");
	
	By tryforfree = By.xpath("//a[@id='signup_link']");
	
	public LoginPageObjects(WebDriver loginpagedriver)
	{
		this.driver=loginpagedriver;
	}
	
	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement clickOnLoginButton()
	{
		return driver.findElement(loginbutton);
	}
	
	public WebElement clickOntryForFree()
	{
		return driver.findElement(tryforfree);
	}
	
	
	

}
