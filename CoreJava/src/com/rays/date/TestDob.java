package com.rays.date;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class TestDob {
	public static void main(String[] args) {
		try {
			String dob="2002-04-29";
			System.out.println("DOB="+dob);
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date dobDate=sdf.parse(dob);
			System.out.println("DOB in date format="+dobDate);
			
			// Calculate age
			Calendar dobCalendar = Calendar.getInstance();
			dobCalendar.setTime(dobDate);
			
			Calendar today = Calendar.getInstance();
			
			int age = today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
			
			// Check if birthday has occurred this year
			if(today.get(Calendar.MONTH) < dobCalendar.get(Calendar.MONTH) || 
			   (today.get(Calendar.MONTH) == dobCalendar.get(Calendar.MONTH) && 
				today.get(Calendar.DATE) < dobCalendar.get(Calendar.DATE))) {
				age--;
			}
			
			System.out.println("Today's Date="+sdf.format(today.getTime()));
			System.out.println("Your Age="+age+" years");
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
