package mathsPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class SegrigateArray {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		
		System.out.println("Please enter the size of an array:");
		int n=new Scanner(System.in).nextInt();
		int a[]= new int[n];
		
		System.out.println("Please enter the array elements:");
		for (int i = 0; i < n; i++) {
			a[i]=new Scanner(System.in).nextInt();
		}
		
		ArrayList<Integer> alistZero = new ArrayList<Integer>();
		
		ArrayList<Integer> alistOne = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==0) {
				alistZero.add(a[i]);
			}
			else if(a[i]==1) {
				alistOne.add(a[i]);
			}
		}
		
		System.out.println("Number of Zeros in array is :"+alistZero.size());
		System.out.println("Number of Ones in array is :"+alistOne.size());
	}

}
