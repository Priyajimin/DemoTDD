package com.java.practise;
//Multilevel inheritance
public class Inheritance_Example3 extends Inheritance_Example2 {

	public void multilevel()
	{
		System.out.println("Multi level inheritance");
	}
	
	public static void main(String[] args) {
		Inheritance_Example3 obj = new Inheritance_Example3();
		obj.print_Example1();
		obj.display();
		obj.multilevel();
				
	}
}
