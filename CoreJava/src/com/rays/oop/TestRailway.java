package com.rays.oop;

public class TestRailway {
	public static void main(String[] args) {
		Railway Rl=new Railway();
		
		Rl.setReservationId(1239213);
		Rl.setPassengerName("Sarthak");
		Rl.setTrainNum(77105);
		Rl.setSeatNum("SideLower");
		Rl.setTicketPrice(1800.00);
		
		System.out.println(Rl.getReservationId());
		System.out.println(Rl.getPassengerName());
		System.out.println(Rl.getTrainNum());
		System.out.println(Rl.getSeatNum());
		System.out.println(Rl.getTicketPrice());
		
		
	}

}
