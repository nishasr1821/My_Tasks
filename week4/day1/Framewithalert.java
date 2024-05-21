package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framewithalert {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Alert says: " + simpleAlert.getText());
		simpleAlert.accept();
		String txt = driver.findElement(By.id("demo")).getText();
		
		if(txt.contains("You pressed OK!")) {
			System.out.println("Action is: " + txt);
		}
		else {
			
			System.out.println("Action is dismissed");
		}
		
		driver.close();
		
		
		
		
		
	}

}
