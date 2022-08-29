package com.corejava;

/**
 * Practical No : 10 Create programs of all the string methods like charAt(),
 * concat(), equals() etc.
 * 
 * @author Bhavika
 */
public class StringMethod {

	public static void main(String[] args) {
		String stringObject = new String("QDEV is Quality Development Technolab.");

		System.out.println("Orignal is..." + stringObject);
		System.out.println("Length is..." + stringObject.length());
		System.out.println("Uppercase is... " + stringObject.toUpperCase());
		System.out.println("Lowercase is... " + stringObject.toLowerCase());
		System.out.println("Substring is... " + stringObject.substring(2));
		System.out.println("Substring is... " + stringObject.substring(2,4));
		System.out.println("Char at is... " + stringObject.charAt(2));
		System.out.println("Compare is " + stringObject.compareTo("QDEV is Quality Development Technolab"));

		// Check the equalsIgnoreCase uses if / else condition
		if (stringObject.equalsIgnoreCase("QDEV is Quality Development Technolab.")) {
			System.out.println("Stirng are equals");		
		} else {
			System.out.println("Stirng are not equals");
		}
	}

}

