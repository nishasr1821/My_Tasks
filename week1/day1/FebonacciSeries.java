package week1.day1;

public class FebonacciSeries {
	public static void main(String[] args) {
		int n = 8;
		int v1 = 0, v2 = 1,nt;
		System.out.println("Fibonacci series for given range is: ");
		for (int i = 0; i < n; i++) {
			System.out.println(v1);
			nt = v1 + v2;
		    v1 = v2;
		    v2 = nt;
		}
		    
	}

}
