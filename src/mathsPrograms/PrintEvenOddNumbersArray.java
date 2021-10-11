package mathsPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintEvenOddNumbersArray {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the size of array : ");
		int n=new Scanner(System.in).nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Please enter the Array Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new Scanner(System.in).nextInt();
		}
		ArrayList<Integer> evenNum = evenNumberslist(arr);
		System.out.println("Even Numbers in given array are :\t "+evenNum);
		
		ArrayList<Integer> oddNum = oddNumberslist(arr);
		System.out.println("Odd Numbers in given array are :\t "+oddNum);
	}

	private static ArrayList<Integer> oddNumberslist(int[] arr) {
		
		ArrayList<Integer> oddlist = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				oddlist.add(arr[i]);
			}
		}
		return oddlist;
		
	}

	private static ArrayList<Integer> evenNumberslist(int[] arr) {
		ArrayList<Integer> evenlist = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evenlist.add(arr[i]);
			}
		}
		return evenlist;
	}

}
