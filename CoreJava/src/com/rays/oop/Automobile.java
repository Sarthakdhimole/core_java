package com.rays.oop;

public class Automobile {

	private String color;
	private String make;
	private int speed;
	public static final int NO_OF_GEAR = 6;
	public int gear;

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setMake(String make) {
		this.make = make;

	}

	public String getMake() {
		return make;
	}

	public void setSpeed(int speed) {
		this.speed = speed;

	}

	public int getSpeed() {
		return speed;
	}

	public void applyBreak(int speed) {
		if (speed >= 80)

		{
			speed = 0;
			System.out.println("Break applied");
		} else {
			System.out.println("speed is on 0km/h");
		}

	}

	public int getaccelator(int speed) {

		speed = speed + 20;
		return speed;
	}

	public void getChangeGear(int gear) {
		if (gear >= 1 && gear < 6) {
			gear = gear + 1;
			System.out.println("gear increasing");
		} else if (gear == 6) {
			System.out.println("Bike is on top gear");
		} else {
			System.out.println("invalid gear ");
		}

	}

}
