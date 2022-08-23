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
		List<String> lst = new ArrayList<String>();

		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("A");
		lst.add("C");
		lst.add("E");
		lst.add("E");
		lst.add("E");

		Set se =new HashSet(lst);
		lst.clear();
		lst = new ArrayList<String>(se);
		for (Object ls : lst){
			System.out.println("Resulting output---------" + ls);   
		}
	}

}
