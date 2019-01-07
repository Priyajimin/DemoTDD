package com.java.practise;

public class Inheritance_Example2 extends Inheritance_Example1 {
	//single inheritance
	public void display()
	{
		System.out.println("child class display method");
	}	
	
	public static void main(String[] args) {
		Inheritance_Example2 obj = new Inheritance_Example2();
		obj.print_Example1();
		obj.display();
	}
	
}
