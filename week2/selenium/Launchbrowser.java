package week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		/*WebElement eleusername = */driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		System.out.println(driver.getTitle());
		//driver.close();
		
	}
	
	 

}
