package com.classroompractice;

public class Student {

	int studID;
	String studName;
	String course;
	double percentage;

	public Student(int studID, String studName, String course, double percentage) {
		this.studID = studID;
		this.studName = studName;
		this.course = course;
		this.percentage = percentage;
	}

	public void studDetails() {

		System.out.println("========Student Details============");
		System.out.println("Student ID : " + studID);
		System.out.println("Student Name : " + studName);
		System.out.println("Student Course : " + course);
		System.out.println("Student Percentage : " + percentage);
		System.out.println("Student Grade : " + findGrade() );

	}
	
	public String findGrade() {
		
		
		if (percentage<=100 && percentage >=90) {
			return "A";
		}else if (percentage<=89 && percentage >=80) {
			return "B";
		}else if (percentage<=79 && percentage >=70) {
			return "C";
		}else if (percentage<=69 && percentage >=60) {
			return "D";
		}else if (percentage<=59 && percentage >=50) {
			return "E";
		}else {
			return "Fail";
		}
			
		
		
		
	}
	

}
