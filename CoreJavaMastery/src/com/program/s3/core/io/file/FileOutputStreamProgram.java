package com.program.s3.core.io.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram {

	public static void main(String[] args) {
		
		// To write data to a file destination.

		File ob = new File("C:\\Users\\jayar\\OneDrive\\Desktop\\ICICI Bank\\AccountStatement-24-25.txt");

		String content = "It has financial year 24-25 transaction details. Please check.";

		byte[] data = content.getBytes();

		try {
			FileOutputStream fos = new FileOutputStream(ob);

			fos.write(data);

			System.out.println("Data inserted successfully.");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
