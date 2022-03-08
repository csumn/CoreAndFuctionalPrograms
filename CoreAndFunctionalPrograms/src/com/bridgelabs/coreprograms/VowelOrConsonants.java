package com.bridgelabs.coreprograms;

import java.util.Scanner;

public class VowelOrConsonants {

	public static void main(String[] args) {
		char vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
		Scanner sc = new Scanner(System.in);   
		System.out.print(" Enter a Character:  "); 
		char c = sc.next().charAt(0);   
		System.out.println("You have entered "+c); 
		for(int i=0;i<10;i++)
		{
			if(c==vowel[i]) {
				System.out.println("Its a Vowel");
				System.exit(0);
				}
			}
		System.out.println("Its a Consonant");
		sc.close();
	}
}
