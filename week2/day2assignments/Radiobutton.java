package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("(//h5[contains(text(),'Your most favorite browser')]//following::label)[2]")).click();
		driver.findElement(By.xpath("(//h5[contains(text(),'UnSelectable')]/following::label)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h5[contains(text(),'UnSelectable')]/following::label)[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//h5[contains(text(),'Find the default select radio button')]//following::label)[3]")).isSelected());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
