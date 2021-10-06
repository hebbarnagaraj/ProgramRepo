package mathsPrograms;

import java.util.Scanner;

public class armstrongNumber {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the Number: ");
		int num=new Scanner(System.in).nextInt();
		int temp=num;
		
		int digits = numberofDigits(temp);
		int sum = amstrongNumber(temp,digits);
		if(sum==num) {
			System.out.println("Number is amstrong Number:");
		}
		else {
			System.out.println("Number is not amstrong Number");
		}
		
	}

	private static int numberofDigits(int temp) {
		int digitscount=0;
		while(temp!=0) {
			temp/=10;
			digitscount++;
		}
		return digitscount;
				
	}

	private static int amstrongNumber(int temp, int digits) {
		int sum=0,rem = 0;
		
		while(temp!=0) {
			rem=temp%10;
			sum+= Math.pow(rem, digits);
			temp/=10;
		}
		
		return sum;
		
	}
}
