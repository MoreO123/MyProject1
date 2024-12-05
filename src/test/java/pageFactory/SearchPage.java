package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage 
{
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchtext;
	
	@FindBy(xpath = "//button[@class='btn btn-light btn-lg']") 
	WebElement searchbutton;
	
	@FindBy (xpath = "//h1[normalize-space()='Search - Tablets']")
	WebElement tablet;
	
	WebDriver drivers;
	public SearchPage(WebDriver driver) {
		drivers =driver;
	}

	public void searchTextField (String cart)
	{
		searchtext.sendKeys(cart);
	}

	public boolean SearchTablet ()
	{
		boolean components = tablet.isDisplayed();
		return components;
		
	}
	
	public void searchButtonField ()
	{
		searchbutton.click();
	}
}
