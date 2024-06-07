package week6.marathon;



import java.awt.RenderingHints.Key;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class DeleteOpportunity extends SuperClass{
	
	@BeforeTest
	public void setValues() {
		fileName="Salesforce";
		
	}
		
	@Test(dataProvider = "getdata",priority=3,dependsOnMethods={"week6.marathon.CreateOpportunity.runCreateOpportunity","week6.marathon.EditOpportunity.runEditOpportunity"})
	public void runDeleteOpportunity(String oppName, String amount) throws InterruptedException {
				
		driver.findElement(By.xpath("//*[@placeholder='Search this list...']")).sendKeys(oppName,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table/tbody/tr/td[8]")).click();
		
		Thread.sleep(3000);
		WebElement delete = driver.findElement(By.xpath("//div[text()='Delete']"));
		driver.executeScript("arguments[0].click();", delete);

		Thread.sleep(5000);
//		Alert simpleAlert = driver.switchTo().alert();
//		System.out.println("Alert message says: "+ simpleAlert.getText());
//		simpleAlert.accept();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
				
		Thread.sleep(3000);
		WebElement record = driver.findElement(By.xpath("//lightning-formatted-rich-text[@class='slds-rich-text-editor__output']/span"));
	      String record1 = record.getText();
	      //verify the name matched
	      
	      Assert.assertEquals(record1, "No items to display.");
	      System.out.println("Available records: " + record1);
//	      if (record1.equals("No items to display.")) {
//	    	  System.out.println("Opportunity is Deleted ");
//			
//		}
//      else {
//	    	  System.out.println("Opportunity is not Deleted");
//	      }
	      
}
}






