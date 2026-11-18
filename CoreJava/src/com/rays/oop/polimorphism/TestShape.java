package com.rays.oop.polimorphism;

public class TestShape {
	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle();
		s[1] = new Traingle();

		Circle c = (Circle) s[0];
		c.r = 5;
		Traingle t = (Traingle) s[1];
		t.base = 5;
		t.height = 10;

		getArea(s);

	}

	public static void getArea(Shape[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}
