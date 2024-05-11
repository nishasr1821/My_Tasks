package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnxpath {
	public static void main(String[] args) {
		// Launch the chrome browser
					ChromeDriver driver = new ChromeDriver();
					// Load the url -> get() -> Load a new web page in the current browser window
					driver.get("http://leaftaps.com/opentaps/control/main");
					// to maximize the window
					driver.manage().window().maximize();
					// Locate the username text field
					WebElement eleUsername = driver.findElement(By.id("username"));
					// perform the action on the WebELement
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
					// enter the company name
					driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyName')]")).sendKeys("TestLeaf");
					// enter the firstname
					driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nishanthi");
					// enter the lastname
					driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
					// locate the source dropdown
					WebElement sourceDD = driver.findElement(By.xpath("//select[(@id='createLeadForm_dataSourceId')]"));
					// Instantiate the Select class
					Select sec = new Select(sourceDD);
					// To select the Direct Mail dropdown options use Select class methods
					sec.selectByIndex(3);
					// To select the Car and Driver option inside Market Campaign dropdown
					WebElement marketDD = driver.findElement(By.xpath("//select[(@id='createLeadForm_marketingCampaignId')]"));
					Select sec1 = new Select(marketDD);
					sec1.selectByVisibleText("Car and Driver");
					// To select by using value 
					WebElement industryDD = driver.findElement(By.xpath("//select[(@id='createLeadForm_industryEnumId')]"));
					Select sec2 = new Select(industryDD);
					sec2.selectByValue("IND_MEDIA");
					System.out.println(driver.getTitle());
	}
	
	

}
