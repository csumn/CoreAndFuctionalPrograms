package com.bridgelabs.coreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		int number_1, number_2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		number_1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		number_2 = sc.nextInt();
		
		int remainder = number_1 % number_2 ; 
		System.out.println("Remainder is : " +remainder);
		
		int quotient = number_1/number_2;
		System.out.println("Quotient is : " +quotient);
		sc.close();
	}
}
