package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deleteclass {
    public static void main(String[] args) throws InterruptedException {
		
    	ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();

		WebElement eleUsername = driver.findElement(By.id("username"));

		eleUsername.sendKeys("Demosalesmanager");
		// enter the password in the password field using **attribute based xpath**
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// doing implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[contains(@class, 'Submit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		/*
		 * driver.findElement(By.xpath("//input[contains(@name,'phoneCountryCode')]")).
		 * sendKeys("91");
		 * driver.findElement(By.xpath("//input[contains(@name,'phoneAreaCode')]")).
		 * sendKeys("44");
		 */
		
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("8072795767");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println(id);
		driver.findElement(By.xpath("//a[contains(text(),'"+id+"')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("8072795767");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[contains(@class,'x-paging-info')]")).getText();
		System.out.println(text);
    }
}
