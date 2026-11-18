package com.rays.oop;

public class Railway {

	private int reservationId;
	private String passengerName;
	private int trainNum;
	private String seatNum;
	private double ticketPrice;

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;

	}
	
	public int getReservationId() {
		return reservationId;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;

	}
	
	public String getPassengerName() {
		return passengerName;
	}
	
	public void setTrainNum(int trainNum) {
		this.trainNum=trainNum;
		
	}
	public int getTrainNum() {
		return trainNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum=seatNum;
	}
	public String getSeatNum() {
		return seatNum;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice=ticketPrice;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	
	
	

}
