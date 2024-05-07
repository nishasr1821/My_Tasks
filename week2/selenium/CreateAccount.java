package week2.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement eleUsername = driver.findElement(By.id("username"));

		eleUsername.sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("decorativeSubmit")).click();			
		driver.findElement(By.partialLinkText("SFA")).click();			
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Testleafacc");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select sec2 = new Select(industryDD);
		sec2.selectByValue("IND_SOFTWARE");

		WebElement ownerDD = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(ownerDD);
		own.selectByVisibleText("S-Corporation");

		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select src = new Select(sourceDD);
		src.selectByValue("LEAD_EMPLOYEE");

		WebElement marketDD = driver.findElement(By.id("marketingCampaignId"));
		Select mrkt = new Select(marketDD);
		mrkt.selectByIndex(6);

		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st = new Select(stateDD);
		st.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();

		System.out.println(driver.getTitle());
	}



}

