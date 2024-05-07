package week2.day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(By.id("u_0_0_Jm")).click();
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.findElement(By.name("firstname")).sendKeys("Nishanthi");
		driver.findElement(By.name("lastname")).sendKeys("V");
		driver.findElement(By.name("reg_email__")).sendKeys("nishasr.1821@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Nithisha@21");
		
		WebElement DayDD = driver.findElement(By.id("day"));
		Select day = new Select(DayDD);
		
		day.selectByVisibleText("21");
		
		WebElement MonthDD = driver.findElement(By.id("month"));
		Select month = new Select(MonthDD);
		
		month.selectByIndex(6);
		
		WebElement YearDD = driver.findElement(By.id("year"));
		Select year = new Select(YearDD);
		
		year.selectByValue("1995");
		
		/*
		 * WebElement industryDD = driver.findElement(By.linkText("Male")); Select sec2
		 * = new Select(industryDD); sec2.selectByIndex(2);
		 */
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		System.out.println(driver.getTitle());
		
	}
	
	

}
