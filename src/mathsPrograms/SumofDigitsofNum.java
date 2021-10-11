package mathsPrograms;

import java.util.Scanner;

public class SumofDigitsofNum {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the number :");
		int num=new Scanner(System.in).nextInt();
		int temp=num;
		int sum=0;
		
		while(temp!=0) {
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		
		System.out.println("Sum of digits if number is :"+sum);
	}

}
