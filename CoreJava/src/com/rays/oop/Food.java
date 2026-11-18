package com.rays.oop;

public class Food {
	private int orderId;
	private String customerName;
	private String foodItem;
	private int quantity;
	private double totalAmount;
	
	
	
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setFoodItem(String foodItem) {
		this.foodItem=foodItem;
		}
	public String getFoodItem() {
		return foodItem;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount=totalAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	
	

}
