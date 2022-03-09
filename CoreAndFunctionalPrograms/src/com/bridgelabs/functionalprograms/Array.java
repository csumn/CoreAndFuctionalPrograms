package com.bridgelabs.functionalprograms;

import java.util.Scanner;

public class Array {
	public static void main(String[] args)  {
		int row, col;
		int arr[][];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of row : ");
		row = sc.nextInt();
		System.out.print("Enter the total number of column : ");
		col = sc.nextInt();
		arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
				arr[i][j] = sc.nextInt();
			}
		}
			System.out.println("You have entered the following array : ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j] + " ");			}
				System.out.println();
			}
			sc.close();
		}
	}

