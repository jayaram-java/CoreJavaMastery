package com.program.s5.dsa;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = new int[10]; // array declaration

		Scanner sc = new Scanner(System.in); //used to read input during execution

		System.out.println("Enter values ");

		for (int k = 0; k < 10; k++) {

			a[k] = sc.nextInt(); // a[0] = 1

		}

		System.out.println("Elements of original array");

		for (int i = 0; i < 10; i++) {

			System.out.print(a[i] + " ");

		}

		// 20 35 45 125 10 25 70 80 110 145 

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) { // a[0] < a[1]

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		System.out.println();

		System.out.println("Ascending order");

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}

	}

}
