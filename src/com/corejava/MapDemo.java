package com.corejava;

import java.util.HashMap;
/**
 * Practical no : 21
 *  Write another program using Map 
 *  @author Bhavika
 */
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Bhavika");
		map.put(1001, "Chirag");
		map.put(1002, "Gopi");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
