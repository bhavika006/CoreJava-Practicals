package com.corejava;

/**
 * This is a Practical-4
 * Print 1 to 10 Numbers
 * 
 * @author  Bhavika
 * @version 1.8
 * @Since   March 2014
*/
public class WhileloopandDoWhile {

	public static void main(String[] args) {
		int number = 1;
		// Using the while loop
		while (number <= 10) {
			// Print the number 1 to 10
			System.out.println(number);
			number++;
		}
		// For the space
		System.out.println("");
		int number1 = 1;

		do {
			System.out.println(number1);
			number1++;
		}while (number1 <= 10);
	}

}
