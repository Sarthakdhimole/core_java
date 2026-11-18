package com.rays.oop.polimorphism;

public class TestBank {
	public static void main(String[] args) {
		Bank [] b=new Bank[3];
		b[2]=new Bank();
		b[0]=new SBI();
		b[1]=new PNB();
		
		for(int i=0;i<b.length;i++) {
			
			System.out.println("Bank Name: "+b[i].getBankName()+" Rate of Interest: "+b[i].RateOfinterest());
		}
		
		
//		Bank b=new Bank();
//		Bank b1=new SBI();
//		Bank b2=new PNB();
//		
//		System.out.println("Bank Name: "+b.getBankName()+" Rate of Interest: "+b.RateOfinterest());
//		System.out.println("Bank Name: "+b1.getBankName()+" Rate of Interest: "+b1.RateOfinterest());
//		System.out.println("Bank Name: "+b2.getBankName()+" Rate of Interest: "+b2.RateOfinterest());
		
		
	}

}
