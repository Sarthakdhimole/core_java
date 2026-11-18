package com.rays.date;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormating {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("before format="+d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yy");
		String formateDate=sdf.format(d);
		System.out.println("after format="+formateDate);
		
	}

}
  