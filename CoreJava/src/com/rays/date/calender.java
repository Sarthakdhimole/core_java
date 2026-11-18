package com.rays.date;

import java.util.Date;
import java.util.Calendar;

public class calender {
	public static void main(String[] args) {
		Date d= new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);
		int dayOfYear=cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("day of year="+dayOfYear);
	}

}
