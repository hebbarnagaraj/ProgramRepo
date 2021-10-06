package StringPrograms;

import java.util.Scanner;

//Reverse a String

public class ReverseString {
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		System.out.println("Please enter the String: ");
		String str = new Scanner(System.in).next();
		System.out.println("Entered String is : "+str);
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reveresed String is :"+rev);
		
		if(rev.equals(str)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}
}
