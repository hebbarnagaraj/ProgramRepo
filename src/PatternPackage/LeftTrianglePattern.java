package PatternPackage;

/*
      *
     **
    ***
   ****
  *****
 ******
 
 */
import java.util.Scanner;

public class LeftTrianglePattern {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the limit:");
		int n=new Scanner(System.in).nextInt();
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
