package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.SignUpPageObjects;
import resourses.baseClass;

public class SignUpPageTC extends baseClass {
	
@Test
	
	public void signUpPage() throws IOException 
	{
		
		initializeBrowser();
		
		driver.get("https://login.salesforce.com/?locale=in");
			
		SignUpPageObjects signUppageobject = new SignUpPageObjects(driver);
		
		signUppageobject.enterfirstname().sendKeys("Pooja");
		signUppageobject.enterlastname().sendKeys("Rodge");
		signUppageobject.enteremailid().sendKeys("poojarodge444@gmail.com");
		
		Select Sjobtiltle = new Select(signUppageobject.selectjobtitle());
		//select by index 
		Sjobtiltle.selectByIndex(1);
		
		signUppageobject.entercompanyname().sendKeys("TCS");
		
		Select semp = new Select(signUppageobject.selectemployees());
		//select by value
		semp.selectByValue("75");
		
		signUppageobject.enterphone().sendKeys("7972035621");
		
		Select scountry = new Select(signUppageobject.selectcountry());
		//select by 
		scountry.selectByVisibleText("India");
		
	//	Assert.assertEquals(10, 10);
		
	//	System.out.println("Login Validated Successfully");
		
		
		
		
	}

}
