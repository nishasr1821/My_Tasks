package week6.marathon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CreateOpportunity extends SuperClass{
	
	@BeforeTest
	public void setValues() {
		fileName="Salesforce";
		
	}
	
	

	@Test(dataProvider = "getdata",priority=1)
	public void runCreateOpportunity(String oppName, String amount) throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//label[text()='Close Date']")).click();
		driver.findElement(By.xpath("//td[contains(@class,'slds-is-today')]/span")).click();
		WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
		name.sendKeys(oppName);
	
		
		WebElement stageDD = driver.findElement(By.xpath("//button[contains(@aria-label,'Stage')]"));
		driver.executeScript("arguments[0].click();", stageDD);
		driver.findElement(By.xpath("//*[@data-value='Needs Analysis']")).click();
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();", save);
		
		 
		Thread.sleep(3000);
		WebElement oppstatus = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text"));
		System.out.println("Opportunity name is: " + oppstatus.getText());
	     
	    //verify the name matched
	      if (oppstatus.getText().contains("Nishanthi")) {
	    	  System.out.println("Opportunity created successfully");
			
		}
	      else {
	    	  System.out.println("Opportunity is not created correctly");
	      }
	      
	      

	}
}







