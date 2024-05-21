package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptalert {
	
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h5[contains(text(),' Alert (Prompt Dialog)')]//following::span")).click();
	Alert promptAlert = driver.switchTo().alert();
	System.out.println(promptAlert.getText());
	promptAlert.sendKeys("Nishanthi");
	promptAlert.accept();
	
	
	String text = driver.findElement(By.xpath("//h5[contains(text(),' Alert (Prompt Dialog)')]//following::span[3]")).getText();
	System.out.println(text);
	
	if(text.contains("Nishanthi")) {
		
		System.out.println("Action accpeted");
	}
	
	else
	{
		System.out.println("Not accpeted");
	}
	

		
}
}

