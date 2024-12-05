package testcases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BasicTestCase {

	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
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
	@AfterClass
	void closeBrowser()
	{
		driver.close();
	}
}
