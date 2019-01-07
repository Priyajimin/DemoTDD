package com.java.practise.interfaceeg;

public class MethodOverloading_Example {

//Method overloading
int comvalue =10;
	
public void add(int x)
{
	int res= x+comvalue;
	System.out.println(res);
}

public void add(double x,double y)
{
	double z =x+y;
	System.out.println(z);
}
public void add(double z)
{
System.out.println(z);	
}
public static void main(String[] args) {
	MethodOverloading_Example obj = new MethodOverloading_Example();
	obj.add(6);
	obj.add(7.8);
	obj.add(5.6, 7.8);

}
}
