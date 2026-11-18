package com.rays.oop;
import java.util.Date;


public class Person {
	private String name;
	private String address;
	private Date dob;
	private int AGE;
	
	
	
	public void setName(String name) {
		this.name=name;
				}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAdress() {
		return address;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
		
	}
	public Date getDob() {
		return dob;
	}
	
	public int getAGE() {
		Date d=new Date();
		int age=d.getYear()-dob.getYear();
		return age;
	}

}
