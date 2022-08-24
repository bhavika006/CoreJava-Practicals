package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Practical no : 23 
 * Write a program to Demonstrate Comparable
 * @author Bhavika
 */

public class ComparableDemo {
	public static void main(String[] agrs) {
		List<ComparableMain> laps = new ArrayList<>();
		laps.add(new ComparableMain("Dell", 16, 800));
		laps.add(new ComparableMain("Apple", 8, 1200));
		laps.add(new ComparableMain("Acer", 12, 700));

		Comparator< ComparableMain > com = new Comparator< ComparableMain >() {
			
			public int compare(ComparableMain l1, ComparableMain l2) {
				if (l1.getPrice() > l2.getPrice()) {
					return 1;
				} else {
					return -1;
				}
			}

			public int compare1(ComparableMain o1, ComparableMain o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Collections.sort(laps, com);
		for (ComparableMain l : laps) {
			System.out.println(l);
		}
	}
}