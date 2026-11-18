package com.rays.oop.polimorphism;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public String getColor() {
		return color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void area() {
		System.out.println("There is no area for shape");
	}

}
