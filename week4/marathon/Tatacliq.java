package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// hover to brands
		Actions hoverbrand = new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
		hoverbrand.moveToElement(brand).perform();

		// hover to watch and accessories
		Actions hoverwatch = new Actions(driver);
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		hoverwatch.moveToElement(watch).perform();

		// select the first feature brand
		driver.findElement(By.xpath("//div[@class='DesktopHeader__featureBrands']//following::div")).click();
		// click on sortby
		driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']")).click();
		// select new arrivals
		driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']//following::option[3]")).click();

		// Men category
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
		// WebElement prodprize =
		// driver.findElement(By.xpath("//div[@class='DesktopFooterProductList__productListPrice']"));
		// get the prize in text at console
		Thread.sleep(3000);
		List<WebElement> prodprize = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		String prodprize1 = prodprize.get(0).getText();

		// Set<String> set = new TreeSet<>();
		System.out.print("Prices of all casio watches are : ");
		for (int i = 0; i < prodprize.size()-1; i++) {

			String text = prodprize.get(i).getText();
			
			System.out.print(text);
		}
		Thread.sleep(3000); 

		WebElement clickele = driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]"));
		driver.executeScript("arguments[0].click();", clickele);
		//windowhandles 
		Set<String> cwindow = driver.getWindowHandles();
		List<String> list = new ArrayList<>(cwindow);
		driver.switchTo().window(list.get(1));

		String fprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String substring = fprice.substring(5, 10);
		//String replaceAll = fprice.replaceAll("[^a-zA-Z]+", " ");
		//System.out.println(replaceAll);
		if (prodprize1.equals(substring)) {
			System.out.println("\n" + "Matched");
		}
		else
		{
			System.out.println("\n" + "Not matched");
		}

		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();

		String cartcount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Total cart count is: " + cartcount);

		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();



		File takeshot = driver.getScreenshotAs(OutputType.FILE); 
		File dest = new File("./src/main/java/cart.png"); 
		FileUtils.copyFile(takeshot, dest);		  
		System.out.println("Screenshot taken");
		
		driver.close();
		  driver.switchTo().window(list.get(0)); 
		  System.out.println(driver.getTitle());
		  driver.close();
		 


	}

}

