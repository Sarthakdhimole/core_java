package com.rays.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(0,"Sarthak");
		li.add(1,"Rohit");
		li.add(2,"Alok");
		li.add(3,"Shree");
		System.out.println("list="+li);
		
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();   
		}
		
	}

}
