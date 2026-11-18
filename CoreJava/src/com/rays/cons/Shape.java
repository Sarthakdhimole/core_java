package com.rays.cons;

public class Shape {
	
	private int boderWidth;
	private String color;
	
	public Shape() {
		System.out.println("This is default constructor");
	}
	
	public Shape(int borderWidth) {
		this();//to call uper wala cons....
		this.boderWidth=boderWidth;
		System.out.println(boderWidth);
	}
	
	public Shape(int borderWidth,String color) {
		this(borderWidth);
		this.color=color;
		System.out.println(color);
	}
	
	
	
	

}
