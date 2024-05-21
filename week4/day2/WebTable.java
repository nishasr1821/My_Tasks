package week4.day2;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("txtStationFrom")).click();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		
		driver.findElement(By.id("txtStationTo")).click();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
	
	
		List<WebElement> traincolumnList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		Set<String> set = new TreeSet<>();
		for (WebElement alltrainname : traincolumnList) {
			String text = alltrainname.getText();
			set.add(text);
		}
		System.out.println(traincolumnList.size());
		System.out.println(set.size());
		System.out.println(set);
		
	if (traincolumnList.size()!=set.size()) {
		System.out.println("Duplicates present");
	}else {
		System.out.println("No Duplicates");
	}
	
	driver.quit();
	}
	
}
