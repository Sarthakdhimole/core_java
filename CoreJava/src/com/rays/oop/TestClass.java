package com.rays.oop;

public class TestClass {
	public static void main(String[] args) {
		
	
	
	
	Food fd=new Food();
	fd.setOrderId(1025);
	fd.setCustomerName("Sarthak");
	fd.setFoodItem("Garam Samosa Idli Ya Dosa");
	fd.setQuantity(2);
	fd.setTotalAmount(1450.25);
	
	System.out.println(fd.getOrderId());
	System.out.println(fd.getCustomerName());
	System.out.println(fd.getFoodItem());
	System.out.println(fd.getQuantity());
	System.out.println(fd.getTotalAmount());

}}
