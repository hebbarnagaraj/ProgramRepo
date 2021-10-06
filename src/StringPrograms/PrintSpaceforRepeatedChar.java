package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class PrintSpaceforRepeatedChar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please enter the String : \t");
		
		String str=new Scanner(System.in).next();
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		char[] chararry = str.toCharArray();
		
		for(char ch:chararry) {
			if(map.containsKey(ch)) {
				map.put(' ', map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map.keySet());
		
	}
}
