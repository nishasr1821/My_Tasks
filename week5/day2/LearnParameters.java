package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LearnParameters {
		
		public static ChromeDriver driver;
		@Parameters ({"ulink","Username","Password"})
		@BeforeMethod
		public void setuplogin(String url, String uName, String passwrd) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(uName);
			driver.findElement(By.id("password")).sendKeys(passwrd);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			
		}

}
