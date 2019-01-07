package com.java.practise;

public class TwoD_ArrayExample {

	
	public static void main(String[] args) {
		
		int x[][] = {{2,4},{3,5}};
		int y[][] = {{6,8},{7,9}};
		int z[][] = new int[2][2];

		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
				System.out.print(" "+z[i][j]);
			}
		}
		System.out.println("\n");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				z[i][j]=x[i][j]*y[i][j];
			
				System.out.print(" "+z[i][j]);
			}
		}
		
	}
}
