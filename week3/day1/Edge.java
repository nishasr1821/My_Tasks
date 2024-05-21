package week3.day1;

public class Edge extends safari{
	
	public void takeSnap() {
		System.out.println("take snap -> From edge class");
		

	}

	public void clearCookies() {
		System.out.println("clearCookies -> From edge class");
		

	}
	
	public static void main(String[] args) {
		Edge ed = new Edge();
		System.out.println("Browser version is: " + ed.browserVersion);
		System.out.println("Browser version is: " + ed.browserName);
		ed.clearCookies();
		ed.closeBrowser();
		ed.fullScreenMode();
		ed.readerMode();
		ed.navigateBack();
		ed.takeSnap();
		ed.openURL();
		
	}
}
