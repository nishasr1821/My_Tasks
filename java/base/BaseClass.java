package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;
//	public static Properties prop;
	
	@BeforeMethod
	public void preCondition() throws IOException {
		
		//with multi lingual test
		
//		FileInputStream fils = new FileInputStream("src\\test\\resources\\config.en.properties");
//		prop = new Properties();
//		prop.load(fils);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();

	}
	
	 @DataProvider(name="getdata")
	   public String[][] sendData() throws IOException {
	      return ReadExcel.readData(fileName);

}
}
