package com.java.practise;

import java.util.Scanner;

public class Pal {

	public void Palin() {
		System.out.println("Enter a word:");
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		int len = text.length();
		String reverse = "";
		
		for(int i= len-1 ;i>=0;i--)
		{
			 reverse = reverse + text.charAt(i);
			 
		}
		
		boolean res = text.equals(reverse);
		if(res)
		{
		System.out.println("Enterd string is palindrome ");
		}
		else
		{
			System.out.println("Enter string is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		Pal p = new Pal();
		p.Palin();
		
		
	}

}
