package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.MyAccountPage;

public class TC_02_Login extends BasicTestCase
{
	@Test(priority=2) 
	void login () {
		
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickOnMyLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.emailaddressfield(lp.r_email);
		lp.passwordfield(lp.r_password);
		lp.clickOnLoginButton();
		
		MyAccountPage mp= new MyAccountPage(driver);
		String actualtext = mp.returntextAfterLogin();
		String expected_text = "My Account";
		
		Assert.assertEquals(actualtext, expected_text);
		
		
		
		
	}

}
