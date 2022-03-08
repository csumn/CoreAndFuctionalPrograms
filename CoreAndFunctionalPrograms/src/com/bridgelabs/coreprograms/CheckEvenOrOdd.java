package com.bridgelabs.coreprograms;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println("The number you have entered is Even number ...");
		}
		else
			System.out.println("Its an Odd Number..");
		sc.close();
	}
}
