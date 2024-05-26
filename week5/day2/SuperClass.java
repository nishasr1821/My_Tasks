package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class SuperClass {
	
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
	
	/*
	 * @Test public void runCreateLead() {
	 * 
	 * driver.findElement(By.linkText("Leads")).click();
	 * driver.findElement(By.linkText("Create Lead")).click();
	 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	 * driver.findElement(By.name("submitButton")).click();
	 * System.out.println("CreateLead"); driver.close(); throw new
	 * RuntimeException(); }
	 * 
	 * @Test(dependsOnMethods="week5.day2.SuperClass.runCreateLead") public void
	 * runDeleteLead() throws InterruptedException {
	 * 
	 * driver.findElement(By.linkText("Leads")).click();
	 * driver.findElement(By.linkText("Find Leads")).click();
	 * driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 * driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 * Thread.sleep(2000); String leadID = driver.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	 * driver.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	 * driver.findElement(By.linkText("Delete")).click();
	 * driver.findElement(By.linkText("Find Leads")).click();
	 * driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); String
	 * text = driver.findElement(By.className("x-paging-info")).getText(); if
	 * (text.equals("No records to display")) { System.out.println("Text matched");
	 * } else { System.out.println("Text not matched"); }
	 * System.out.println("DeleteLead"); driver.close(); }
	 * 
	 * @Test(dependsOnMethods={"week5.day2.SuperClass.runCreateLead",
	 * "week5.day2.SuperClass.runDeleteLead"}) public void runEditLead() throws
	 * InterruptedException {
	 * 
	 * driver.findElement(By.linkText("Leads")).click();
	 * driver.findElement(By.linkText("Find Leads")).click();
	 * driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 * driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 * Thread.sleep(2000); driver.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	 * driver.findElement(By.linkText("Edit")).click();
	 * driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	 * driver.findElement(By.name("submitButton")).click();
	 * System.out.println("EditLead"); driver.close(); }
	 */

}
