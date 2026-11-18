package com.rays.cons;

public class Circle extends Shape {

	private int radius;

	public static void main(String[] args) {
		Circle c = new Circle(5, "Blue", 90);

	}

	public Circle(int borderWidth, String color, int radius) {
		super(borderWidth, color);
		this.radius = radius;
		System.out.println(radius);

	}

}
