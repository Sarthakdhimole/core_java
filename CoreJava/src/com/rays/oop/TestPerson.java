package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		
		Person ps=new Person();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		
		
		ps.setName("Sarthak");
		ps.setAddress("Sagar");
		ps.setDob(sdf.parse("2002-04-04"));
		
		
		System.out.println(ps.getName());
		System.out.println(ps.getAdress());
		System.out.println(sdf.format(ps.getDob()));
		System.out.println(ps.getAGE());
		ps.
		
		
	}

}
