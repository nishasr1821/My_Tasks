package week1.day1;

public class Operators {
	public static void main(String[] args) {
		
		int x= 5;
		int y= 50;
		
		System.out.println("Sum is: " + (x+y) + "\n" + "Sub is: " + (x-y) + "\n" + "mul is: " +  
		(x*y) + "\n" + "div is: " + (x/y) + "\n" + "mod div is: " + (x%y) + "\n");
		
		System.out.println(x==y);
		
		int a=5;
		int b=5;
		System.out.println((a!=b) + "\n\n");
		
		System.out.println("Is y > b: " + (y > b));
        System.out.println("Is x < y: " + (x < y)); 
        System.out.println("Is a>=x: " + (a>=x));
        System.out.println("Is x<=y: " + (x<=y));
        System.out.println("Is this condition x > a && y<b true: " + (x > a && y<b));  
        System.out.println("Is any one condition of x > a || y<b true: " + (x > a || y<b)); 
        
        System.out.println("Do a++: " + (a++)); 
        System.out.println("what is 'a' now: " + (a));
        
        System.out.println("do ++b: " + (++b)); 
        System.out.println("what is 'b' now: " + (b));
        System.out.println("do x--: " + (x--)); 
        System.out.println("what is 'x' now: " + (x));
        
        System.out.println("do --y: " + (--y)); 
        System.out.println("what is 'y' now: " + (y));
	}

}
