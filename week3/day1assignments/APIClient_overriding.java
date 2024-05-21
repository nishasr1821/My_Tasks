package week3.day1assignments;


public class APIClient_overriding extends APIClient {
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Showing: " + endpoint + " , " + requestBody + " and " + requestStatus + " from sendRequest method using overriding");
	}
	
	public static void main(String[] args) {
		APIClient_overriding overid = new APIClient_overriding();
		overid.sendRequest("Endpoint2", "requestBody2", false);
	}
}
