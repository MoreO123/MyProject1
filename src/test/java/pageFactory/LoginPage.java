package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static String r_email;
	public static String r_password;
	
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailaddress;
	
	@FindBy (xpath ="//input[@id='input-password']")
	WebElement password;
	
	@FindBy (xpath ="//button[@type='submit']")
	WebElement loginbutton;
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void emailaddressfield (String emailid)
	{
		emailaddress.sendKeys(emailid);
	}
	
	public void passwordfield (String passkey)
	{
		 password.sendKeys(passkey);
	}
	
	public void clickOnLoginButton ()
	{
		loginbutton.click();
	}

}
