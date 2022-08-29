package com.corejava;

/**
 * Practical no : 15 
 * Hierarchical Inheritance
 * 
 * @author Bhavika
 */
class Fruits {

	public void fruits() {
		System.out.println("Good for health");
	}

}

class Banana extends Fruits {

	public void bananaFruits() {
		System.out.println("Strength for health is Banana");
	}

}

class Mango extends Fruits {

	public void mangoFruits() {
		System.out.println("Mango is testy");
	}

}

class Orange extends Fruits {

	public void orangeFruits() {
		System.out.println("Orange is good for health");
	}

}

public class HierarchicalInheritance {

	public static void main(String args[]) {
		Orange orange = new Orange();
		orange.fruits();
		orange.orangeFruits();
	}

}
