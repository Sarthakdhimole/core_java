package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setNumber("35079113458");
		ac.setBalance(2000.0);
		ac.setAccountType("current");

		System.out.println(ac.getNumber());
		System.out.println(ac.getBalance());
		System.out.println(ac.getAccountType());
		System.out.println(ac.deposit(2000));
		System.out.println(ac.withdrawal(750));
		System.out.println(ac.payBill(1200));
	}

}
