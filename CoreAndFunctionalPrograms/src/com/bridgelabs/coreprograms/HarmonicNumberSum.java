package com.bridgelabs.coreprograms;

import java.util.Scanner;

public class HarmonicNumberSum {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		for (double i = 1; i <= n ; i++) {
			sum = sum +1/i;
		}
		System.out.println(sum);
		sc.close();
	}
}
