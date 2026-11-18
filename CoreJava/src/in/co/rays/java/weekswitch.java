package in.co.rays.java;
import java.util.Scanner;

public class weekswitch {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Day=");
		String day=sc.next();
		switch(day) {
		case"monday":
			System.out.println("Day 1 of week");
			break;
		case"tuesday":
			System.out.println("Day 2 of week");
			break;
		case"wednesday":
			System.out.println("Day 3 of week");
			break;
		case"thursday":
			System.out.println("Day 4 of week");
			break;
		case"friday":
			System.out.println("Day 5 of week");
			break;
		case"saturday":
			System.out.println("Day 6 of week");
			break;
			
		default:
			System.out.println("Ajj Sunday hai!");
		
		
		
		}
		
		
		
	}

}
