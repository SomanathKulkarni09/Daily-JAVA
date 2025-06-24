package com.classroompractice;

public class EvenOdd {
	
	public void evenOdd(int num) {
		
		if(num%2==0 && num != 0) {
			System.out.println("Number is Even");
		}else if(num%2 != 0 ){
			System.out.println("Number is Odd");
		}else {
			System.out.println("number is zero");
		}
	}

}
