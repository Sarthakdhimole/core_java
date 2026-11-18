package com.rays.inher;

public class circle extends shape{
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	
	public void areaOfCircle() {
		System.out.println(3.14*radius*radius);
	}
	
	
	

}
