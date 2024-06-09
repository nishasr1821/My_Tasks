package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	
	
	@BeforeTest
	public void setValues() {
		fileName="Login";
		
	}
	
	@Test(dataProvider = "getdata")
	public void runLogin(String uName, String pWord) {
		
		System.out.println("Test login Method: " + driver);
		new LoginPage(driver).enterUsername(uName)
		.enterPassowrd(pWord)
		.clickLoginButton()
		.verifyHomePage()
		.clickCRMSFALink();
		
	
		
	}
		
	
}
