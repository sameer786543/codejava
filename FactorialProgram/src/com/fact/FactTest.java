package com.fact;

public class FactTest {
	public static void main(String[] args) {

		int number = 6;
		int result=fact(number);
		System.out.println("Factorial is="+result);
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		


	}

	 public static int fact(int num) {
		 
		 if(num==1||num==0)
		 {
			 return 1;
		 }
		return num * fact(num - 1);
	}
}
