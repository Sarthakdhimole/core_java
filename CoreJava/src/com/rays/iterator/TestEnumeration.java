package com.rays.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(0, "apple");
		v.add(1, "banana");
		v.add(2, "mango");
		v.add(3, "grapes");
		
		System.out.println("vector="+v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
