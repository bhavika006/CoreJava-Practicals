package com.corejava;

/**
 * Practical no:8 Apply EMI Calculator in Java - Java program to calculate EMI
 * using Class, Object, Variables, Operators, and Datatypes.
 * 
 * @author Bhavika
 */
class Calculation {

	public Calculation(float amount, float rate, float time) {
		rate = rate / (12 * 100); // One month interest
		time = time * 12; // One month period
		// program will calculate amount of emi.
		float emi = (amount * rate * (float) Math.pow(1 + rate, time)) / (float) (Math.pow(1 + rate, time) - 1);
		System.out.println("Monthly EMI is = " + emi);
	}

}

public class EmiCalculator {

	public static void main(String[] args) {
		float amount = 2000;
		float rate = 30;
		float time = 1;

		Calculation emi = new Calculation(amount, rate, time); // Object
	}

}