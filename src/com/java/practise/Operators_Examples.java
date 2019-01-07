package com.java.practise;

public class Operators_Examples {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		boolean c = true;

		// Unary operators
		System.out.println("Unary Operators");
		System.out.println(a++);// 2
		System.out.println(++b);// 6
		System.out.println((~a));// -4
		System.out.println(!c);// false

		// Arithmetic operators
		System.out.println("Arithmetic operator");
		System.out.println(a + b);// 9
		System.out.println(b - a);// 3
		System.out.println(b * a);// 18
		System.out.println(b / a);// 2
		System.out.println(b % a);// 0

		// Relational Operator
		System.out.println(a > b);// false
		System.out.println(b < a);// false
		System.out.println(a = b);// 6
		System.out.println(a == b); // true
		System.out.println(a >= b);// true
		System.out.println(b <= a);// true
		System.out.println(a != b);// false

		// Tenary Operator
		System.out.println((a < b) ? a : b); // 6
		System.out.println("Value of A:" + a);
		System.out.println("Value of B:" + b);

		// Logical Operator
		if ((a < b) && (b > a)) {
			System.out.println("B is greater than A");
		} else {
			System.out.println("A is greater than B");// prints
		}

		if ((a > 0) || (a > 1)) {
			System.out.println("A is greater than 1"); // prints
		} else {
			System.out.println("A is not greater than 1");
		}
		
		String s1 ="Rain";
		String s2 = "bow";
		//Using concatenation operator
		String s3= s1+s2;
		System.out.println("Using concatenation operator");
		System.out.println(s3);//Rainbow
		
		//Using concat() method
		System.out.println("Using concat() method");
		System.out.println(s1.concat(s3));//RainRainbow
	}
}
