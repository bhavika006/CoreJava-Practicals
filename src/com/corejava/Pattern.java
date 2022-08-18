package com.corejava;
/**
 * This is a Practical-5
 * Mentioned Pattern.
 * @author  Bhavika
 * @version 1.8
 * @Since   March 2014
*/
public class Pattern {

	public static void main(String[] args) {
		int i,j,row = 6;
		// Outer loop work for rows
		for (i = 0; i < row; i++) {
			// Inner loop work for Space
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
				System.out.println();
		}
	}
}
