package mathsPrograms;

import java.util.Scanner;

public class fibonacciSeries {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Please enter the limit:");
		int limit =new Scanner(System.in).nextInt();
		int a=0,b=1,c;
		for(int i=0;i<limit;i++) {
			if(i==0) {
				System.out.print(a);
				System.out.print("\t");
			}
			else if(i==1) {
				System.out.print(b);
				System.out.print("\t");
			}
			else {
				c=a+b;
				System.out.print(c);
				System.out.print("\t");
				a=b;
				b=c;
			}
		}
		
	}

}
