package mathsPrograms;

import java.util.Scanner;

public class LargestElement_Array {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please enter the array size:");
		
		int n=new Scanner(System.in).nextInt();
		
		System.out.println("Please enter the array Elements:");
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			arr[i]=new Scanner(System.in).nextInt();
		}
		int max=arr[0];
		
		for (int i = 0; i < n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Element in array is :\t "+max);
	}

}
