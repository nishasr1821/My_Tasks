package week3.day1;

public class overriding extends Overloading {
	
	public void reportStep(String msg, String status) {
		System.out.println("Showing overiding: " + " " + msg + " " + status);

	}
	
	public static void main(String[] args) {
		overriding ovrid = new overriding();
		ovrid.reportStep("Message opens", "stopped");
		
	}

}
