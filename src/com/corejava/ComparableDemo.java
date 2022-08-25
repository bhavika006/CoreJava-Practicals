package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Practical no : 23 
 * Write a program to Demonstrate Comparable
 *
 * @author Bhavika
 */
public class ComparableDemo {

	public static void main(String[] agrs) {
		List<ComparableMain> laptopList = new ArrayList<>();
		laptopList.add(new ComparableMain("Dell", 16, 800));
		laptopList.add(new ComparableMain("Apple", 8, 1200));
		laptopList.add(new ComparableMain("Acer", 12, 700));

		Comparator<ComparableMain> computerList = new Comparator<ComparableMain>() {

			public int compare(ComparableMain l1, ComparableMain l2) {

				if (l1.getPrice() > l2.getPrice()) {
					return 1;
				} else {
					return -1;
				}
			}

			public int compare1(ComparableMain o1, ComparableMain o2) {
				return 0;
			}
		};

		Collections.sort(laptopList, computerList);
		for (ComparableMain l : laptopList) {
			System.out.println(l);
		}
	}

}