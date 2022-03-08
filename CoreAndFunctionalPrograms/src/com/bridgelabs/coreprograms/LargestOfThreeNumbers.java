package com.bridgelabs.coreprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the value first number:");
		int a=obj.nextInt();
		
        System.out.println("Enter the value Second number:");
		int b=obj.nextInt();
		
        System.out.println("Enter the value Third number:");
		int c=obj.nextInt();
		
		obj.close();
		
		if(a>=b&a>=c) {
			System.out.println(a + " is Largest");
		}
		else if(b>=c) {
			System.out.println(b +" is Largest");
		}
		else {
			System.out.println(c +" is Largest");
		}
		obj.close();
	}
}
