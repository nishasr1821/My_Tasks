package week1.day2;

import java.util.Arrays;

public class Arrayduplicates {
	
    public static void main(String args[])
    {
    	int num[] = {2, 5, 7, 7, 5, 9, 2, 3};  
    	Arrays.sort(num);
        System.out.println(num);
        System.out.println("Below are the duplicates in a given array: ");  
        
        
        for(int i = 0; i < num.length; i++) {  
        	
            for(int j = i + 1; j < num.length; j++) {
            	
                if(num[i] == num[j])  
                    System.out.println(num[j]);  
                
            }
        }
    }
}
