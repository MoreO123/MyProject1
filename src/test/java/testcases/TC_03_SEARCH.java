package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageFactory.SearchPage;

public class TC_03_SEARCH extends BasicTestCase
{

	@Test(priority =3)
	void Serach () {
		
		SearchPage sp= new SearchPage(driver);
		sp.searchTextField("Tablets");
		sp.searchButtonField();
		
		boolean status = sp.SearchTablet();
		Assert.assertTrue(status);
		
		
		
		
		
		
	}
}
