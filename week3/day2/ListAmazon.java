package week3.day2;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAmazon {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();

			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
			List<WebElement> priceList = driver.findElements(By.className("a-price-whole"));
			System.out.println("The mobiles listed : "+ priceList.size());
			
			/*
			 * WebElement ele = priceList.get(3); System.out.println(ele.getText()); //
			 * declare a list
			 */	
			List<String> mob = new ArrayList<String>();
			
			for (WebElement each : priceList) {
				String txt = each.getText();
				mob.add(txt);
			
				
			}
			System.out.println("Prices are listed: " + mob);
				//Collections.sort(mob);
				driver.quit();
			
			
	}

}
