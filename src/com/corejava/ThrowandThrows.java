package com.corejava;
/**
 * Practical no : 18
 * throw, and throws keywords.
 * @author Bhavika
 */

public class ThrowandThrows {
	static void checkAge(int age) {
		if (age < 28) {
			throw new ArithmeticException("You are 28year old");
		}
		else {
			System.out.println("You are old enough");
		}
	}
public static void main(String[] args) {
		checkAge (15);
	}
}
