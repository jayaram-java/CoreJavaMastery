package com.program.java.dsa;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int matrix1[][] = new int[3][3]; // array declaration

		int matrix2[][] = new int[3][3];

		int result[][] = new int[3][3];

		System.out.println("Enter elements for the first 3x3 matrix:");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print("matrix1[" + i + "][" + j + "]: ");

				matrix1[i][j] = sc.nextInt();
			}

		}

		System.out.println("Enter elements for the second 3x3 matrix:");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print("matrix2[" + i + "][" + j + "]: ");

				matrix2[i][j] = sc.nextInt();
			}

		}

		// multiply the matrices

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		// Display the result

		System.out.println("Result of matrix multiplication: ");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(result[i][j] + " ");

			}
			System.out.println();
		}

		sc.close();

	}

}
