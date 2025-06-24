package com.program.java.dsa;

import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamMatrixMultiplication {

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

		IntStream.range(0, 3).forEach(i -> IntStream.range(0, 3)
				.forEach(j -> result[i][j] = IntStream.range(0, 3).map(k -> matrix1[i][k] * matrix2[k][j]).sum()));

		System.out.println("Result of matrix multiplication");

		for (int row[] : result) {

			for (int value : row) {

				System.out.print(value + " ");

			}
			System.out.println();

		}

		sc.close();

	}

}
