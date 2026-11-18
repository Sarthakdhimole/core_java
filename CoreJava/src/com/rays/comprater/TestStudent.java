package com.rays.comprater;

public class TestStudent {
	public static void main(String[] args) {
		
		StudentCom s1=new StudentCom(1,"Sarthak",22);
		StudentCom s2=new StudentCom(2,"Rohit",21);
		StudentCom s3=new StudentCom(3,"Alok",23);
		
		int i=s1.compareTo(s2);
		
		if(i==0) {
			System.out.println("Both are equal");
		}else if(i>0) {
			System.out.println("s1 is greater than s2");
		}else {
			System.out.println("s2 is greater than s1");
		}
	}

}
