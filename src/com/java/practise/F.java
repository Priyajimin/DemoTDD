package com.java.practise;

import java.util.Scanner;

class F {
	public void fact() {
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int res = 1;
		for (int i = 1; i <= a; i++) {
			res = res * i;
		}
		System.out.println("the factorial of the given num" + res);
	}

	public static void main(String args[]) {
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		
		F obj = new F();
		obj.fact();

	}

	
}
