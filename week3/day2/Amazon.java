package week3.day2;

public class Amazon extends CanaraBank implements Payments{

	public void cashOnDelivery() {
		System.out.println("COD avaialble  -> from Payments interface");
		
	}

	public void upiPayments() {
		System.out.println("UPI avaialble  -> from Payments interface");
		
	}

	public void cardPayments() {
		System.out.println("Card pay available  -> from Payments interface");
		
	}

	public void internetBanking() {
		System.out.println("Netbanking available -> from Payments interface");
		
	}
	
	/*
	 * @Override public void recordPaymentDetails() {
	 * System.out.println("Payments on UPI -> from Amazon concrete Class"); }
	 */
	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.cardPayments();
		az.internetBanking();
		az.upiPayments();
		az.cashOnDelivery();
		az.recordPaymentDetails();
	}

}
