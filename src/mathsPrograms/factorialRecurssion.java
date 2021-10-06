package mathsPrograms;

import java.util.Scanner;

public class factorialRecurssion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the Number : \t");
		int num=new Scanner(System.in).nextInt();
		int result = factorial(num);
		
		System.out.println("Factorial of Given Number is :"+result);
	}

	private static int factorial(int num) {
		
		if(num==0) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}		
	}
}
