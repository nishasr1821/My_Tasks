package week3.day1assignments;

public class LoginTestData extends TestData {
	public void enterUsername() {
		String userName = "Nithisha";
		
		System.out.println(userName);
		

	}
	public void enterPassword() {
		String passWord = "N@12345";
		System.out.println("Password is: " + passWord);
	}

	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		login.navigateToHomePage();
	}
}
