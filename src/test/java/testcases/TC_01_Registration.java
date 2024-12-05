package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageFactory.AccountCreatedPage;
import pageFactory.HomePage;
import pageFactory.RegisterPage;
import utilities.GeneralUtilities;

public class TC_01_Registration extends BasicTestCase
{

	@Test
	void registration() throws InterruptedException
	{
		
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickOnMyRegister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.First_name();
		rp.last_name();
		rp.Email1();
		rp.Password1();
		Thread.sleep(3000);
		GeneralUtilities.Scrolling(driver);
		
		rp.clickOnToggle();
		rp.ClickONContinueButton();
		
		Thread.sleep(3000);
		
		AccountCreatedPage acp=new AccountCreatedPage(driver);
		String ActualText = acp.AccountSuccessfullyGenerate();
		String XpectedText = "Your Account Has Been Created!";
		
		Assert.assertEquals(ActualText, XpectedText);
		
		
		
	}
		
		
}
	
	
	
	
	

