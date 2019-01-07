package com.java.practise;

public class Sample {

	private int age;
	private String name;
	private int accountNo;
	private int mobno=98868756;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 18)
		{
			System.out.println("You are not eligible to create an account");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getmobno()
	{
		return mobno;
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.setAccountNo(4567899);
		s.setAge(19);
		s.setName("Priya");
	System.out.println(s.getAccountNo());
	System.out.println(s.getAge());
	System.out.println(s.getName());
	System.out.println(s.getmobno());
		
	}
	
}
