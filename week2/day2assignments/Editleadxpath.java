package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editleadxpath {
	public static void main(String[] args) {
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();

		WebElement eleUsername = driver.findElement(By.id("username"));

		eleUsername.sendKeys("Demosalesmanager");
		// enter the password in the password field using **attribute based xpath**
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// doing implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Click on the Login button using **partial attribute**
		driver.findElement(By.xpath("//input[contains(@class, 'Submit')]")).click();

		// click crmsfa link using **partial text based xpath**
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();

		// click Leads link using **index based xpath**
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[1]")).click();

		// click CreateLead Link using **partial text text based xpath**
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyName')]")).sendKeys("TestLeaf");

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nishanthi");

		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Nisha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[contains(@id,'createLeadForm_description')]")).sendKeys("Selenium Automation tester");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryEmail')]")).sendKeys("nishasr.1821@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryPhoneNumber')]")).sendKeys("8072795767");
		
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st = new Select(stateDD);
		st.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[contains(@id,'updateLeadForm_description')]")).clear();
		driver.findElement(By.xpath("//textarea[contains(@id,'updateLeadForm_importantNote')]")).sendKeys("Description cleared");
		driver.findElement(By.xpath("(//input[contains(@class,'smallSubmit')])[1]")).click();
		System.out.println(driver.getTitle());
	}



}
