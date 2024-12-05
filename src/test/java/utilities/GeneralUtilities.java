package utilities;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GeneralUtilities 
{

	static String fn;
	public static String randomFirstName()
	{
		fn = RandomStringUtils.randomAlphabetic(7);
		return fn;
	}
	
	public static String randomLastName()
	{
		String ln = RandomStringUtils.randomAlphabetic(7);
		return ln;
	}
	
	public static String randomEmail()
	{
		Random random=new Random();
		String em = fn + random.nextInt() + "@gamil.com";
		return em;
	}
	
	public static String randomPassword()
	{
		Random random=new Random();
		String ps = fn + random.nextInt();
		return ps;
	}
	
	public static void Scrolling (WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy (0,document.body.scrollHeight)");
		
	}
	
	
}
