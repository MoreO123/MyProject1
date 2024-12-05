package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement login;
	

	WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMyAccount()
	{
		myaccount.click();
	}
	
	public void clickOnMyRegister()
	{
		register.click();
	}
	
	public void clickOnMyLogin()
	{
		login.click();
	}
}
