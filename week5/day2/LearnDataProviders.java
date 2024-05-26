package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders extends SuperClass {
	@DataProvider (name="getdata")
	public String[][] providedata(){
		
		String[][] data = new String[2][3];
		
		data[0][0]="Jasmin";
		data[0][1]="Nisha";
		data[0][2]="V";
		data[1][0]="JI";
		data[1][1]="Gopi";
		data[1][2]="R";
		
		return data;
	}
	
	@Test(dataProvider="getdata")
	public void runCreateLead(String frstName, String lastName, String cmpName) {
				
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(frstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	
		driver.close();
		
	}
}
