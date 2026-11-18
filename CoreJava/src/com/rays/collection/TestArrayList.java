package com.rays.collection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(0,1);
		al.add(1,"ram");
		al.add(2,4);
		al.set(0,"sarthak");
		al.remove(0);
		
		System.out.println(al.get(0));
		
		System.out.println(al.get(1));
		
		
		
	}

}
