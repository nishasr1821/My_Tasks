package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionsclass {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement elscrolldwn = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		Actions act = new Actions(driver);
		act.scrollToElement(elscrolldwn).perform();
		System.out.println("Page Scrolling to: " + elscrolldwn.getText());
	
		
	}

}
