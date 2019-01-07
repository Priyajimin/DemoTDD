package com.java.practise.interfaceeg;

import com.java.practise.packeg.*;

public class Package_Example extends Mypack {
	
	public static void main(String[] args) {
		Package_Example obj = new Package_Example();
		obj.disp();
		Package p = Package.getPackage("java.lang");
		System.out.println(	p.getName());
		System.out.println(	p.getImplementationVersion());
	}

}
