package com.rays.oop;

public class Exam {
	private int examId;
	private String subject;
	private int totalQues;
	private int duration;
	private int totalMarks;
	
	public void setExamId(int examId) {
		this.examId=examId;
	}
	public int getExamId() {
		return examId;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setTotalQues(int totalQues) {
		this.totalQues=totalQues;
	}
	public int getTotalQues() {
		return totalQues;
	}
	
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks=totalMarks;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	
}
