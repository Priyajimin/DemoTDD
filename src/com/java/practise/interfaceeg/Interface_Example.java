package com.java.practise.interfaceeg;

public class Interface_Example implements InterfaceA {

	public void print() {

		System.out.println(x);
	}
	
	public int add(int a)
	{
		int b = a+x;
		return b;
	}
	
	public static void main(String[] args) {
		Interface_Example obj = new Interface_Example();
		obj.print();
		int c = obj.add(6);
		System.out.println(c);
		System.out.println(obj.add(5));
	}
	

}
