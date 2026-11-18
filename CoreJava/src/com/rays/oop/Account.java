package com.rays.oop;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}

	public double deposit(int amount) {
		balance = balance + amount;
		return balance;

	}

	public double withdrawal(int amount) {
		balance = balance - amount;
		return balance;

	}

	public double payBill(int amount) {
	
		balance=balance-amount;
		return balance;
		}
	

}
