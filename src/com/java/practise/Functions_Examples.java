package com.java.practise;

public class Functions_Examples {
	int d;
	
	public static int add(int a , int b)
	{
		int c= a+b;
		return c;
	}

	public void sub(int x,int y)
	{
		d= x-y;
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		
		int i = add(4,6);
		System.out.println(i);
		int j = Functions_Examples.add(9, 10);
		System.out.println(j);
		

		Functions_Examples f = new Functions_Examples();
		f.sub(7, 2);
		int c=f.add(3, 9);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
	}
}
