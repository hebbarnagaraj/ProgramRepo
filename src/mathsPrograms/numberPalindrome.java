package mathsPrograms;

import java.util.Scanner;

public class numberPalindrome {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the Number : ");
		int num=new Scanner(System.in).nextInt();
		int temp=num;
		
		int reverseNumber = reverseNumber(temp);
		
		if(reverseNumber==num) {
			System.out.println("Number is palindrome:");
		}
		else {
			System.out.println("Number is not palindrome:");
		}
	}

	private static int reverseNumber(int num) {
		
		int rem,rev=0;
		
		while(num!=0) {
			rem=num%10;
			num/=10;
			rev=rev*10+rem;
		}
		return rev;
	}

}
