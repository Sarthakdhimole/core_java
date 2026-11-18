package com.rays.comprater;

public class StudentCom implements Comparable<StudentCom> {
	private int id;
	private String name;
	private int age;
	
	public StudentCom(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public int compareTo(StudentCom o) {
		
		return this.name.compareTo(o.name);
	}

}
