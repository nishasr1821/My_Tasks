package week1.day2;

public class BrowsersMethod {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");		
				
	}

	public static void main(String[] args) {
		BrowsersMethod nm = new BrowsersMethod();
		System.out.println(nm.launchBrowser("Edge"));
		nm.loadUrl();
		
	}

	
}

