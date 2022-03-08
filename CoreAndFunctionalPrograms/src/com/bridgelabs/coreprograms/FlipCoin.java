package com.bridgelabs.coreprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int number;
		float headPercentage=0, tailPercentage = 0, numberOfHeads = 0, numberOfTails = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times you want to flip the coin....?");
		number = sc.nextInt();
		if(number > 0) {
			for (int i=1; i<=number; i++) {
				float coin = (float) Math.random();
				System.out.println(coin);
				if(coin > 0.5 ){
					numberOfHeads++;
				}else {
					numberOfTails++;
					}
				}
			}else {
			System.out.println("Kindly Enter a Positive Number ......");
			}
			headPercentage = (numberOfHeads/number)* 100;
			tailPercentage = (numberOfTails/number)* 100;
			System.out.println(numberOfHeads);
			System.out.println(numberOfTails);
			System.out.println(" Percentage of head is " +headPercentage + " %");
			System.out.println(" Percentage of tail is " +tailPercentage + " % ");		
			sc.close();
	}

}
