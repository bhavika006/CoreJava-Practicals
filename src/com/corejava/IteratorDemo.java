package com.corejava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Practical no: 20
 * Write a program to add string values(“Hello”,”world”,”$yourname” etc.) in the list and print all the values using an iterator.
 * @author Bhavika
 */
public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList cars = new ArrayList();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("ford");
		cars.add("mazda");

		Iterator iterator = cars.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
