package com.corejava;

/**
 * Practical no:15 
 * Single Inheritance
 * 
 * @author Bhavika
 */
class School {

	void teacher() {
		System.out.println("School is best Childhool memory");
	}

}

class College extends School {

	public void faculty() {
		System.out.println("College is best memory"); // It's Single Inheritance
	}

}

public class Inheritance {

	public static void main(String[] args) {
		College obj = new College();
		obj.teacher();
		obj.faculty();
	}

}
