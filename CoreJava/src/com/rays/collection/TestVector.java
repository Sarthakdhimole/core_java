package com.rays.collection;

//it is growable array of objects which is synchronized and implements list interface and random access interface

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(0, 1);
		v.add(1, "sarthak");
		System.out.println(v.elementAt(1));
	}

}
