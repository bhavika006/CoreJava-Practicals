package com.corejava;

import java.util.HashSet;
import java.util.Set;

/**
 * Practical no:21 
 * Write another program using Set concepts.
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
	}

}
