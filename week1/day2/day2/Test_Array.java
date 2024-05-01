package week1.day2;

import java.util.Arrays;

public class Test_Array {
	public static void main(String[] args) {
		
		int[] nums = {19,29,5,21,7,60,57}; 
		Arrays.sort(nums);	
		System.out.println("Sorted array is: ");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("\nArrays 4th element is: " + nums[4]);
		System.out.println("\nArray length is: " + nums.length);
		System.out.println("\nArrays first element is: " + nums[0]);
		System.out.println("\nArrays last element is: " + (nums[nums.length-1]));
		
	}
	
}
