package com.program.s3.core.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamProgram {

	public static void main(String[] args) {
		
		// To read data from a source

		File ob = new File("C:\\Users\\jayar\\OneDrive\\Desktop\\ICICI Bank\\AccountStatement-24-25.txt");

		try {

			FileInputStream fis = new FileInputStream(ob);

			int i;  // range(0 to 255)
			while ((i = fis.read()) != -1) {   // -1 = End Of File 
				System.out.print((char) i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
