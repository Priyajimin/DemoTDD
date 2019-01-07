package com.java.practise;

import java.util.Scanner;

public class Fibo {

	public void add(int a, int b) {
		int res = a + b;
		System.out.println("add of integers" + res);
	}

	public void add(double a, double b) {
		double c = a + b;
		System.out.println("add of double: " + c);

	}
	public static void main(String[] args) {
		Fibo f = new Fibo();
		f.add(6.6, 9.8);
		f.add(4, 5);
	}
}
