package week6.marathon;



import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class EditOpportunity extends SuperClass{
	
	@BeforeTest
	public void setValues() {
		fileName="Salesforce";
		
	}
		
	@Test(dataProvider = "getdata",priority=2,dependsOnMethods="week6.marathon.CreateOpportunity.runCreateOpportunity")
	public void runEditOpportunity(String oppName, String amount) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@placeholder='Search this list...']")).sendKeys(oppName,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table/tbody/tr/td[8]")).click();
		
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//div[text()='Edit']"));
		driver.executeScript("arguments[0].click();", edit);

		driver.findElement(By.xpath("//label[text()='Close Date']")).click();
		driver.findElement(By.xpath("(//td[contains(@class,'slds-is-today')]/following::span)[1]")).click();

		WebElement stageDD = driver.findElement(By.xpath("//button[contains(@aria-label,'Stage')]"));
		driver.executeScript("arguments[0].click();", stageDD);
		driver.findElement(By.xpath("//*[@data-value='Perception Analysis']")).click();
		
		WebElement delivery = driver.findElement(By.xpath("//button[contains(@aria-label,'Delivery/Installation Status')]"));
		driver.executeScript("arguments[0].click();", delivery);
		driver.findElement(By.xpath("//span[text()='In progress']")).click();
		
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();", save);
		
		Thread.sleep(3000);
		WebElement stage = driver.findElement(By.xpath("//table/tbody/tr/td[5]"));
	      String stage1 = stage.getText();
	     //verify the name matched
	      Assert.assertEquals(stage1, "Perception Analysis");
	      System.out.println("Edited stage is:" + stage1);
	      System.out.println("Opportunity stage is updated");
//	      if (stage1.equals("Perception Analysis")) {
//	    	  System.out.println("Opportunity stage is updated");
//			
//		}
//      else {
//	    	  System.out.println("Opportunity stage is not updated");
//	      }
	      
}
}






