package week3.day1assignments;

public class RadioButton extends CustomButton {
	
	public void selectRadioButton() {
		System.out.println("selectRadioButton -> From RadioButton class");

	}
	
	public static void main(String[] args) {
		RadioButton rad = new  RadioButton();
		rad.clickCheckButton();
		
	}

}
