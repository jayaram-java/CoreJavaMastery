package com.program.s3.core.io.file;

import java.io.File;
import java.io.IOException;

public class FileHandlingProgram {

	public static void main(String[] args) {

		// An abstract representation of file and directory pathnames.

		File ob = new File("C:\\Users\\jayar\\OneDrive\\Desktop\\ICICI Bank\\AccountStatement-24-25.txt");

		try {

			if (ob.createNewFile()) {
				System.out.println("File " + ob.getName() + " is created successfully.");
			} else {
				System.out.println("File is already exist in the directory");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

// SSH File Transfer protocol(SFTP) is a secure way to transfer files between computers over an ssh connection.

// connect to sftp servers to fetch images

// mobile app -> temeos quantum/kony fabric -> java integration service -> sftp server