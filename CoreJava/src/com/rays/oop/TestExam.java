package com.rays.oop;

public class TestExam {
	public static void main(String[] args) {
		
		Exam ex=new Exam(); 
		
		ex.setExamId(21);
		ex.setSubject("Java");
		ex.setTotalQues(25);
		ex.setDuration(2);
		ex.setTotalMarks(20);
		
		
		System.out.println(ex.getExamId());
		System.out.println(ex.getSubject());
		System.out.println(ex.getTotalQues());
		System.out.println(ex.getDuration());
		System.out.println(ex.getTotalMarks());
	}

} 
