package com.corejava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Practical no : 22
 * Write a program to prepare the list like and remove duplicate values of the list.
 * 
 * @author Bhavika.
 */
public class DuplicateValue {

	public static void main(String[] args) {
		List<String> trip = new ArrayList<String>();
		trip.add("Saputara");
		trip.add("Manali");
		trip.add("Chennai");
		trip.add("Dubai");
		trip.add("Greece");
		trip.add("Greece");
		trip.add("Saputara");
		trip.add("Saputara");
		trip.add("Dubai");

		Set<String> set = new LinkedHashSet<String>(trip); // Not repetitive

		System.out.println("Resulting output---------" + set); // Output
	}

}
