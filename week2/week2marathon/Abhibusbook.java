package week2marathon;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibusbook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='search-from']//input")).click();
		driver.findElement(By.xpath("//div[@id='search-from']//input")).sendKeys("chennai");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("banglaore");
		driver.findElement(By.xpath("//div[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//h5[@class='title']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[contains(text(),'Sleeper')]")).click();
		String seat = driver.findElement(By.xpath("//small[text()=' Seats Available']")).getText();
		System.out.println(seat);
		driver.findElement(By.xpath("//button[contains(text(),'Show Seats')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[2]")).click();
		String snum = driver.findElement(By.xpath("(//button[@class='seat sleeper'])[2]")).getText();
		System.out.println(snum);
		
		//System.out.println(driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@class='primary  '])[3]")).click();
			
		String seatsel = driver.findElement(By.xpath("//span[contains(@class,'text-primary')]")).getText();
		System.out.println("Selected Seatnum: " + seatsel);
		
		String fare = driver.findElement(By.xpath("(//span[contains(@class,'text-primary')])[2]")).getText();
		System.out.println("Fare is: " + fare);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}
}
