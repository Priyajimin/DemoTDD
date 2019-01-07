package com.java.practise;

import java.util.Scanner;

public class Loops_Examples {

	public static void main(String[] args) {
		int x = 0;
		int y;
		Scanner s = new Scanner(System.in);
		/*
		 * System.out.println("For loop example"); for( int i =0;i<10;i++) {
		 * System.out.println(i); }
		 * 
		 * do { System.out.println("Enter your age : "); y = s.nextInt();
		 * if(y>=18) System.out.println("You are eligible to vote"); else
		 * System.out.println("You are not allowed to vote"); }while(y<18);
		 */
		// System.out.println("Enter the mug of water: ");
		// x = s.nextInt(); //5
		/*int tankwaterhold = 20;
		int temptankwaterqant = 0;
		
		while(x<=tankwaterhold)
		{
			System.out.println("Enter the mug of water: " );
			x=s.nextInt();
			if(temptankwaterqant <= tankwaterhold)
				temptankwaterqant +=x;
			if(temptankwaterqant >= tankwaterhold)
			{
				System.out.println("You cannot fill more in the tank since it is filled");
			}
			else
				System.out.println("You can fill more water to the tank");
			System.out.println("Tank is holding the "+temptankwaterqant+ " mug of water");
			
		}*/
		
		int tankwaterhold = 20;
		int temptankwaterqant = 0;
		
		do
		{
			System.out.println("Enter the mug of water: " );
			x=s.nextInt();
			if(x<=tankwaterhold)
			if(temptankwaterqant <= tankwaterhold)
				temptankwaterqant +=x;
			if(temptankwaterqant >= tankwaterhold)
			{
				System.out.println("You cannot fill more in the tank since it is filled");
			}
			else
				System.out.println("You can fill more water to the tank");
			System.out.println("Tank is holding the "+temptankwaterqant+ " mug of water");
			
		}while(temptankwaterqant<=tankwaterhold);
	}

}
