package mathsPrograms;

import java.util.Scanner;


public class primeNumber {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the Number :");
		int num = new Scanner(System.in).nextInt();
		
		if(isPrime(num)) {
			System.out.println("Given Number is Prime:");
		}
		else {
			System.out.println("Given Number is not Prime:");
		}
		
	}

	private static boolean isPrime(int num) {
		if(num==0 || num==1) {
			return false;
		}
		else if(num==2) {
			return true;
		}
		
		for (int i = 2; i < num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
		
	}

}
