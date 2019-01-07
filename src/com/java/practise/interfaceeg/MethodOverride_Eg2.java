package com.java.practise.interfaceeg;

public class MethodOverride_Eg2 extends MethodOverride_Eg1{

	public void autostart()
	{
		System.out.println("Auto start is newly available");
	}
	
	public void start()
	{
		System.out.println("Kicker start is also availabe");
	}
	
	public static void main(String[] args) {
		MethodOverride_Eg2 obj = new MethodOverride_Eg2();
		obj.autostart();
		obj.start();
	}
}
