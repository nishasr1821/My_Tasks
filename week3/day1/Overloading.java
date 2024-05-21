package week3.day1;

public class Overloading {
	
	public void reportStep(String msg, String status) {
		System.out.println("Showing : " + " " + msg + " " + status);

	}
	
	public void reportStep(String msg, String status, boolean snap ) {
		System.out.println("Showing: " + " " + msg + " " + status + " " + snap);
		
	}
	
	public static void main(String[] args) {
		Overloading ov = new Overloading();
		ov.reportStep("message opens,", "stayed");
		ov.reportStep("message opens,", "stayed,", true);
	}

}
