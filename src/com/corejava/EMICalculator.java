package com.corejava;

import java.util.Scanner;

/**
 * Practical no:8 
 * Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, and Datatypes
 * .
 * @author Bhavika
 */
public class EMICalculator {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.print("Enter principal:");

		double principal = a.nextFloat(); // Created Object
		System.out.print("Enter rate: ");

		double rate = a.nextFloat();
		System.out.print("Enter time in year:");

		double time = a.nextFloat();
		rate = rate / (12 * 100); // One month interest
		time = time * 12; // One month
		double emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1); // Monthly emi
		System.out.print("Monthly EMI is = " + emi + "\n");
	}

}