package com.java.practise;

public class Constructors_Examples {

	// creating default constructor

	Constructors_Examples() {
		this(6, "Constructor chaining");
		System.out.println("Default constructor");
	}

	// creating parameterized constructor

	Constructors_Examples(int a) {
				System.out.println("single parameterized constructor : " + a);
	}

	// creating parameterized constructor

	Constructors_Examples(int a, String b) {
		// Constructor chaining
		this(7);
		System.out.println("Constructor chaining");
		System.out.println("Parameterized constructor -- Integer value :" + a + " String value:" + b);
	}

	public static void main(String[] args) {

		Constructors_Examples d = new Constructors_Examples();
		Constructors_Examples c = new Constructors_Examples(8);
		Constructors_Examples e = new Constructors_Examples(5, "Priya");

	}
}
