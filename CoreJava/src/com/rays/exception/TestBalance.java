package com.rays.exception;

public class TestBalance {
	public static void main(String[] args) {
		int balance=1000;
		int withdraw=2000;  
		if(withdraw<=balance) {
			System.out.println("Withdraw success");
			
		}else {
			try {
				throw new InsufficiantBalance();
			}catch(InsufficiantBalance e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
