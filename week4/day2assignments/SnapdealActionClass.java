package week4.day2;

import java.time.Duration;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActionClass {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Move to mens fashion by mouse hover
		WebElement mousehover = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions hover = new Actions(driver);
		hover.moveToElement(mousehover).perform();

		//select sports wear and click
		WebElement text = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		System.out.println("Selected item is: " + text.getText());
		text.click();

		//to get the list of shoes count
		List<WebElement> listofshoes = driver.findElements(By.xpath("//p[@class='product-title']"));
		Set<String> set = new TreeSet<>();
		for (WebElement eachprodcount : listofshoes) {
			String items = eachprodcount.getText();
			set.add(items);
		}
		System.out.println("Total Shoes listed: " + listofshoes.size());
		System.out.println("count added in set: " + set.size());

		Thread.sleep(3000);
		
		//click training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//sort the product with low to high
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
		//verify the sort happend correctly
		List<WebElement> listofitems = driver.findElements(By.className("product-tuple-image"));
        
        for (int i = 0; i < listofitems.size() - 1; i++) {
        	int j=i+1;
            WebElement currentPrice = listofitems.get(i).findElement(By.xpath("//span[@class='lfloat product-price']"));
            WebElement nextPrice = listofitems.get(j).findElement(By.xpath("//span[@class='lfloat product-price']"));
            String replace1 = currentPrice.getText().replace("Rs. ", "").replace(",", "");
            String replace2 =  nextPrice.getText().replace("Rs. ", "").replace(",", "");
            
            int intprice1=Integer.parseInt(replace1);
			int intprice2=Integer.parseInt(replace2);
			
            if (intprice1 > intprice2) {
            	
            	System.out.println("Displayed items are sorted correctly.");              
            }
            else {
            	
            	 System.out.println("Displayed items are not sorted correctly.");
            }
        }
		
		

		//driver.quit();



	}
}
