package mathsPrograms;

import java.util.Scanner;


public class swapNumbers {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please enter the first Number : ");
		int a=new Scanner(System.in).nextInt();
		System.out.println("Please enter the Secand Number : ");
		int b=new Scanner(System.in).nextInt();
		
		System.out.println("Before Swapping : ");
		System.out.println("Value of A is : "+a +"\t Value of B is :"+b);
		System.out.println("----------------------------------------------------");
		swap(a,b);
		
	}

	public static void swap(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping :");
		System.out.println("Value of a is :"+a+"\t  Value of B is : "+b);
		System.out.println("----------------------------------------------------");
	}

}
