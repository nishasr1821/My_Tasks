package week6.marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SuperClass {
	
	public static ChromeDriver driver;
	public String fileName;
	
	@Parameters ({"ulink","Username","Password"})
	@BeforeMethod
	public void preCondition(String url, String uName, String passwrd) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(passwrd);
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		WebElement opptab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opptab);
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
	@DataProvider(name="getdata")
	public String[][] sendData() throws IOException {
      return  ReadExcel.readData(fileName);
	}
}

	 


