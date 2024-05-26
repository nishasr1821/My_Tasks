package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class servicenow {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://dev200784.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("k6C8-ajUWqY%");
		driver.findElement(By.id("sysverb_login")).click();
		
		Thread.sleep(9000);
		//Click on "All."
		Shadow dom = new Shadow(driver);
		WebElement eleclick = dom.findElementByXPath("//div[@class='starting-header-zone']/div[2]/div[1]");
		eleclick.click();
		
		//search for service catalog
		Thread.sleep(2000);
		WebElement texteleme = dom.findElementByXPath("//label[text()='All filter navigator']/following-sibling::input");
		texteleme.sendKeys("Service Catalog");
		
		//Click on "Service Catalog."
		Thread.sleep(2000);
		WebElement textFind = dom.findElementByXPath("//mark[text()='Service Catalog']");
		textFind.click();
		
		//switch to frame to select mobiles
		Thread.sleep(2000);
		WebElement findFrame = dom.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(findFrame);
		
		
		//click on mbiles
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//click on apple iphone 13 pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		//choose the fields
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		driver.findElement(By.xpath("//span[text()='What was the original phone number?']/following::input[2]")).sendKeys("9876543210");
		WebElement datallowance = driver.findElement(By.xpath("//span[text()='Monthly data allowance']/following::select"));
        Select select = new Select(datallowance);
        select.selectByIndex(2);
        
        driver.findElement(By.id("oi_order_now_button")).click();
        //order status
      WebElement orderstatus = driver.findElement(By.xpath("//div[@id='sc_order_status_intro_text']//span"));
      System.out.println("Status of the order is: " + orderstatus.getText());
      //request number
      WebElement requestNumber = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']/b"));
      System.out.println("Request Number : "+requestNumber.getText());	
      
      //get screenshot
      
      File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./src/main/java/week4/marathon/ServiceNoworder.png");
		FileUtils.copyFile(screenshotAs, desc);
		
		driver.close();
		
}
}
