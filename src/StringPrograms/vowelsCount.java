package StringPrograms;

import java.util.Scanner;

public class vowelsCount {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the String : \t");
		
		String str=new Scanner(System.in).next();
	
		int vcount = countvowels(str);
		
		System.out.println("Number of Vowels Present in String is :"+vcount);
	}

	private static int countvowels(String str) {
		
		@SuppressWarnings("unused")
		int vowelcount=0 , conccount=0;
		
		char[] chars = str.toCharArray();
		
		for(char ch:chars) {
			char lowerch = Character.toLowerCase(ch);
			switch(lowerch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': vowelcount++;
			default : conccount++;
			}
		}
		return vowelcount;
	}

}
