package com.java.practise;

public class Array_Example {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 10 };
		int[] b = { 1, 3, 5, 7, 9 };
		int c[] = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
			System.out.print(" " + c[i]);
		}
		System.out.println();
		System.out.println("Multiplication");
		for(int i=0;i<b.length;i++)
		{
			c[i]=a[i]*b[i];
			System.out.print(" "+c[i]);
		}
	}

}
