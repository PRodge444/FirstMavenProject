package resourses;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseClass {
	
	public WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		
		//this is to access file
		FileInputStream filInStream = new FileInputStream("C:\\Users\\pooja\\eclipse-workspace\\FirstMavenProject\\src\\main\\java\\resourses\\configure.properties");
		
		//read the file data
		
		Properties prop = new Properties();
		
		prop.load(filInStream);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please select correct browser to run the test cases");
		}
		
	}
	
	public Select selectClass(WebElement ele)
	{
		Select sel = new Select(ele);
		return sel;
	}

}
