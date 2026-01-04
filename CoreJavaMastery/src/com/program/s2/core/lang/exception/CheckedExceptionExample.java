/**
 * 
 */
package com.program.s2.core.lang.exception;

import java.io.File;
import java.io.FileReader;

// Checked Exception(compile time) - IOException , SQLException 
public class CheckedExceptionExample {

	public static void main(String[] args) {

		try {

			File file = new File("test.txt");
			FileReader reader = new FileReader(file);
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File not found or error reading file");
		}

	}

}
