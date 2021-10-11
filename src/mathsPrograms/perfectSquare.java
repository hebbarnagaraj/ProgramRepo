package mathsPrograms;

import java.util.Scanner;

public class perfectSquare {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the Number:");
		
		int n=new Scanner(System.in).nextInt();
		
		if(isperfectSqure(n)) {
			System.out.println("Number is perfect Square");
		}
		else {
			System.out.println("Number is not perfect Square");
		}
		
	}

	private static boolean isperfectSqure(int n) {

		for (int i = 1; i*i <=n ; i++) {
			
			if(n%i==0 && n/i==i) {
				return true;
			}
		}
		return false;
	}

}
