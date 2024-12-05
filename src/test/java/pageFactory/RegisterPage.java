package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class RegisterPage 
{

	WebDriver driver;
	public RegisterPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacytoggle;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement continueb;
	
	

	public String First_name ()
	{
		String fsname = GeneralUtilities.randomFirstName();
		firstname.sendKeys(fsname);
		return fsname;
	}
	
	public String last_name ()
	{
		String lsname = GeneralUtilities.randomLastName();
		lastname.sendKeys(lsname);
		return lsname;
	}

	public String Email1 ()
	{
		String iemail = GeneralUtilities.randomEmail();
		email.sendKeys(iemail); System.out.println(iemail);
		LoginPage.r_email=  iemail;
		return iemail;
		
	}

	public String Password1 ()
	{
		String psword = GeneralUtilities.randomPassword();
		password.sendKeys(psword); System.out.println(psword);
		LoginPage.r_password =psword;
		return psword;
	}

	public void clickOnToggle ()
	{
		privacytoggle.click();
	}

	public void ClickONContinueButton ()
	{
		continueb.click();
	}

	
}
