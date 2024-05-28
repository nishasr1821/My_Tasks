package week5.day2assignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class W3rundata extends W3cardTestNG{

	
	@Test(dataProvider="getdata")
	public void rundata(String nameOnCard, String cardNumber,String cvv,String fullName, String email, String address,String city,String zip, String state) {
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
        
		driver.findElement(By.name("cardname")).sendKeys(nameOnCard);
		driver.findElement(By.name("cardnumber")).sendKeys(cardNumber);
		driver.findElement(By.name("cvv")).sendKeys(cvv);
		driver.findElement(By.name("firstname")).sendKeys(fullName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("address")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("zip")).sendKeys(zip);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("expmonth")).sendKeys("oct");
		driver.findElement(By.name("expyear")).sendKeys("2018");
	
	}
	
		

@DataProvider(name="getdata")
public String[][] excelData() throws IOException {

	
	//setup the path of workbook
	XSSFWorkbook wb = new XSSFWorkbook("./data/WorkbookW3.xlsx");
	
	//setup wor[ksheet
	XSSFSheet ws = wb.getSheet("carddata");
	
	//to get the row count
	int rowcount = ws.getLastRowNum();
	
	//to get cell count
	int cellcount = ws.getRow(rowcount).getLastCellNum();
	
	//print the row and column
	System.out.println("Total row count is: "+ rowcount);
	System.out.println("Total cell count is: "+ cellcount);
	String[][] data = new String[rowcount][cellcount];
	for (int i = 1; i <= rowcount; i++) {
		for (int j = 0; j < cellcount; j++) {
			
			String values = ws.getRow(i).getCell(j).getStringCellValue();
			 data[i - 1][j] = values;
			System.out.println(values);
			
			
			//wb.close();
		}
	}	
		wb.close();
		return data;
}
}
