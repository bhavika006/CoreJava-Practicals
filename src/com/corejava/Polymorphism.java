package com.corejava;

/**
 * Practical no : 16 
 * Write a program to demonstrate two types of polymorphism like compile-time and runtime polymorphism.
 *  @author Bhavika
 */
class Animal {
	public void animalsound() {
		System.out.println("The animal make sound");
	}
}

class Pig extends Animal {
	public void animalsound() {
		System.out.println("The pig say:wee wee");
	}
}

class Dog extends Animal {
	public void animalsound() {
		System.out.println("The dog say:bhov bhov");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalsound();
		myPig.animalsound();
		myDog.animalsound();
	}
}
