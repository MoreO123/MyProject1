package testcases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BasicTestCase {

	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod
	void launchBrowser (String br)
	{
		
	
		
		switch(br.toLowerCase()) 
		{
		
		case "chrome" : driver = new ChromeDriver();
		break;
		
		case "edge" : driver = new EdgeDriver();
		break;
		
		case "firefox" : driver = new FirefoxDriver();
		break;
		
		}
	
	driver.get("https://demo-opencart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	}
	@AfterMethod
	void closeBrowser()
	{
		driver.close();
	}
}
