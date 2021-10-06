package mathsPrograms;

import java.util.Scanner;

public class factorialNumber {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		 System.out.println("Please enter the Number : \t");
		 
		 int num=new Scanner(System.in).nextInt();
		 int fact=1;
		 
		 for (int i = 1; i <=num; i++) {
			
			 if(num==0) {
				 System.out.println(fact);
				 break;
			 }
			 else {
				 fact=fact*i;
			 }
		}
		 System.out.println("Factorial of Number is : "+fact);
	}

}
