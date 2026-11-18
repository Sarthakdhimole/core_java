package com.rays.oop.polimorphism;

public class Traingle extends Shape {
	
	 int base;
	 int height;
	
	public void area() {
		System.out.println("Area of Traingle is= " + (0.5 * base * height));
	}

}
