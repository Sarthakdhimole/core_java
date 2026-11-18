package in.co.rays.java;
import java.util.Scanner;

public class elseif {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your marks to know your grade=");
	int marks=sc.nextInt();
	if(marks>=90) {
		System.out.println("your grade is A");
		
	}else if(marks>=80 && marks>90) {
		System.out.println("your grade is B");
		
		
	}else {
		System.out.println("You are failed");
	}
	
	

}
}