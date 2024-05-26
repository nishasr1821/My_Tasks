package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//locate the webelement
		WebElement eleMen = driver.findElement(By.xpath("//span[text()='MEN']"));
		//Instantiate the Actions class
		Actions builder = new Actions(driver);
		// use moveToElement() to do mousehover action
		builder.moveToElement(eleMen).perform();
		// click shirts 
		Thread.sleep(3000);
		driver.findElement(By.linkText("Shirts")).click();
	}
}