package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-label')]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'ui-chkbox-label')])[2]")).click();
		
		System.out.println("Is the message displayed: " + driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]")).isDisplayed());
		driver.findElement(By.xpath("//label[contains(text(),'Python')]")).click();
		System.out.println("Selected language is " + driver.findElement(By.xpath("//label[contains(@for,'j_idt87:basic:1')]")).getText());
	
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		//System.out.println("Is the message displayed: " + driver.findElement(By.xpath("//span[contains(text(),'Information')]/following::span")).isDisplayed());
		driver.findElement(By.xpath("//h5[contains(text(),'Tri State Checkbox')]/following::div[5]")).click();
		System.out.println("Whether checkbox disabled?: " + driver.findElement(By.xpath("//span[contains(text(),'Disabled')]")).isEnabled());
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//label")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//label)[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//label)[5]")).click();
		driver.close();
	}
	

}
