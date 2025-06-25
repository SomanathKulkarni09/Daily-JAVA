package com.forloop;

import java.util.Scanner;

public class CheckEven {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println("Even no between "+  a+" & "+b +" = ");
		for(int i=a; i<=b ; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}