package com.corejava;

/**
 * Practical No : 11 Write a practical to use this/super variable.
 *
 * @author Bhavika
 */
class ThisDemo {

	String name; // Local variable
	int age;

	public void setData(String name, int age) {
		this.name = name; // Use this Same name variable parameterized variable or local variable
		this.age = age;
	}

	public void show() {

		System.out.println("My Name is " + name);
		System.out.println("My Age is " + age);
	}

}

// Parent class
class SuperDemo1 {

	String colour = "Black"; // Same name variable
}

// Child class to extends parent class
class SuperDemo2 extends SuperDemo1 {

	String colour = "White"; // Same name variable

	public void showColour() {
		System.out.println("My Favorite Colour.." + colour); // Prints color of SuperDemo2 class
		System.out.println("My Favorite Colour.." + super.colour); // Prints color of SuperDemo1 class
	}

}

public class ThisSuperVariable {

	public static void main(String args[]) {
		ThisDemo thisDemo = new ThisDemo();
		thisDemo.setData("Bhavika", 22);
		thisDemo.show();

		SuperDemo2 superDemo = new SuperDemo2();
		superDemo.showColour();
	}

}
