package com.corejava;

/**
 * Practical no:14: 
 * Write a program to demonstrate encapsulation
 * 
 * @author Bhavika
 */
public class Encapsulate {

	private String Name;
	private int Rollno;
	private int Age;

	public int getAge() {
		return Age;
	}

	public String getName() {
		return Name;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int newRollno) {
		Rollno = newRollno;
	}

	public void setName(String newName) {
		Name = newName;
	}

	public void setAge(int newAge) {
		Age = newAge;
	}

	public static void main(String[] args) {
		Encapsulate Encapsulate = new Encapsulate();
		Encapsulate.setRollno(1); // Set the value in output
		Encapsulate.setName("Bhavika");
		Encapsulate.setAge(27);

		System.out.println("Name" + Encapsulate.getName());
		System.out.println("Rollno" + Encapsulate.getRollno());
		System.out.println("Age" + Encapsulate.getAge());
	}

}

