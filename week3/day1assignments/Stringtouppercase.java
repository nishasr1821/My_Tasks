package week3.day1assignments;

public class Stringtouppercase {
	
	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++)
			if (i % 2 != 0) {
				
				System.out.print(Character.toUpperCase(charArray[i]));
				
			}
		
		  else { 
			  System.out.print(charArray[i]); 
		  }
		 
			}
		
	}


