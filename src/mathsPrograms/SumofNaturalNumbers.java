package mathsPrograms;

import java.util.Scanner;

public class SumofNaturalNumbers {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the number limit:");
		int num=new Scanner(System.in).nextInt();
		
		int sum=0;
		sum=num*(num+1)/2;
		
		System.out.println("Sum of Natural given limit  is :"+sum);
	}
}
