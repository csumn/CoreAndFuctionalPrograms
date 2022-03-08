package com.bridgelabs.coreprograms;

public class PowerOf2 {

	public static void main(String[] args) {
		int exponent =Integer.parseInt(args[0]);
		int powerOf2 = 1;
		for(int i=1; i<=exponent; i++)
		{
			powerOf2 = powerOf2 * 2;   
			System.out.println(powerOf2);
		}
	}
}
