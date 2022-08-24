package com.corejava;

/**
 * Practical no:15 
 * Single Inheritance
 * @author Bhavika
 */

class A {
	void display() {
		System.out.println("Base class");
	}
}

class B extends A {
	public void show() {
		System.out.println("Display call");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
		obj.show();
	}
}
