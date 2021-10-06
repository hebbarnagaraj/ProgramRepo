package mathsPrograms;

import java.util.Scanner;

public class findDublicateinArray {
	
	@SuppressWarnings({ "resource", "null" })
	public static void main(String[] args) {
		
		System.out.println("Please enter the length of an array:");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Please enter the array elements :");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=new Scanner(System.in).nextInt();
		}
		System.out.println("Duplicate Elements in Array are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(+arr[j]+"\t");
				}
			}
		}
		
		
	}

}
