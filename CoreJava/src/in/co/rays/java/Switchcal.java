package in.co.rays.java;
import java.util.Scanner;
public class Switchcal {
	public static void main(String[]args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first digit=");
		int a=sc.nextInt();
		System.out.println("Enter second digit=");
		int b=sc.nextInt();
		System.out.println("Enter your opr like=+,-,*,/");
		String opr=sc.next();
		
		
		switch(opr) {
		case"+":
			System.out.println("sum of two digits:-"+(a+b));
			break;
		case"-":
			System.out.println("diff of two digits:-"+(a-b));
			break;
		case"*":
			System.out.println("multiple of two digits:-"+(a*b));
			break;
		case"/":
			System.out.println("remindr of two digits:-"+(a/b));
			
		
		
		
		}
		
		
		
		
	}

}
