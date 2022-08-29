package com.corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Practical no:21 
 * Write another program using Set concepts.
 * 
 * @author Bhavika
 */
public class SetDemo {

	public static void main(String[] args) {
		Set< String > animal = new HashSet< String >();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Cow");
		animal.add("Rat");
		animal.add("Cat");

		System.out.println(animal);
		Iterator<String> animalIterator = animal.iterator();

		while (animalIterator.hasNext()) {
			System.out.println(animalIterator.next()); // All HashSet Value print.
		}
	}

}
