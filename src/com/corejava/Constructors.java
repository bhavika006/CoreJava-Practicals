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

	int bhavika;
	// Parameterized constructor
	public Constructors(int y) {
		bhavika = y;
	}

	public static void main(String[] args) {
		Constructors myObj = new Constructors(10); // Created Object
		System.out.println(myObj.bhavika);
	}

}