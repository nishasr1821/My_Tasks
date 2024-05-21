package week3.day1assignments;

public class CustomButton extends TextField{
	
	public void clickCheckButton() {
		System.out.println("clickCheckButton -> From CustomButton class");

	
	}
	
	public static void main(String[] args) {
		CustomButton cus = new CustomButton();
		cus.getText();
		
		
	}

}
