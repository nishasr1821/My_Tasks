package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	
	public WelcomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public WelcomePage verifyHomePage() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps"))
		{
			System.out.println("Homepage is displayed");
		}
		else
		{
			System.out.println("Homepage is not displayed");
		}
		return this;
	}
	
	public MyHomePage clickCRMSFALink() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		
	}

}
