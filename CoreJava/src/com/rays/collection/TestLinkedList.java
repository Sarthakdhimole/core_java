package com.rays.collection;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList ld=new LinkedList();
		ld.add(0,1);
		ld.add(1,"ram");
		System.out.println(ld);
		
		ld.set(0, "sarthak");
		System.out.println(ld);
	}

}
