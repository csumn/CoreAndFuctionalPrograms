package com.bridgelabs.coreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year, count=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the year ....");
		year = obj.nextInt();
		int temp_num = year;
		while(temp_num!=0) {
			temp_num = temp_num/10;
			count++;
		}
		if (count == 4) {
			if((year%4 == 0) && year % 100 != 0 || (year % 400 == 0))
				System.out.println("The above Year is a Leap year ");
			else 
				System.out.println("Its not a Leap Year");
		}else
			System.out.println("Enter a Valid year to check!");
		obj.close();
	}
}
