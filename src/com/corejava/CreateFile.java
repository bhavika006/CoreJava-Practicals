package com.corejava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Practical no:24
 * Write a program to create a text file and add your personal details to the test file.
 * @author Bhavika
 *
 */

public class CreateFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("First name is Bhavika");
			myWriter.write("Second Name is Jiyani");
			myWriter.close();
			System.out.println("Personal Details ");
			
		} catch (IOException e) {
			System.out.println("An error");
			e.printStackTrace();
		}
	}

}
