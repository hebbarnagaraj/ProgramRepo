package StringPrograms;

import java.util.Scanner;

public class whiteSpaceinString {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the string : ");
		String str=new Scanner(System.in).next();
		
		int countwspace = countwhitespace(str);
		System.out.println("Number of WhiteSpace present in string is :"+countwspace);
		
		String updatedstring = removewhitespace(str);
		
		System.out.println("String after removing whitespace :"+updatedstring);
		
	}

	private static String removewhitespace(String str) {
		
		StringBuffer newstr = new StringBuffer();
		
		char[] chars = str.toCharArray();
		for(char ch:chars) {
			
			if(!Character.isWhitespace(ch)) {
				newstr.append(ch);
			}
		}
		return newstr.toString();
	}

	private static int countwhitespace(String str) {
		
		int wspacecount=0;
		char[] chars = str.toCharArray();
		
		for(char ch:chars) {
			if(Character.isWhitespace(ch)) {
				wspacecount++;
			}
		}
		return wspacecount;
	}

}
