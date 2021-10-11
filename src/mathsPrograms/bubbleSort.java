package mathsPrograms;

import java.util.Scanner;

public class bubbleSort {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the size of an array:");
		int n=new Scanner(System.in).nextInt();
		int a[]= new int[n];
		
		System.out.println("Please enter the array elements:");
		for (int i = 0; i < n; i++) {
			a[i]=new Scanner(System.in).nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		
		System.out.println("Array after sorting:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}

}
