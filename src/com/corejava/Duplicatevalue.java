package com.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Practical no : 22
 * Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”, ”A”, ”C”, ”E”, ”E”, ”E”) and remove duplicate values of the list
 * @author Bhavika
 */

public class Duplicatevalue {

	public static void main(String[] args) {
		List< String > trip = new ArrayList< String >();

		trip.add("Saputara");
		trip.add("Manali");
		trip.add("Chennai");
		trip.add("Dubai");
		trip.add("Greece");
		trip.add("Greece");
		trip.add("Saputara");
		trip.add("Saputara");
		trip.add("Dubai");

		Set< String > enjoy = new HashSet< String >(trip);
		trip.clear();
		trip = new ArrayList< String >(enjoy);
		for (Object ls : trip){
			System.out.println("Resulting output---------" + ls);
		}
	}

}
