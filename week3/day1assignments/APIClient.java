package week3.day1assignments;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Showing : " + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Showing: " + endpoint + " , " + requestBody + " and " + requestStatus + " from sendRequest 2nd method");
	}
	
	public static void main(String[] args) {
		APIClient sndreq = new APIClient();
		sndreq.sendRequest("Endpoint from sendRequest 1st method");
		sndreq.sendRequest("Endpoint", "requestBody", true);
	}
}
