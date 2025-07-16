package com.classroompractice;

import java.util.Scanner;

public class MainStudent {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Stdenet ID :");
		int ID =sc.nextInt();
		sc.nextLine();                                    // after the next int we have to take new line
		System.out.println("Enter Stdenet Name :");
		String name = sc.nextLine();

		System.out.println("Enter Stdenet Course :");
		String course = sc.nextLine();

		System.out.println("Enter Stdenet Percentage :");
		double per = sc.nextDouble();
		
		Student s=new Student(ID, name, course, per);
		s.studDetails();

	}

}
