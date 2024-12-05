package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage 
{
	
	@FindBy(xpath = "//h1[text() = 'Your Account Has Been Created!']")
	WebElement accountcreation;
	
	WebDriver driver;
	public AccountCreatedPage(WebDriver driver) {
		this.driver =driver;
	}

	public boolean AccountSuccessfullyGenerate() {
		boolean asf = accountcreation.isDisplayed();
		return asf;
		
	}
	

}
