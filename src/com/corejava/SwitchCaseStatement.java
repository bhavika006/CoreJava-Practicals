package com.corejava;

/**
 * This is a Practical-3
 * To Find The Current Month Name from The Given Number Of The Switch Case.
 * @author  Bhavika
 * @version 1.8
 * @Since   March 2014
*/
public class SwitchCaseStatement {

	public static void main(String[] args) {
		int month = 7;

		// Using the switch command
		switch (month) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				// The Current Month Name Printed
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break; 
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("Octomber");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
		}
  }
}
