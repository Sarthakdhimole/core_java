package in.co.rays.java;

import java.util.Scanner;

public class primenum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("num is not prime");
		}else {
			System.out.println("num is prime");
		}
		
		
		
		
		}

}
