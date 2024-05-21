package week4.day1assignments;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String pwindow = driver.getWindowHandle();
		System.out.println("Parent window handle : "+ pwindow);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();			
		driver.findElement(By.partialLinkText("SFA")).click();	
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();	
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();	
		driver.findElement(By.xpath("//div[@class='subSectionBlock']//following::a")).click();	
		//pass
		
		//switch to window
		Set<String> cwindow = driver.getWindowHandles();
		List<String> list = new ArrayList<>(cwindow);
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//a[@class='linktext']")).click();	
		//pass
		
		driver.switchTo().window(list.get(0));
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::a")).click();
		
		Set<String> c1window = driver.getWindowHandles();
		List<String> list1 = new ArrayList<>(c1window);
		driver.switchTo().window(list1.get(1));
	
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[2]//a")).click();
		//pass
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Alert message says: "+ simpleAlert.getText());
		simpleAlert.accept();
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}

}
