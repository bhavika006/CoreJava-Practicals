package com.corejava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Practical no: 20 
 * Write a program to add string values in the list and print all the values using an iterator.
 * @author Bhavika
 */

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList< String > cars = new ArrayList < > ();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("ford");
		cars.add("mazda");

		Iterator< String > iterator = cars.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}