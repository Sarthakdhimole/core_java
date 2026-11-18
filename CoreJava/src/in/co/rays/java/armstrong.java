package in.co.rays.java;
import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. to check is it armstrong or not=");
		int n=sc.nextInt();
		int temp=n;
		int r=0;
		int x=0;
		while(n>0) {
			r=n%10;
			x=(x+(r*r*r*r));
			n=n/10;
			
		}if(x==temp) {
			System.out.println("Give no. is armsstrong");
		}else {
			System.out.println("No. is invalid");
		}
		
	}
}
