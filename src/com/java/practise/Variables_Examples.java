package com.java.practise;

public class Variables_Examples {

	int x=10;
	String y="Instance variable";
	
	static int a=5;
	static String b="Static variable";
	//instance variable
	public void print()
	{
		System.out.println("Instance variable x :" + x);
		System.out.println("Instance variable y :" + y);
	}
	//Static variable
	public static void printing()
	{
		System.out.println("Static variable int a value:" + a);
		System.out.println("static variable string b value:" + b);
	}
	
	public void sum(int a)
	{
		int b = a+10; // local variable
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		//calling static method
		System.out.println("Accessing static method");
		printing();
		
		//calling instance method
		Variables_Examples obj = new Variables_Examples();
		System.out.println("Accessing instance method");
		obj.sum(8);
		System.out.println("Instance variable x: "+obj.x);
		System.out.println("Instance variable y: "+ obj.y);
		
		
		
		
	}
}
