package mathsPrograms;

import java.util.Random;
import java.util.Scanner;

public class randomAlphaNumStringGeneration {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the length:");
		int targetLength=new Scanner(System.in).nextInt();
	
		String randstr = createRandomAlphaNumString(targetLength);
		
		System.out.println("Random String is :"+randstr);
	}

	private static String createRandomAlphaNumString(int targetLength) {
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toLowerCase();
		
		Random rand = new Random();
		StringBuffer strbff = new StringBuffer();
		
		for (int i =0; i<targetLength; i++) {
			
			strbff.append(str.charAt(rand.nextInt(str.length())));
		}
		String ranStr = strbff.toString();
		return ranStr;
	}
}
