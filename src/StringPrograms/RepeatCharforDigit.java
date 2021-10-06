package StringPrograms;

/*Repeat the N-1th Charector for N Number of Times*/

public class RepeatCharforDigit {
	
	public static void main(String[] args) {
		String str="A3B5C9";
		char[] charray = str.toCharArray();
		for(char ch:charray) {
			if(Character.isDigit(ch)) {
				int num=Character.getNumericValue(ch);
				for (int i = 0; i < num; i++) {
					System.out.print(str.charAt(str.indexOf(ch)-1));
					System.out.print("\t");
				}
			}
			
		}
		System.out.println("=======================================");
	}

}
