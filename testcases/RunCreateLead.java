package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass {

	@BeforeTest
	public void setValues() {
		fileName="CreateLead";
		
	}
	
	@Test(dataProvider = "getdata")
	public void runCreateLead(String uName, String pWord, String cName, String fName,String lName) {
		
		System.out.println("Test create lead Method: " + driver);
		new LoginPage(driver).enterUsername(uName)
		.enterPassowrd(pWord)
		.clickLoginButton()
		.verifyHomePage()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmitButton()
		.verifyLeads(cName);
	}

}
