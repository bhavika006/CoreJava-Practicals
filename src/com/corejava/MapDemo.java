package com.corejava;

import java.util.HashMap;
import java.util.Map.Entry;

/**Practical no : 21
 * Write another program using Map 
 *
 * @author Bhavika
 */
public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> details = new HashMap<Integer, String>();
		details.put(100, "Bhavika"); // Key and value
		details.put(1001, "Chirag");
		details.put(1002, "Gopi");

		for (Entry<Integer, String> my : details.entrySet()) {
			System.out.println(my.getKey() + " " + my.getValue());
		}
	}

}
