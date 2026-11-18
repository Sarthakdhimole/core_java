package com.rays.oop;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile ab= new Automobile();
		
		ab.setColor("Black");
		ab.setMake("BMW");
		ab.setSpeed(300);
		
		
	
		System.out.println(ab.getColor());
		System.out.println(ab.getMake());
		System.out.println(ab.getSpeed());
		ab.applyBreak(ab.getSpeed());
		System.out.println(ab.getaccelator(ab.getSpeed()));
		ab.getChangeGear(5);
	}

}
