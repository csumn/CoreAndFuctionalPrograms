package com.bridgelabs.functionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values for a, b and c in a quadratic equation a*x*x + b*x +c = 0 ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		float delta = (b * b) - (4 * a * c);
		float root1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
		float root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("The two roots of the Equation are : " + root1 + " and " + root2);
	}
}
