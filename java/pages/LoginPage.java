package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	
	public LoginPage enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;

	}
	public LoginPage enterPassowrd(String Pword) {
		driver.findElement(By.id("password")).sendKeys(Pword);
		return this;
	}
	public WelcomePage clickLoginButton() {

		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}

}
