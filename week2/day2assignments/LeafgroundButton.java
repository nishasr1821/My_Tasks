package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
	
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	//click on the "Click" button
	driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2')]")).click();
	System.out.println(driver.getTitle());
	//verify the page title
	if(driver.getTitle().contains("Dashboard")) {
		System.out.println("Yes the the page title is Dashboard");
	}
	else 
		System.out.println("Not matched");
	driver.get("https://leafground.com/button.xhtml");
	System.out.println("Whether the option enabled: " + driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled')]")).isEnabled());

	System.out.println("Position for submit is: " + driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
	System.out.println("Color for save is: " + driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));	
	//need to verify***********
	
	System.out.println("Height and width are: " + driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-right ui-icon ui-c pi pi-bookmark')]")).getSize());
	
	driver.close();
}
	
	
}
