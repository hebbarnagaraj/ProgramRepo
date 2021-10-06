package mathsPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the lenght of array :");
		int n=new Scanner(System.in).nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Please enter the array Elements :");
		for (int i = 0; i < n; i++) {
			arr[i]=new Scanner(System.in).nextInt();
		}

		Arrays.sort(arr);

		System.out.println("Please enter the Key Element to find :");
		int key=new Scanner(System.in).nextInt();

		int result = binarySearchmethod(arr,key);
		result++;
		if(result!=-1) {
			System.out.println("Key Element is found at location \t:"+result);
		}
		else {
			System.out.println("Key Element not found !");
		}
	}

	private static int binarySearchmethod(int[] arr, int key) {
		
		int low=0, high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high) {
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else  {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		return -1;
	}

}
