package com.corejava;

import java.util.HashSet;
import java.util.Set;
/**
 * Practical no:21
 * @author Bhavika
 */
public class SetDemo {

	public static void main(String[] args) {
		Set<String> Set = new HashSet<String>();
		Set.add("one");
		Set.add("Two");
		Set.add("Three");
		Set.add("four");
		Set.add("Five");

		System.out.println(Set);
	}

}
