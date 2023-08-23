package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageObjects {
	
	WebDriver driver;
	
	//enter first name
	By firstname=By.xpath("//input[@id=\"UserFirstName\"]");
	//enter last name
	By lastname=By.xpath("//input[@name=\"UserLastName\"]");
	//enter mail id
	By emailId=By.xpath("//input[@name=\"UserEmail\"]");
	//select job tile
	By jobtitle = By.xpath("//select[@name=\"UserTitle\"]");
	//enter company name
	By companyname= By.xpath("//input[@name=\"CompanyName\"]");
	//select number of employees
	By employees = By.xpath("//select[@name=\"CompanyEmployees\"]");
	//enter phone number
	By phone = By.xpath("//input[@name=\"UserPhone\"]");
	//select country
	By country = By.xpath("//select[@name=\"CompanyCountry\"]");
	
	public SignUpPageObjects(WebDriver signuppagedriver) {
		
		this.driver=signuppagedriver;
	}
	public WebElement enterfirstname()
	{
		return driver.findElement(firstname);
	}
	public WebElement enterlastname()
	{
		return driver.findElement(lastname);
	}
	public WebElement enteremailid()
	{
		return driver.findElement(emailId);
	}
	public WebElement selectjobtitle()
	{
		return driver.findElement(jobtitle);
	}
	public WebElement entercompanyname()
	{
		return driver.findElement(companyname);
	}
	public WebElement selectemployees()
	{
		return driver.findElement(employees);
	}
	public WebElement enterphone()
	{
		return driver.findElement(phone);
	}
	public WebElement selectcountry()
	{
		return driver.findElement(country);
	}
	
	
	
	
	

	
	

}
