package com.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Practical no :25 
 * Write a program to read the data from a myTestFile file.
 * @author Bhavika
 */
public class PracticalNo25 {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\LENOVO\\Documents\\myTestFile.txt");
		Scanner scan = new Scanner(file);
		System.out.println(scan.nextLine());
	}

}
