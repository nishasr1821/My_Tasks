package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class AmazonActionClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search with oneplus 9 pro in searchbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		Thread.sleep(3000);
		//Get the price of the first product in search list
		WebElement firstprodprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
		//get the prize in text at console
		String prodprice = firstprodprice.getText();
		System.out.println("Price of the first product search: " + prodprice);
		
		//Move to the ratings element by mousehover
		
		
		/*
		 * WebElement elscrolldwn = driver.findElement(By.
		 * xpath("//span[text()='Check each product page for other buying options.']"));
		 * Actions act = new Actions(driver);
		 * act.scrollToElement(elscrolldwn).perform();
		 * System.out.println("Page Scrolling to: " + elscrolldwn.getText());
		 * 
		 * 
		 * 
		 * WebElement mousehover = driver.findElement(By.
		 * xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro']"));
		 * Actions hover = new Actions(driver);
		 * hover.moveToElement(mousehover).perform();
		 */
		  
		  WebElement text = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-2-5 aok-align-bottom'])[1]/span"));
		  System.out.println("Ratings for the product is: " + text.getText());
		 

		//click on the first product
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')]")).click();
		Thread.sleep(3000);
		Set<String> cwindow = driver.getWindowHandles();
		List<String> list = new ArrayList<>(cwindow);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle()+"\n");
		Thread.sleep(3000);
		
		/*
		 * //click the first product link WebElement clickele =
		 * driver.findElement(By.xpath("//span[@class='a-button-text']"));
		 * driver.executeScript("arguments[0].click();", clickele);
		 */
		
		//take screenhsot
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/main/java/week4/marathon/amazon.png"); 
		FileUtils.copyFile(screenshot, dest);		  
		System.out.println("Screenshot taken\n");
		
		//add to cart click
		driver.findElement(By.id("add-to-cart-button")).click();
	
		System.out.println("Item added to cart\n");
		Thread.sleep(3000);
		
		//get cart subtotal
		/*
		 * WebElement carttotal = driver.findElement(By.xpath(
		 * "//span[@id='attach-accessory-cart-total-string']/b")); String total =
		 * carttotal.getText();
		 */
		
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		
		String substring = subTotal.substring(1,7);
		System.out.println("price of the added item is: " + substring);
		
		//verify the price matches
		if(prodprice.equals(substring))
		{
			System.out.println("Price is same");
		}
		else
		{
			System.out.println("Price is Not same");
		}
	
		
		driver.quit();
		
	
		
}
}
