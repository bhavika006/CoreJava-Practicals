package com.corejava;

/**
 * This is a Practical-7 
 * Pass two integer parameters and apply any mathematical formula.
 * 
 * @author Bhavika
 * @version 1.8
 * @Since March 2014
 */
public class Constructors {

	public Constructors() {
		System.out.print("Hello");
	}

	public Constructors(int number1, int number2) {
		System.out.println("Total Sum is " + (number1 + number2));
	}

	public static void main(String[] args) {
		Constructors myObj = new Constructors(); // Created Object
		Constructors secondConstructor = new Constructors(10, 20);
	}

}