package com.corejava;
/**
 * Practical no : 18
 * Write a program to handle exceptions using try, catch, finally, throw, and throws keywords.
 * @author Bhavika
 */

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int[] myNumber = {1,2,3};
			System.out.println(myNumber[10]);
		}
		catch (Exception e) {
			System.out.println("Something is wrong");
		}
		finally {
			System.out.println("The try catch is finished");
		}
	}
}
