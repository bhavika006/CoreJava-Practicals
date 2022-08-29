package com.corejava;

/**
 * Practical no :12 
 * Write a program to demonstrate static methods, variables,and blocks.
 * 
 * @author Bhavika
 */
public class StaticMethods {

	// Static variable
	static int var1;
	static String var2;

	// Static method
	static int total = 10;
	static String students = "I am learning";

	// Static block
	static int num;
	static String mystr;

	static {
		num = 91;
		mystr = "Static keyword in java";
	}

	static void myMethod() {

		System.out.println("Var1 is: " + var1);
		System.out.println("Var2 is: " + var2);

		System.out.println("myMethod");
		System.out.println("total:" + total);
		System.out.println("students:" + students);

		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr" + mystr);
	}

	public static void main(String[] args) {
		myMethod();
	}

}
