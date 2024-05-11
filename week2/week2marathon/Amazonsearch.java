package week2marathon;

import org.openqa.selenium.By;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsearch {
	
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.id("twotabsearchtextbox")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for b");
	driver.findElement(By.xpath("//span[text()='oys']")).click();
	System.out.println("Search result is: " + driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small a-spacing-top-small')]")).getText());
	driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left')])[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("a-autoid-0-announce")).click();
	driver.findElement(By.linkText("Newest Arrivals")).click();
	System.out.println("Details of Bag is: " + driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')]")).getText());
	System.out.println("Discounted Bag price is: " + driver.findElement(By.xpath("//span[contains(@class,'a-price-whole')]")).getText());
	System.out.println("Title of the page is: " + driver.getTitle());
	driver.close();
	}

}
