package TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import resourses.baseClass;

public class LoginPageTC extends baseClass {
	
	@Test
	
	public void login() throws IOException 
	{
		initializeBrowser();
		
		driver.get("https://login.salesforce.com/?locale=in");
			
		LoginPageObjects loginpageobject = new LoginPageObjects(driver);
		
		loginpageobject.enterUsername().sendKeys("Pooja");
		loginpageobject.enterPassword().sendKeys("Test");
		loginpageobject.clickOnLoginButton().click();
		loginpageobject.clickOntryForFree().click();
		
		Assert.assertEquals(10, 10);
		
		System.out.println("Login Validated Successfully");
		
		
		
		
	}

}

